package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20032;
import io.swagger.client.model.InlineResponse20033;
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.InlineResponse20034;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TeamsApi {
  
  /**
   * GET /teams
   * Get team data
   * @return Call<List<InlineResponse20032>>
   */
  
  @GET("teams")
  Call<List<InlineResponse20032>> teamsGet();
    

  
  /**
   * GET /teams/{team_id}
   * Get data for a team
   * @return Call<InlineResponse20032>
   */
  
  @GET("teams/{team_id}")
  Call<InlineResponse20032> teamsTeamIdGet();
    

  
  /**
   * GET /teams/{team_id}/heroes
   * Get heroes for a team
   * @return Call<InlineResponse20033>
   */
  
  @GET("teams/{team_id}/heroes")
  Call<InlineResponse20033> teamsTeamIdHeroesGet();
    

  
  /**
   * GET /teams/{team_id}/matches
   * Get matches for a team
   * @return Call<InlineResponse2006>
   */
  
  @GET("teams/{team_id}/matches")
  Call<InlineResponse2006> teamsTeamIdMatchesGet();
    

  
  /**
   * GET /teams/{team_id}/players
   * Get players who have played for a team
   * @return Call<InlineResponse20034>
   */
  
  @GET("teams/{team_id}/players")
  Call<InlineResponse20034> teamsTeamIdPlayersGet();
    

  
}
