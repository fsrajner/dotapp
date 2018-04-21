package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SchemaApi {
  
  /**
   * GET /schema
   * Get database schema
   * @return Call<List<InlineResponse20030>>
   */
  
  @GET("schema")
  Call<List<InlineResponse20030>> schemaGet();
    

  
}
