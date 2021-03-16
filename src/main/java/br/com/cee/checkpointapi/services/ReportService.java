package br.com.cee.checkpointapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cee.checkpointapi.model.Poi;
import br.com.cee.checkpointapi.model.Posicoes;
import br.com.cee.checkpointapi.repository.PoiRepository;
import br.com.cee.checkpointapi.repository.PosicoesRepository;

@Service
public class ReportService {
	
	@Autowired
	private PoiRepository poiRepository;
	@Autowired
	private PosicoesRepository posicoesRepository;
	
	public List<Posicoes> findByGeometryNear(Poi poi) {
		
		return posicoesRepository.findByGeometryNear(poi.getGeometry());
		
	}

}
