package com.football.services;

import com.football.entity.Country;
import com.football.entity.League;
import com.football.entity.Team;
import com.football.views.TeamsStanding;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FootballStandingServiceImpl implements FootballStandingService{
    @Override
    public List<TeamsStanding> getTeamStandings() {
        List<TeamsStanding> teamsStandingList = new ArrayList<>();

        DBService.leagueResultList.forEach(leagueResult -> {
            TeamsStanding teamsStanding = new TeamsStanding();
            Team team = getTeam(leagueResult.getTeamId());
            League league = getLeague(leagueResult.getLeagueId());
            teamsStanding.setTeam(team);
            teamsStanding.setLeague(league);
            teamsStanding.setPosition(leagueResult.getPoints());
            teamsStanding.setCountry(team.getCountry());
            teamsStandingList.add(teamsStanding);
        });

        return teamsStandingList;
    }

    private Team getTeam(int teamId) {
        return DBService.teamList.stream().filter(team -> team.getId() == teamId).findFirst().get();
    }

    private League getLeague(int leagueId) {
        return DBService.leagueList.stream().filter(league -> league.getId() == leagueId).findFirst().get();
    }

    @Override
    public List<TeamsStanding> getTeamStandingsByCountryName(String countryName) {
        List<TeamsStanding> teamsStandingList = new ArrayList<>();
        Country selectedCountry = DBService.countryList.stream().filter(country -> country.getName().equals(countryName)).findFirst().get();

        List<Team> teamsList = DBService.teamList.stream().
                filter(team -> (team.getCountry().getId() ==  selectedCountry.getId())).collect(Collectors.toList());
        Set<Integer> teamIds = teamsList.stream().map(Team::getId).collect(Collectors.toSet());



        DBService.leagueResultList.forEach(leagueResult -> {
            if(teamIds.contains(leagueResult.getTeamId())) {
                TeamsStanding teamsStanding = new TeamsStanding();
                Team team = getTeam(leagueResult.getTeamId());
                League league = getLeague(leagueResult.getLeagueId());
                teamsStanding.setTeam(team);
                teamsStanding.setLeague(league);
                teamsStanding.setPosition(leagueResult.getPoints());
                teamsStanding.setCountry(team.getCountry());
                teamsStandingList.add(teamsStanding);
            }
        });
        return teamsStandingList;
    }
}
