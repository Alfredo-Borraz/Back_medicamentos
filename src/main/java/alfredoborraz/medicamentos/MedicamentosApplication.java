package maldonadourbina.medicamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class MedicamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicamentosApplication.class, args);
	}
	@Bean
	public RestTemplate getresttemplate(){
		return new RestTemplate();

	}
}
