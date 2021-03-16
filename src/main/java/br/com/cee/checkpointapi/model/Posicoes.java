package br.com.cee.checkpointapi.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posicoes_new")
public class Posicoes implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Point geometry;
	private PosicaoProperties properties;
	
	public Posicoes() {
		
	}

	public Posicoes(String id, Point geometry, PosicaoProperties properties) {
		super();
		this.id = id;
		this.geometry = geometry;
		this.properties = properties;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Point getGeometry() {
		return geometry;
	}

	public void setPoint(Point geometry) {
		this.geometry = geometry;
	}

	public PosicaoProperties getProperties() {
		return properties;
	}

	public void setProperties(PosicaoProperties properties) {
		this.properties = properties;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicoes other = (Posicoes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
