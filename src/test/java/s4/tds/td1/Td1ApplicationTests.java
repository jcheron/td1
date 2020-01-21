package s4.tds.td1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest
@AutoConfigureMockMvc
class Td1ApplicationTests {
	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
	}

	@Test
	void loadHello() throws Exception {
		ResultActions result = this.mvc.perform(get("/").contentType(MediaType.TEXT_PLAIN));
		result.andExpect(status().isOk()).andExpect(content().string("Hello world!"));
	}
}
