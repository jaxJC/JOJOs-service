package JOJO.s.api.controller;

import JOJO.s.api.model.RelacionCompleta;
import JOJO.s.api.service.GestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gestion")
public class GestionController {

    @Autowired
    private GestionService gestionService;

    @GetMapping("/relaciones")
    public List<RelacionCompleta> getRelaciones() {
        return gestionService.getRelacionesConDatos();
    }
}
