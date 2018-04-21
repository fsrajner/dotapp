package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProMatchesApi {
  
  /**
   * GET /proMatches
   * Get list of pro matches
   * @param lessThanMatchId Get matches with a match ID lower than this value
   * @return Call<List<InlineResponse2006>>
   */
  
  @GET("proMatches")
  Call<List<InlineResponse2006>> proMatchesGet(
    @Query("less_than_match_id") Integer lessThanMatchId
  );

  
}
