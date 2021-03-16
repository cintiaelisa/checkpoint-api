package br.com.cee.checkpointapi.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "base_pois_def")
public class Poi implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	String id;
	Point geometry;
	PoiProperties properties;
	
	public Poi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Poi(String id, Point geometry, PoiProperties properties) {
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
	public PoiProperties getProperties() {
		return properties;
	}
	public void setProperties(PoiProperties properties) {
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
		Poi other = (Poi) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
