package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.InlineResponse2006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HeroesApi {
  
  /**
   * GET /heroes
   * Get hero data
   * @return Call<List<InlineResponse2004>>
   */
  
  @GET("heroes")
  Call<List<InlineResponse2004>> heroesGet();
    

  
  /**
   * GET /heroes/{hero_id}/durations
   * Get hero performance over a range of match durations
   * @return Call<List<InlineResponse2005>>
   */
  
  @GET("heroes/{hero_id}/durations")
  Call<List<InlineResponse2005>> heroesHeroIdDurationsGet();
    

  
  /**
   * GET /heroes/{hero_id}/matches
   * Get recent matches with a hero
   * @return Call<List<InlineResponse2006>>
   */
  
  @GET("heroes/{hero_id}/matches")
  Call<List<InlineResponse2006>> heroesHeroIdMatchesGet();
    

  
  /**
   * GET /heroes/{hero_id}/matchups
   * Get results against other heroes for a hero
   * @return Call<List<InlineResponse2004>>
   */
  
  @GET("heroes/{hero_id}/matchups")
  Call<List<InlineResponse2004>> heroesHeroIdMatchupsGet();
    

  
  /**
   * GET /heroes/{hero_id}/players
   * Get players who have played this hero
   * @return Call<List<List<Object>>>
   */
  
  @GET("heroes/{hero_id}/players")
  Call<List<List<Object>>> heroesHeroIdPlayersGet();
    

  
}
