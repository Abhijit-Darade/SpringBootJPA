package com.example.bootjpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bootjpa.model.Alien;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AlienRepo extends JpaRepository<Alien, Integer> {
    
}
