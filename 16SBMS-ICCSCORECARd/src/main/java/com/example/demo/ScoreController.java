package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
	@Autowired
	ScoreRepo repo;
	
	@GetMapping("/get")
	public ResponseEntity<ScoreCard> get(){
		ScoreCard s = repo.findById(1l).get();
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	@PutMapping("update")
	public void updateScore(@RequestParam Long r,@RequestParam Long w) {
		repo.updateScore(r, w);
		
	}

}
