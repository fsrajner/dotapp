package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DistributionsApi {
  
  /**
   * GET /distributions
   * Distributions of MMR data by bracket and country
   * @return Call<InlineResponse2002>
   */
  
  @GET("distributions")
  Call<InlineResponse2002> distributionsGet();
    

  
}
