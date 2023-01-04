package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class DemoRest {

	/**
	 * Este metodo realiza el servicio dummy que retorna un mensaje de Hola Mundo
	 * @return Retorna una cadena de texto
	 */
	@GetMapping(path="/getHolaMundo")
    public String getHolaMundo() {
        return "Hola Mundo";
	}
	
	
}
