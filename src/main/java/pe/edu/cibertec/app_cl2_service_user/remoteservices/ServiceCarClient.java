package pe.edu.cibertec.app_cl2_service_user.remoteservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-cl2-service-car")
public interface ServiceCarClient {
    @GetMapping("/newcar")
    String registrarCarros();

    @GetMapping ("/obtenerCar")
    String obtenerCarros();
}
