package JOJO.s.api.repository;

import JOJO.s.api.model.Relacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionRepository extends JpaRepository<Relacion, Long> {
}

