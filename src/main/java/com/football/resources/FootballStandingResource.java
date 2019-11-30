package com.football.resources;


import com.codahale.metrics.annotation.Timed;
import com.football.services.FootballStandingService;
import com.football.views.TeamsStanding;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/v1/football/standing")
@Produces(MediaType.APPLICATION_JSON)
public class FootballStandingResource {

    private final FootballStandingService footballStandingService;

    public FootballStandingResource(FootballStandingService footballStandingService) {
       this.footballStandingService = footballStandingService;
    }

    @GET
    @Timed
    public List<TeamsStanding> getTeamStandings() {
        return footballStandingService.getTeamStandings();
    }

    @GET
    @Timed
    @Path("/country/{name}")
    public List<TeamsStanding> getEmployeeInvites(@PathParam("name") String countryName) {
        return footballStandingService.getTeamStandingsByCountryName(countryName);
    }

}
