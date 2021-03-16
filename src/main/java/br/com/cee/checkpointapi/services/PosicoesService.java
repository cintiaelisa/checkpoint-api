package br.com.cee.checkpointapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cee.checkpointapi.model.Posicoes;
import br.com.cee.checkpointapi.repository.PosicoesRepository;

@Service
public class PosicoesService {
	
	@Autowired
	PosicoesRepository posicoesRepository;

	public List<Posicoes> getAll() {
		
		return posicoesRepository.findAll();
	}

}
