package com.software.primate.chatgpt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.flashvayne.chatgpt.service.ChatgptService;

@RestController
@RequestMapping("/questions")
public class QuestionController {
	
	private final ChatgptService chatgptService = null;
	
	@GetMapping("/enviar")
	public String enviarPeticion(@RequestParam  String mensaje) {
		String respuesta = chatgptService.sendMessage(mensaje);
		return respuesta;
	}

}
