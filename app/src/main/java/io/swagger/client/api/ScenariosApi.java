package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20027;
import io.swagger.client.model.InlineResponse20028;
import io.swagger.client.model.InlineResponse20029;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ScenariosApi {
  
  /**
   * GET /scenarios/itemTimings
   * Win rates for certain item timings on a hero for items that cost at least 1400 gold
   * @param item Filter by item name e.g. \&quot;spirit_vessel\&quot;
   * @param heroId Hero ID
   * @return Call<List<InlineResponse20027>>
   */
  
  @GET("scenarios/itemTimings")
  Call<List<InlineResponse20027>> scenariosItemTimingsGet(
    @Query("item") String item, @Query("hero_id") Integer heroId
  );

  
  /**
   * GET /scenarios/laneRoles
   * Win rates for heroes in certain lane roles
   * @param laneRole Filter by lane role 1-4 (Safe, Mid, Off, Jungle)
   * @param heroId Hero ID
   * @return Call<List<InlineResponse20028>>
   */
  
  @GET("scenarios/laneRoles")
  Call<List<InlineResponse20028>> scenariosLaneRolesGet(
    @Query("lane_role") String laneRole, @Query("hero_id") Integer heroId
  );

  
  /**
   * GET /scenarios/misc
   * Miscellaneous team scenarios
   * @param scenario pos_chat_1min,neg_chat_1min,courier_kill,first_blood
   * @return Call<List<InlineResponse20029>>
   */
  
  @GET("scenarios/misc")
  Call<List<InlineResponse20029>> scenariosMiscGet(
    @Query("scenario") String scenario
  );

  
}
