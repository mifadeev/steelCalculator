package fadeevmaxim.steel;

import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class SteelCalculatorTest {
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void testWeightPage() throws Exception {
		mockMvc.perform(get("/steelCalculator"))
			.andExpect(status().isOk())
			.andExpect(view().name("steelCalculator"));
		
		mockMvc.perform(post("/steelCalculator"))
			.andExpect(status().isOk())
			.andExpect(view().name("steelCalculator"));
		
		mockMvc.perform(post("/steelCircleCalculator"))
			.andExpect(status().isOk())
			.andExpect(view().name("steelCalculator"));
		
		mockMvc.perform(post("/steelPipeCalculator"))
			.andExpect(status().isOk())
			.andExpect(view().name("steelCalculator"));
		
	}
}
