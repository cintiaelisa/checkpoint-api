package br.com.cee.checkpointapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cee.checkpointapi.model.Poi;
import br.com.cee.checkpointapi.services.PoiService;

@RestController
@RequestMapping(value = "/pois")
public class PoiResource {
	
	@Autowired
	private PoiService poiService;
	
	@GetMapping
	public List<Poi> getAll() {
		
		return poiService.getAll();
	}
}
