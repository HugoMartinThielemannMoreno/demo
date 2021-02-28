package cl.hmtm.demo.persona.application;

import cl.hmtm.demo.persona.domain.Persona;
import cl.hmtm.demo.persona.domain.PersonaRepository;
import cl.hmtm.demo.persona.domain.PersonaService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonaServiceImpl implements PersonaService {
    @NonNull
    private PersonaRepository repository;

    @Override
    public Persona create(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public Persona findById(Long id) {
        return repository.findById(id).orElseGet(() -> new Persona());
    }

    @Override
    public List<Persona> findAll() {
        List<Persona> list = repository.findAll();
        if (!list.isEmpty()) {
            return list;
        }
        return new ArrayList<>();
    }

    @Override
    public Persona update(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
