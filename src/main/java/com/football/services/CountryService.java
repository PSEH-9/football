package com.football.services;

import com.football.entity.Country;

import java.util.List;

public interface CountryService {

    List<Country> getCountries();
    List<Country> getCountries(String apiKey);
}
