package br.com.aliceraltecnologia.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aliceraltecnologia.controller.dto.PessoaDto;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

	@GetMapping
	public List<PessoaDto> lista() {
		return Arrays.asList(
				new PessoaDto("Sérgio"), 
				new PessoaDto("Lorenna"), 
				new PessoaDto("Laura"));
	}

}
