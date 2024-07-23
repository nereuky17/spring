package es.cic.curso.ejercicio2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.http.MediaType;

@SpringBootTest
@AutoConfigureMockMvc
class Ejercicio2ApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	void testListar() throws Exception {
		mvc.perform(get("/saludo")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}

	@Test
	void testLeer() throws Exception {
		mvc.perform(get("/saludo/{1}",1)
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}
	@Test
	void testBorrar() throws Exception {
		 mvc.perform(delete("/saludos/1",1)
                .contentType(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());

	}

}
