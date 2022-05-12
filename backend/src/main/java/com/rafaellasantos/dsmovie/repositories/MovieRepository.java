package com.rafaellasantos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaellasantos.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
