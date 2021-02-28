package cl.hmtm.demo.persona.domain;

import java.util.List;

public interface PersonaService {
    Persona create(Persona persona);

    Persona findById(Long id);

    List<Persona> findAll();

    Persona update(Persona persona);

    void deleteById(Long id);
}
