package com.example.dem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dem.model.Stars;

public interface StarsRepository extends  JpaRepository <Stars, String> {

}
