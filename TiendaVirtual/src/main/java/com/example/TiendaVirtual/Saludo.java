package com.example.TiendaVirtual;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

	@RequestMapping("/Bienvenidos")
	public String Saludo() {
		return "Bienvenidos";
		
	}
	
}
