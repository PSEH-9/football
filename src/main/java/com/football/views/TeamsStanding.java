package com.football.views;

import com.football.entity.Country;
import com.football.entity.League;
import com.football.entity.Team;

public class TeamsStanding {

    private Country country;
    private League league;
    private Team team;
    private int position;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "TeamsStanding{" +
                "country=" + country +
                ", league=" + league +
                ", team=" + team +
                ", position=" + position +
                '}';
    }
}
