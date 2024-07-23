package es.cic.curso.ejercicio2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludosController {

    @Autowired
    private SaludosService saludosService;

    @PostMapping()
    public long crear(@RequestBody Saludo saludo) {//Los campos que estoy espernado recibir, me van a venir en el body(@RequestBody)
        throw new UnsupportedOperationException("No implementado aún");
    }

    @GetMapping("/{id}")
    public Saludo lee(@PathVariable long id) {
        throw new UnsupportedOperationException("No implementado aún");
        
    }

    @GetMapping("/{id}")
    public List<Saludo> listar() {
        throw new UnsupportedOperationException("No implementado aún");
    }

    @PutMapping("/{id}")
    public void actualizar( @RequestBody Saludo saludo) {
        throw new UnsupportedOperationException("No implementado aún");
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable long id) {
        throw new UnsupportedOperationException("No implementado aún");

    }

}
