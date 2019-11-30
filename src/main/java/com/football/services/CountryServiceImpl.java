package com.football.services;

import com.football.entity.Country;

import java.util.List;

public class CountryServiceImpl implements CountryService {
    @Override
    public List<Country> getCountries() {
        return DBService.countryList;
    }

    @Override
    public List<Country> getCountries(String apiKey) {
        return null;
    }
}
