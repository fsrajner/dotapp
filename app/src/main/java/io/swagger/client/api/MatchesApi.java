package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MatchesApi {
  
  /**
   * GET /matches/{match_id}
   * Match data
   * @param matchId 
   * @return Call<InlineResponse2008>
   */
  
  @GET("matches/{match_id}")
  Call<InlineResponse2008> matchesMatchIdGet(
    @Path("match_id") Integer matchId
  );

  
}
