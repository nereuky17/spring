package es.cic.curso.ejercicio2;

import org.springframework.stereotype.Service;

/*
  * 
  */
@Service
public class SaludosService {

    public String saludar() {
try {
    if (Math.random() < 0.5) {
        throw new Exception();
    }
} catch (Exception e) {
    
    throw new SaludosException("Error",e);
}
        

        return this.toString();
    }

    @Override
    public String toString() {
        return "Prueba SaludosService ";
    }

    
}
