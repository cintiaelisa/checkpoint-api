package br.com.cee.checkpointapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.cee.checkpointapi.model.Poi;

public interface PoiRepository extends MongoRepository<Poi, String>{
		
}
