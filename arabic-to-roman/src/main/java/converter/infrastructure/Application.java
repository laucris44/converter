package converter.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"converter.controller","converter.domain"})
@EntityScan("converter.domain")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}