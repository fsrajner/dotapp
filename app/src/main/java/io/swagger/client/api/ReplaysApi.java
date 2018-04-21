package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ReplaysApi {
  
  /**
   * GET /replays
   * Get data to construct a replay URL with
   * @param matchId Match IDs (array)
   * @return Call<List<InlineResponse20026>>
   */
  
  @GET("replays")
  Call<List<InlineResponse20026>> replaysGet(
    @Query("match_id") Integer matchId
  );

  
}
