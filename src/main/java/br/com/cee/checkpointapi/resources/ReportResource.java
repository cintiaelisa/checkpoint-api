package br.com.cee.checkpointapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cee.checkpointapi.model.Poi;
import br.com.cee.checkpointapi.model.Posicoes;
import br.com.cee.checkpointapi.services.ReportService;

@RestController
@RequestMapping(value = "/report")
public class ReportResource {
	
	@Autowired
	private ReportService reportServices;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<List<Posicoes>> getLocationNear(@RequestBody Poi poi){
		
		System.out.println(poi);
		
		return ResponseEntity.ok().body(reportServices.findByGeometryNear(poi));
		
	}

}
