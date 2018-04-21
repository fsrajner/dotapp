package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse2009;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MetadataApi {
  
  /**
   * GET /metadata
   * Site metadata
   * @return Call<InlineResponse2009>
   */
  
  @GET("metadata")
  Call<InlineResponse2009> metadataGet();
    

  
}
