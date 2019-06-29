package com.devhoss.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devhoss.entidades.Respuesta;

@RestController
@RequestMapping("/factorial")
public class OperacionController {
	@GetMapping("/{numero}")
	public Respuesta getbyid(@PathVariable int numero) {
		return new Respuesta(numero,numero,"1.0");
	}
}

