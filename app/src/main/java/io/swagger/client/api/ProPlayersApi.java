package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProPlayersApi {
  
  /**
   * GET /proPlayers
   * Get list of pro players
   * @return Call<List<InlineResponse20022>>
   */
  
  @GET("proPlayers")
  Call<List<InlineResponse20022>> proPlayersGet();
    

  
}
