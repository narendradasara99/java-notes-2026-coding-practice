package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class AAdd {
	@Autowired
	private ScoreRepo r;
	@PostConstruct
	public void add() {
		
		ScoreCard s = new ScoreCard(0l,0l);
		
		r.save(s);
		
	}

}
