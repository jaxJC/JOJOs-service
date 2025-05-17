package JOJO.s.api.model;

import jakarta.persistence.*;

@Entity
public class Relacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idPersonaje;
    private Long idStand;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public Long getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Long idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public Long getIdStand() {
        return idStand;
    }

    public void setIdStand(Long idStand) {
        this.idStand = idStand;
    }
}
