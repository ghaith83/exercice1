package com.example.dem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dem.model.Movies;

public interface MoviesRepository  extends JpaRepository<Movies, String>{

}
