package cl.hmtm.demo.persona.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Short edad;
}
