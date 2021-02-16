package com.avatar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avatar.model.Pokemon;

public interface PokemonDao extends JpaRepository<Pokemon, Integer>{

}
