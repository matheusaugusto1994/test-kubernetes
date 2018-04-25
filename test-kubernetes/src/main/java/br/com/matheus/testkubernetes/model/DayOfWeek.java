package br.com.matheus.testkubernetes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DayOfWeek {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	public DayOfWeek(String name) {
		this.name = name;
	}
	
	DayOfWeek() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
