package br.com.cee.checkpointapi.repository;

import java.util.List;

import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.cee.checkpointapi.model.Posicoes;


public interface PosicoesRepository extends MongoRepository<Posicoes, String> {
	
		List<Posicoes> findByGeometryNear(Point location);
	
}
