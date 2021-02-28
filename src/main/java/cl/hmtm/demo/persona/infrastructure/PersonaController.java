package cl.hmtm.demo.persona.infrastructure;

import cl.hmtm.demo.persona.domain.Persona;
import cl.hmtm.demo.persona.domain.PersonaService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping(path = "/personas")
public class PersonaController {
    @NonNull
    private PersonaService service;

    @PostMapping(path = "/")
    ResponseEntity<Persona> create(@RequestBody Persona persona) {
        return new ResponseEntity<>(service.create(persona), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    ResponseEntity<Persona> findById(@PathVariable Long id) {
        return new ResponseEntity<>(service.findById(id), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    ResponseEntity<List<Persona>> findAll() {
        return new ResponseEntity<>(service.findAll(), new HttpHeaders(), HttpStatus.OK);
    }

    @PutMapping(path = "/")
    ResponseEntity<Persona> update(@RequestBody Persona persona) {
        return new ResponseEntity<>(service.update(persona), new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    HttpStatus deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return HttpStatus.OK;
    }
}
