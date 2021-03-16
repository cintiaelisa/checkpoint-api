package br.com.cee.checkpointapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cee.checkpointapi.model.Poi;
import br.com.cee.checkpointapi.repository.PoiRepository;

@Service
public class PoiService {
	
	@Autowired
	PoiRepository poiRepository;

	public List<Poi> getAll() {
		
		return poiRepository.findAll();
	}

}
