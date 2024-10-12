package pe.edu.cibertec.app_cl2_service_user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_cl2_service_user.remoteservices.ServiceCarClient;
import pe.edu.cibertec.app_cl2_service_user.remoteservices.ServiceMantClient;

@RequiredArgsConstructor
@RestController
public class GestionUsersController {
    private final ServiceMantClient serviceMantClient;
    private final ServiceCarClient serviceCarClient;

    @GetMapping("/newuser")
    public String registrarUsuarios(){
        return  "Respuesta del servicio REGISTRAR NUEVO USUARIO";
    }

    @GetMapping("/obtenerUser")
    public String obtenerUsuarios(){
        return  "Respuesta del servicio OBTENER USUARIOS";
    }

    @GetMapping("/mant")
    public String obtenerMant(){
        return serviceMantClient.obtenerMantenimiento();
    }

    @GetMapping("/historial-mant")
    public String obtenerHistorial(){
        return serviceMantClient.obtenerHistorialMant();
    }

    @GetMapping("/newcar")
    public String registrarCarros(){
        return serviceCarClient.registrarCarros();
    }

    @GetMapping("/obtenerCar")
    public String obtenerCarros(){
        return serviceCarClient.obtenerCarros();
    }
}
