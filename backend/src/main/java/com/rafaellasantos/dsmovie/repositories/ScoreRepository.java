package com.rafaellasantos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaellasantos.dsmovie.entities.Score;
import com.rafaellasantos.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
