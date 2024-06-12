package io.github.grs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class AppSpringDockerExampleApplication {

	@GetMapping
	public String helloWord(){
		return "Hello word Spring Docker "+ UUID.randomUUID().toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(AppSpringDockerExampleApplication.class, args);
	}

}
