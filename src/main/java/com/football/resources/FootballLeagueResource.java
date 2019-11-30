package com.football.resources;


import com.codahale.metrics.annotation.Timed;
import com.football.entity.LeagueResult;
import com.football.services.FootballLeagueService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/v1/football/league")
@Produces(MediaType.APPLICATION_JSON)
public class FootballLeagueResource {

    private final FootballLeagueService footballStandingService;

    public FootballLeagueResource(FootballLeagueService footballStandingService) {
       this.footballStandingService = footballStandingService;
    }


    @POST
    @Timed
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addInvites(List<LeagueResult> leagueResultList) {
        footballStandingService.addLeagueResults(leagueResultList);
        return "Success";
    }
}
