package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2007;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LeaguesApi {
  
  /**
   * GET /leagues
   * Get league data
   * @return Call<List<InlineResponse2007>>
   */
  
  @GET("leagues")
  Call<List<InlineResponse2007>> leaguesGet();
    

  
}
