package med.vol.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	// O método run roda o tomcat, lê os arquivos do projeto e inicializa o servidor
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
