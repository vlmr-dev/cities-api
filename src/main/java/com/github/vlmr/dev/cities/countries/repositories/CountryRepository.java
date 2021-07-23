package com.github.vlmr.dev.cities.countries.repositories;

import com.github.vlmr.dev.cities.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {}