package ef.sw.sanca.concesionaria.sanca_microservicio_postventa.service;

import ef.sw.sanca.concesionaria.sanca_microservicio_postventa.model.Mantenimiento;
import ef.sw.sanca.concesionaria.sanca_microservicio_postventa.repository.MantenimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private MantenimientoRepository mantenimientoRepository;

    public Mantenimiento registrarMantenimiento(Mantenimiento mantenimiento) {
        return mantenimientoRepository.save(mantenimiento);
    }

    public List<Mantenimiento> obtenerHistorial(String clienteId) {
        return mantenimientoRepository.findByClienteId(clienteId);
    }
}