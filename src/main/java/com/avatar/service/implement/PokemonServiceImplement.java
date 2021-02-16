package com.avatar.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


import com.avatar.commons.GenericServiceImplement;
import com.avatar.dao.PokemonDao;
import com.avatar.model.Pokemon;
import com.avatar.service.PokemonService;


public class PokemonServiceImplement extends GenericServiceImplement<Pokemon, Integer> implements PokemonService {

	
	@Autowired
	private PokemonDao pokemonDao;
	
	
	@Override
	public JpaRepository<Pokemon, Integer> getDao() {

		return pokemonDao;
	}
	
}
