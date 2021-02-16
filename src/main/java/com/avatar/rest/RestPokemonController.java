package com.avatar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avatar.model.Pokemon;
import com.avatar.service.PokemonService;

@RestController
@RequestMapping("https://pokeapi.co/api/v2/pokemon-species")
public class RestPokemonController {
	
	
	@Autowired
	private PokemonService pokemonService;
	
	
	@GetMapping
	public List<Pokemon> listarPokemon(){
		return pokemonService.Listado();
	}

}
