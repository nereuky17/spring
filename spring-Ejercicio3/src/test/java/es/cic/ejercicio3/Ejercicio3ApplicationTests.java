package es.cic.ejercicio3;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.http.MediaType;

@SpringBootTest
@AutoConfigureMockMvc
class Ejercicio3ApplicationTests {

	@Autowired
    private MockMvc mvc;

    @Test
    void testGetSaludos() throws Exception {
        mvc.perform(get("/saludos")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("[\"Hola\", \"Adios\", \"Buenos días\"]"));
    }

    @Test
    void testGetSaludo() throws Exception {
        mvc.perform(get("/saludos/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("\"Adios\""));//Sin / no pasaba el test al detectar "" como carácter
				    }

    @Test
    void testUpdateSaludo() throws Exception {
        mvc.perform(put("/saludos/1")
                .contentType(MediaType.TEXT_PLAIN)
                .content("Adios"))
                .andExpect(status().isOk())
                .andExpect(content().string("true"));
    }

    @Test
    void testDeleteSaludo() throws Exception {
        mvc.perform(delete("/saludos/2")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("true"));
    }
}
