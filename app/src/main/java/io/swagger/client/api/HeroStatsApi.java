package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HeroStatsApi {
  
  /**
   * GET /heroStats
   * Get stats about hero performance in recent matches
   * @return Call<List<InlineResponse2003>>
   */
  
  @GET("heroStats")
  Call<List<InlineResponse2003>> heroStatsGet();
    

  
}
