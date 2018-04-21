package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.InlineResponse20010;
import io.swagger.client.model.InlineResponse20011;
import io.swagger.client.model.InlineResponse20012;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse20013;
import io.swagger.client.model.InlineResponse20014;
import io.swagger.client.model.InlineResponse20015;
import io.swagger.client.model.InlineResponse20016;
import io.swagger.client.model.InlineResponse20017;
import io.swagger.client.model.InlineResponse20018;
import io.swagger.client.model.InlineResponse20019;
import io.swagger.client.model.InlineResponse20020;
import io.swagger.client.model.InlineResponse20021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PlayersApi {
  
  /**
   * GET /players/{account_id}
   * Player data
   * @param accountId Steam32 account ID
   * @return Call<InlineResponse20010>
   */
  
  @GET("players/{account_id}")
  Call<InlineResponse20010> playersAccountIdGet(
    @Path("account_id") Integer accountId
  );

  
  /**
   * GET /players/{account_id}/counts
   * Counts in categories
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<InlineResponse20011>
   */
  
  @GET("players/{account_id}/counts")
  Call<InlineResponse20011> playersAccountIdCountsGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
  /**
   * GET /players/{account_id}/heroes
   * Heroes played
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<List<InlineResponse20012>>
   */
  
  @GET("players/{account_id}/heroes")
  Call<List<InlineResponse20012>> playersAccountIdHeroesGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
  /**
   * GET /players/{account_id}/histograms
   * Distribution of matches in a single stat
   * @param accountId Steam32 account ID
   * @param field Field to aggregate on
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<List<InlineResponse200>>
   */
  
  @GET("players/{account_id}/histograms/{field}")
  Call<List<InlineResponse200>> playersAccountIdHistogramsFieldGet(
    @Path("account_id") Integer accountId, @Path("field") String field, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
  /**
   * GET /players/{account_id}/matches
   * Matches played
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @param project Fields to project (array)
   * @return Call<List<InlineResponse20013>>
   */
  
  @GET("players/{account_id}/matches")
  Call<List<InlineResponse20013>> playersAccountIdMatchesGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort, @Query("project") String project
  );

  
  /**
   * GET /players/{account_id}/peers
   * Players played with
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<List<InlineResponse20014>>
   */
  
  @GET("players/{account_id}/peers")
  Call<List<InlineResponse20014>> playersAccountIdPeersGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
  /**
   * GET /players/{account_id}/pros
   * Pro players played with
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<List<InlineResponse20015>>
   */
  
  @GET("players/{account_id}/pros")
  Call<List<InlineResponse20015>> playersAccountIdProsGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
  /**
   * GET /players/{account_id}/rankings
   * Player hero rankings
   * @param accountId Steam32 account ID
   * @return Call<List<InlineResponse200>>
   */
  
  @GET("players/{account_id}/rankings")
  Call<List<InlineResponse200>> playersAccountIdRankingsGet(
    @Path("account_id") Integer accountId
  );

  
  /**
   * GET /players/{account_id}/ratings
   * Player rating history
   * @param accountId Steam32 account ID
   * @return Call<List<InlineResponse20016>>
   */
  
  @GET("players/{account_id}/ratings")
  Call<List<InlineResponse20016>> playersAccountIdRatingsGet(
    @Path("account_id") Integer accountId
  );

  
  /**
   * GET /players/{account_id}/recentMatches
   * Recent matches played
   * @return Call<List<InlineResponse20017>>
   */
  
  @GET("players/{account_id}/recentMatches")
  Call<List<InlineResponse20017>> playersAccountIdRecentMatchesGet();
    

  
  /**
   * POST /players/{account_id}/refresh
   * Refresh player match history
   * @param accountId Steam32 account ID
   * @return Call<InlineResponse200>
   */
  
  @POST("players/{account_id}/refresh")
  Call<InlineResponse200> playersAccountIdRefreshPost(
    @Path("account_id") Integer accountId
  );

  
  /**
   * GET /players/{account_id}/totals
   * Totals in stats
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<List<InlineResponse20018>>
   */
  
  @GET("players/{account_id}/totals")
  Call<List<InlineResponse20018>> playersAccountIdTotalsGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
  /**
   * GET /players/{account_id}/wardmap
   * Wards placed in matches played
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<InlineResponse20019>
   */
  
  @GET("players/{account_id}/wardmap")
  Call<InlineResponse20019> playersAccountIdWardmapGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
  /**
   * GET /players/{account_id}/wl
   * Win/Loss count
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<InlineResponse20020>
   */
  
  @GET("players/{account_id}/wl")
  Call<InlineResponse20020> playersAccountIdWlGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
  /**
   * GET /players/{account_id}/wordcloud
   * Words said/read in matches played
   * @param accountId Steam32 account ID
   * @param limit Number of matches to limit to
   * @param offset Number of matches to offset start by
   * @param win Whether the player won
   * @param patch Patch ID
   * @param gameMode Game Mode ID
   * @param lobbyType Lobby type ID
   * @param region Region ID
   * @param date Days previous
   * @param laneRole Lane Role ID
   * @param heroId Hero ID
   * @param isRadiant Whether the player was radiant
   * @param includedAccountId Account IDs in the match (array)
   * @param excludedAccountId Account IDs not in the match (array)
   * @param withHeroId Hero IDs on the player&#39;s team (array)
   * @param againstHeroId Hero IDs against the player&#39;s team (array)
   * @param significant Whether the match was significant for aggregation purposes
   * @param having The minimum number of games played, for filtering hero stats
   * @param sort The field to return matches sorted by in descending order
   * @return Call<InlineResponse20021>
   */
  
  @GET("players/{account_id}/wordcloud")
  Call<InlineResponse20021> playersAccountIdWordcloudGet(
    @Path("account_id") Integer accountId, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("win") Integer win, @Query("patch") Integer patch, @Query("game_mode") Integer gameMode, @Query("lobby_type") Integer lobbyType, @Query("region") Integer region, @Query("date") Integer date, @Query("lane_role") Integer laneRole, @Query("hero_id") Integer heroId, @Query("is_radiant") Integer isRadiant, @Query("included_account_id") Integer includedAccountId, @Query("excluded_account_id") Integer excludedAccountId, @Query("with_hero_id") Integer withHeroId, @Query("against_hero_id") Integer againstHeroId, @Query("significant") Integer significant, @Query("having") Integer having, @Query("sort") String sort
  );

  
}
