package com.football;

import com.football.resources.FootballLeagueResource;
import com.football.resources.FootballResource;
import com.football.resources.FootballStandingResource;
import com.football.services.DBService;
import com.football.services.FootballLeagueServiceImpl;
import com.football.services.FootballStandingServiceImpl;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FootballApplication extends Application<FootballConfiguration>  {

    public static void main(String[] args) throws Exception {
        new FootballApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<FootballConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(FootballConfiguration configuration,
                    Environment environment) {
        final FootballResource resource = new FootballResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        DBService dbService = new DBService();

        final FootballStandingResource footballStandingResource =
                new FootballStandingResource(new FootballStandingServiceImpl());
        final FootballLeagueResource footballLeagueResource =
                new FootballLeagueResource(new FootballLeagueServiceImpl());

        environment.jersey().register(resource);
        environment.jersey().register(footballStandingResource);
        environment.jersey().register(footballLeagueResource);
    }
}
