package com.catchemall.pokemon.client;

import com.catchemall.pokemon.dto.response.Pokemon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "pokemon-consumer", url = "https://pokeapi.co/api/v2")
public interface PokemonServiceClient {
    @GetMapping(value = "/pokemon/{id}")
    Pokemon getPokemon(@PathVariable("id") Integer id);

    @GetMapping(value = "/pokemon/{name}")
    Pokemon getPokemon(@PathVariable("name") String name);
}
