package com.teste.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteImpaPar {
	
	
	@RequestMapping("/numero")
	public String calcularSquare(@RequestParam int num) {
		if (num % 2 == 0) {
			String saida = "O numero que você digitou foi o " + num + " e ele é PAR";
			return saida;
		}else {
			String saida = "O numero que você digitou foi o " + num + " e ele é IMPAR";
			return saida;
		}
	}
}
