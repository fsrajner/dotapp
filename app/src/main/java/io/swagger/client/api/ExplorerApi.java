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

public interface ExplorerApi {
  
  /**
   * GET /explorer
   * Submit arbitrary SQL queries to the database
   * @param sql The PostgreSQL query as percent-encoded string.
   * @return Call<InlineResponse200>
   */
  
  @GET("explorer")
  Call<InlineResponse200> explorerGet(
    @Query("sql") String sql
  );

  
}
