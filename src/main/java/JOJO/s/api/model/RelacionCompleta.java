package JOJO.s.api.model;

public class RelacionCompleta {
    private Long id;
    private Object personaje;
    private Object stand;

    public RelacionCompleta(Long id, Object personaje, Object stand) {
        this.id = id;
        this.personaje = personaje;
        this.stand = stand;
    }

    public Long getId() {
        return id;
    }

    public Object getPersonaje() {
        return personaje;
    }

    public Object getStand() {
        return stand;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPersonaje(Object personaje) {
        this.personaje = personaje;
    }

    public void setStand(Object stand) {
        this.stand = stand;
    }
}
