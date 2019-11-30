package com.football.services;

import com.football.entity.Country;
import com.football.entity.League;
import com.football.entity.LeagueResult;
import com.football.entity.Team;

import java.util.ArrayList;
import java.util.List;

public class DBService {

    public static List<Country> countryList = new ArrayList<>();
    public static List<Team> teamList = new ArrayList<>();
    public static List<League> leagueList = new ArrayList<>();
    public static List<LeagueResult> leagueResultList = new ArrayList<>();

    public DBService() {
        Country country = getCountry(1,"India");
        countryList.add(getCountry(1,"India"));
        teamList.add(getTeam(1,"IND",country));

        country = getCountry(2,"America");
        countryList.add(country);
        teamList.add(getTeam(2,"AME",country));

        country = getCountry(3,"Brazil");
        countryList.add(country);
        teamList.add(getTeam(3,"BRZ",country));

        leagueList.add(getLeague(1,"ABC"));
    }

    private League getLeague(int id, String name) {
        League league = new League();
        league.setId(id);
        league.setName(name);
        return league;
    }

    private Team getTeam(int id, String name, Country country) {
        Team team  = new Team();
        team.setId(id);
        team.setName(name);
        team.setCountry(country);
        return team;
    }

    private Country getCountry(int id, String name) {
        Country country = new Country();
        country.setId(id);
        country.setName(name);
        return country;
    }
}
