package ef.sw.sanca.concesionaria.sanca_microservicio_postventa.repository;

import ef.sw.sanca.concesionaria.sanca_microservicio_postventa.model.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MantenimientoRepository extends JpaRepository<Mantenimiento, String> {
    List<Mantenimiento> findByClienteId(String clienteId);
}
