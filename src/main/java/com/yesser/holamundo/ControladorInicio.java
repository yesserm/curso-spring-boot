package com.yesser.holamundo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        log.info("ejecutando inicio");
        log.debug("mas detalle del controlador");
        return "Hola Mundo con Spring Boot 2";
    }

}
