package com.saferoute.backend.repository;

import com.saferoute.backend.entity.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IncidenteRepository extends JpaRepository<Incidente, Integer> {
    List<Incidente> findByUsuarioIdusuario(Integer idusuario);
    List<Incidente> findByZonaRiesgoId(Integer idZonaRiesgo);
}
