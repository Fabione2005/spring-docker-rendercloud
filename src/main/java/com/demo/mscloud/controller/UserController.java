package com.demo.mscloud.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

	@GetMapping(value = "/dummy",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> dummy() {
		System.out.println("hola render desde consola");
		return ResponseEntity.ok("hola renderrr desde internet");
	}

	@PostMapping(value = "/saludo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addUser(@RequestBody SaluteDto request) {

		String mensaje = request.getNombre()+" appelido: "+request.getApellido();

		String response = request.isSaludo() ? "Hola "+mensaje : "Chao "+mensaje;

		return ResponseEntity.ok(response);
	}


	
}
