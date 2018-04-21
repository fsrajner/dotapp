package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20025;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RecordsApi {
  
  /**
   * GET /records/{field}
   * Get top performances in a stat
   * @param field Field name to query
   * @return Call<List<InlineResponse20025>>
   */
  
  @GET("records/{field}")
  Call<List<InlineResponse20025>> recordsFieldGet(
    @Path("field") String field
  );

  
}
