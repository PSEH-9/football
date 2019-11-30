package com.football.services;

import com.football.views.TeamsStanding;

import java.util.List;

public interface FootballStandingService {

    List<TeamsStanding> getTeamStandings();
    List<TeamsStanding> getTeamStandingsByCountryName(String countryName);
}
