package pe.edu.cibertec.app_cl2_service_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppCl2ServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCl2ServiceUserApplication.class, args);
	}

}
