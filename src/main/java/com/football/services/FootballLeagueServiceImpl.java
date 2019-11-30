package com.football.services;

import com.football.entity.LeagueResult;

import java.util.List;

public class FootballLeagueServiceImpl implements FootballLeagueService {
    @Override
    public void addLeagueResults(List<LeagueResult> leagueResultList) {
        DBService.leagueResultList.addAll(leagueResultList);
    }
}
