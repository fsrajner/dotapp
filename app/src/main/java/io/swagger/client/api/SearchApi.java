package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20031;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchApi {
  
  /**
   * GET /search
   * Search players by personaname.
   * @param q Search string
   * @return Call<List<InlineResponse20031>>
   */
  
  @GET("search")
  Call<List<InlineResponse20031>> searchGet(
    @Query("q") String q
  );

  
}
