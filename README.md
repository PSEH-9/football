For compiling use:
mvn clean install

For running use:
java -jar target/football-1.0-SNAPSHOT.jar server football.yml

After will expose api:
1. GET  : http://localhost:8080/v1/football/standing -- get all standings
2. POST : http://localhost:8080/v1/football/league -- for posting invites like
        Payload : [{ "leagueId" : 1, "teamId" : 1, "points" : 10 },{ "leagueId" : 1, "teamId" : 2, "points" : 8 },
                  { "leagueId" : 1, "teamId" : 3, "points" : 15 }]
