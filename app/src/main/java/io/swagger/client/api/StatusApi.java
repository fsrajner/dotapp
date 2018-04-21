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

public interface StatusApi {
  
  /**
   * GET /admin/apiMetrics
   * Get API request metrics
   * @return Call<InlineResponse200>
   */
  
  @GET("admin/apiMetrics")
  Call<InlineResponse200> adminApiMetricsGet();
    

  
  /**
   * GET /status
   * Get current service statistics
   * @return Call<InlineResponse200>
   */
  
  @GET("status")
  Call<InlineResponse200> statusGet();
    

  
}
