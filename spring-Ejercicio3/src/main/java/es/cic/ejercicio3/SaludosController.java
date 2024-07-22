package es.cic.ejercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/saludos")
public class SaludosController {
    @Autowired
    private SaludosService saludosService;

    @GetMapping
    public List<String> getSaludos() {
        return saludosService.getSaludos();
    }

    @GetMapping("/{id}")
    public Optional<String> getSaludo(@PathVariable int id) {
        return saludosService.getSaludo(id);
    }

    @PutMapping("/{id}")
    public boolean updateSaludo(@PathVariable int id, @RequestBody String nuevoSaludo) {
        return saludosService.updateSaludo(id, nuevoSaludo);
    }

    @DeleteMapping("/{id}")
    public boolean deleteSaludo(@PathVariable int id) {
        return saludosService.deleteSaludo(id);
    }
}
