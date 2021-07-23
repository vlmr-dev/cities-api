package com.github.vlmr.dev.cities.states.repositories;

import com.github.vlmr.dev.cities.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {}
