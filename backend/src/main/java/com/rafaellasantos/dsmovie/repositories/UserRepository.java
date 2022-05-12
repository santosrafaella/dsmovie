package com.rafaellasantos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaellasantos.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
