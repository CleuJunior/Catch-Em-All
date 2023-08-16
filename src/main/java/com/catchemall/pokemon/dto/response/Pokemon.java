package com.catchemall.pokemon.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record Pokemon(Integer id, String name, @JsonProperty("base_experience") Integer baseExperience, Integer height,
                      Integer weight, @JsonProperty("held_items") List<HeldItem> heldItems, List<Ability> abilities,
                      List<Stat> stats, List<Type> types) { }