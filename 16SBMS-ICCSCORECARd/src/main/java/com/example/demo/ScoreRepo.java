package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface ScoreRepo extends JpaRepository<ScoreCard, Long> {
	@Modifying
	@Transactional
	@Query("UPDATE ScoreCard s SET s.runs = :runs, s.wickets = :wickets WHERE s.id = 1")
	public int updateScore(Long runs, Long wickets);

}
