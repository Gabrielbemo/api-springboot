package com.gabrielbemo.lab.apispringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/carros")
public class CarroController {
	
	@GetMapping
	public ResponseEntity<String> ok(){
		return new ResponseEntity<String>("ola", HttpStatus.OK);
	}
}
