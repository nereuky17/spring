package es.cic.ejercicio3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SaludosService {

    private List<String> saludos = new ArrayList<>();

    public SaludosService() {
        // Inicializar algunos saludos por defecto
        saludos.add("Hola");
        saludos.add("Adios");
        saludos.add("Buenos días");
    }

    public List<String> getSaludos() {
        return saludos;
    }

    public Optional<String> getSaludo(int id) {
        if (id >= 0 && id < saludos.size()) {
            return Optional.of(saludos.get(id));
        }
        return Optional.empty();
    }

    public boolean updateSaludo(int id, String nuevoSaludo) {
        if (id >= 0 && id < saludos.size()) {
            saludos.set(id, nuevoSaludo);
            return true;
        }
        return false;
    }

    public boolean deleteSaludo(int id) {
        if (id >= 0 && id < saludos.size()) {
            saludos.remove(id);
            return true;
        }
        return false;
    }
}
