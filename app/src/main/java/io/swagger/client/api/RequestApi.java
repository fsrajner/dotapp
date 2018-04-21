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

public interface RequestApi {
  
  /**
   * GET /request/{jobId}
   * Get parse request state
   * @param jobId The job ID to query.
   * @return Call<InlineResponse200>
   */
  
  @GET("request/{jobId}")
  Call<InlineResponse200> requestJobIdGet(
    @Path("jobId") String jobId
  );

  
  /**
   * POST /request/{match_id}
   * Submit a new parse request
   * @param matchId 
   * @return Call<InlineResponse200>
   */
  
  @POST("request/{match_id}")
  Call<InlineResponse200> requestMatchIdPost(
    @Path("match_id") Integer matchId
  );

  
}
