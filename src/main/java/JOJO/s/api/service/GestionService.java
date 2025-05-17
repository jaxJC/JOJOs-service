package JOJO.s.api.service;

import JOJO.s.api.model.Relacion;
import JOJO.s.api.model.RelacionCompleta;
import JOJO.s.api.repository.GestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class GestionService {

    @Autowired
    private GestionRepository gestionRepository;

    private final RestTemplate restTemplate = new RestTemplate();

    private final String API_PERSONAJES = "http://localhost:8080/api/v1/Jojos";
    private final String API_STANDS = "http://localhost:3002/stands/";

    public List<RelacionCompleta> getRelacionesConDatos() {
        List<Relacion> relaciones = gestionRepository.findAll();
        List<RelacionCompleta> resultado = new ArrayList<>();

        for (Relacion r : relaciones) {
            Object personaje = null;
            Object stand = null;

            try {
                personaje = restTemplate.getForObject(API_PERSONAJES + r.getIdPersonaje(), Object.class);
            } catch (Exception e) {
                System.out.println("Error al obtener personaje " + r.getIdPersonaje());
            }

            try {
                stand = restTemplate.getForObject(API_STANDS + r.getIdStand(), Object.class);
            } catch (Exception e) {
                System.out.println("Error al obtener stand " + r.getIdStand());
            }

            resultado.add(new RelacionCompleta(r.getId(), personaje, stand));
        }

        return resultado;
    }
}
