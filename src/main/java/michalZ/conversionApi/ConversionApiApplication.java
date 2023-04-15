package michalZ.conversionApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConversionApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionApiApplication.class, args);
	}

}
