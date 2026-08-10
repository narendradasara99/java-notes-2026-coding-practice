package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ScoreCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long runs;

	private Long wickets;

	public ScoreCard(Long runs, Long wickets) {
		super();
		this.runs = runs;
		this.wickets = wickets;
	}

	public ScoreCard() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRuns() {
		return runs;
	}

	public void setRuns(Long runs) {
		this.runs = runs;
	}

	public Long getWickets() {
		return wickets;
	}

	public void setWickets(Long wickets) {
		this.wickets = wickets;
	}
	
	

}
