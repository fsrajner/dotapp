package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HealthApi {
  
  /**
   * GET /health
   * Get service health data
   * @return Call<InlineResponse200>
   */
  
  @GET("health")
  Call<InlineResponse200> healthGet();
    

  
}
