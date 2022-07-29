package br.org.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {

	@GetMapping
	public String helloW() {
		return "Hello World";
	}
	 @GetMapping("/bsm")
	  public String bsm(){
	    return "<ul><h2>Mentalidade:</h2>" +
	        "<li>Orientação ao futuro</li>" +
	        "<li>Responsabilidade pessoal</li>" +
	        "<li>Mentalidade de Crescimento</li>" +
	        "<li>Persistência</li>" +
	        "<h2>Habilidades:</h2>" +
	        "<li>Trabalho em Equipe</li>" +
	        "<li>Orientação aos Detalhes</li>" +
	        "<li>Proatividade</li>" +
	        "<li>Comunicação</li></ul>";
	  }

	  @GetMapping("/objetivos")
	  public String objetivos(){
	    return "Conseguir compreender todo o conteúdo e realizar as atividades!";
	  }
}
