package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PublicMatchesApi {
  
  /**
   * GET /publicMatches
   * Get list of randomly sampled public matches
   * @param mmrAscending Order by MMR ascending
   * @param mmrDescending Order by MMR descending
   * @param lessThanMatchId Get matches with a match ID lower than this value
   * @return Call<List<InlineResponse20023>>
   */
  
  @GET("publicMatches")
  Call<List<InlineResponse20023>> publicMatchesGet(
    @Query("mmr_ascending") Integer mmrAscending, @Query("mmr_descending") Integer mmrDescending, @Query("less_than_match_id") Integer lessThanMatchId
  );

  
}
