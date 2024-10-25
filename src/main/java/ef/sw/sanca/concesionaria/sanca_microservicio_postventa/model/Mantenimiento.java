package ef.sw.sanca.concesionaria.sanca_microservicio_postventa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mantenimiento {
    @Id
    private String id;
    private String clienteId;
    private String tipoServicio;
    private String fecha;
}