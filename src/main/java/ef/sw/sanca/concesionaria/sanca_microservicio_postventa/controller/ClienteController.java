package ef.sw.sanca.concesionaria.sanca_microservicio_postventa.controller;

import ef.sw.sanca.concesionaria.sanca_microservicio_postventa.model.Mantenimiento;
import ef.sw.sanca.concesionaria.sanca_microservicio_postventa.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/mantenimientos")
    public Mantenimiento registrarMantenimiento(@RequestBody Mantenimiento mantenimiento) {
        return clienteService.registrarMantenimiento(mantenimiento);
    }

    @GetMapping("/{clienteId}/historial")
    public List<Mantenimiento> obtenerHistorial(@PathVariable String clienteId) {
        return clienteService.obtenerHistorial(clienteId);
    }
}