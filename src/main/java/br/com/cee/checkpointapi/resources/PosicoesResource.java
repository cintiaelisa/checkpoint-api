package br.com.cee.checkpointapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cee.checkpointapi.model.Posicoes;
import br.com.cee.checkpointapi.services.PosicoesService;

@RestController
@RequestMapping(value = "/posicoes")
public class PosicoesResource {
	
	@Autowired
	private PosicoesService posicoesService;
	
	@GetMapping
	public ResponseEntity<List<Posicoes>> getAll() {
		
		List<Posicoes> list = posicoesService.getAll();
		
		return ResponseEntity.ok().body(list);
	}

}
