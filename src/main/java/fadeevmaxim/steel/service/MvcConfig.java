package fadeevmaxim.steel.service;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
					.addResourceHandler("/static/css/**")
					.addResourceLocations("classpath:/static/css/");
		registry
					.addResourceHandler("static/js/**")
					.addResourceLocations("classpath:/static/js/");
		registry
		.addResourceHandler("static/image/**")
		.addResourceLocations("classpath:/static/image/");
		
	}
	
}
