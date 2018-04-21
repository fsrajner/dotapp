package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BenchmarksApi {
  
  /**
   * GET /benchmarks
   * Benchmarks of average stat values for a hero
   * @param heroId Hero ID
   * @return Call<InlineResponse2001>
   */
  
  @GET("benchmarks")
  Call<InlineResponse2001> benchmarksGet(
    @Query("hero_id") String heroId
  );

  
}
