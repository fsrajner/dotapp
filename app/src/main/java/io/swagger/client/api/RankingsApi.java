package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RankingsApi {
  
  /**
   * GET /rankings
   * Top players by hero
   * @param heroId Hero ID
   * @return Call<InlineResponse20024>
   */
  
  @GET("rankings")
  Call<InlineResponse20024> rankingsGet(
    @Query("hero_id") String heroId
  );

  
}
