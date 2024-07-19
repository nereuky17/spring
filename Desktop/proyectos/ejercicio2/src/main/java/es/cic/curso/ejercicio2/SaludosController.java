package es.cic.curso.ejercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludosController  {
    
    @Autowired
    private SaludosService saludosService;

    @GetMapping("/saludos")
    public String saludar(){
       
    return saludosService.saludar();
    }

    


    
}
