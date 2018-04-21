package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * match
 **/
@ApiModel(description = "match")
public class InlineResponse20017   {
  
  @SerializedName("kills")
  private Integer kills = null;
  
  @SerializedName("cluster")
  private Integer cluster = null;
  
  @SerializedName("is_roaming")
  private Boolean isRoaming = null;
  
  @SerializedName("match_id")
  private Integer matchId = null;
  
  @SerializedName("player_slot")
  private Integer playerSlot = null;
  
  @SerializedName("party_size")
  private Integer partySize = null;
  
  @SerializedName("lobby_type")
  private Integer lobbyType = null;
  
  @SerializedName("version")
  private Integer version = null;
  
  @SerializedName("lane_role")
  private Integer laneRole = null;
  
  @SerializedName("duration")
  private Integer duration = null;
  
  @SerializedName("start_time")
  private Integer startTime = null;
  
  @SerializedName("radiant_win")
  private Boolean radiantWin = null;
  
  @SerializedName("leaver_status")
  private Integer leaverStatus = null;
  
  @SerializedName("assists")
  private Integer assists = null;
  
  @SerializedName("skill")
  private Integer skill = null;
  
  @SerializedName("game_mode")
  private Integer gameMode = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  
  @SerializedName("deaths")
  private Integer deaths = null;
  
  @SerializedName("lane")
  private Integer lane = null;
  

  
  /**
   * Total kills the player had at the end of the match
   **/
  @ApiModelProperty(value = "Total kills the player had at the end of the match")
  public Integer getKills() {
    return kills;
  }
  public void setKills(Integer kills) {
    this.kills = kills;
  }

  
  /**
   * cluster
   **/
  @ApiModelProperty(value = "cluster")
  public Integer getCluster() {
    return cluster;
  }
  public void setCluster(Integer cluster) {
    this.cluster = cluster;
  }

  
  /**
   * Boolean describing whether or not the player roamed
   **/
  @ApiModelProperty(value = "Boolean describing whether or not the player roamed")
  public Boolean getIsRoaming() {
    return isRoaming;
  }
  public void setIsRoaming(Boolean isRoaming) {
    this.isRoaming = isRoaming;
  }

  
  /**
   * Match ID
   **/
  @ApiModelProperty(value = "Match ID")
  public Integer getMatchId() {
    return matchId;
  }
  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  
  /**
   * Which slot the player is in. 0-127 are Radiant, 128-255 are Dire
   **/
  @ApiModelProperty(value = "Which slot the player is in. 0-127 are Radiant, 128-255 are Dire")
  public Integer getPlayerSlot() {
    return playerSlot;
  }
  public void setPlayerSlot(Integer playerSlot) {
    this.playerSlot = playerSlot;
  }

  
  /**
   * Size of the players party. If not in a party, will return 1.
   **/
  @ApiModelProperty(value = "Size of the players party. If not in a party, will return 1.")
  public Integer getPartySize() {
    return partySize;
  }
  public void setPartySize(Integer partySize) {
    this.partySize = partySize;
  }

  
  /**
   * Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json
   **/
  @ApiModelProperty(value = "Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json")
  public Integer getLobbyType() {
    return lobbyType;
  }
  public void setLobbyType(Integer lobbyType) {
    this.lobbyType = lobbyType;
  }

  
  /**
   * version
   **/
  @ApiModelProperty(value = "version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * lane_role
   **/
  @ApiModelProperty(value = "lane_role")
  public Integer getLaneRole() {
    return laneRole;
  }
  public void setLaneRole(Integer laneRole) {
    this.laneRole = laneRole;
  }

  
  /**
   * Duration of the game in seconds
   **/
  @ApiModelProperty(value = "Duration of the game in seconds")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Start time of the match in seconds elapsed since 1970
   **/
  @ApiModelProperty(value = "Start time of the match in seconds elapsed since 1970")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Boolean indicating whether Radiant won the match
   **/
  @ApiModelProperty(value = "Boolean indicating whether Radiant won the match")
  public Boolean getRadiantWin() {
    return radiantWin;
  }
  public void setRadiantWin(Boolean radiantWin) {
    this.radiantWin = radiantWin;
  }

  
  /**
   * Integer describing whether or not the player left the game. 0: didn't leave. 1: left safely. 2+: Abandoned
   **/
  @ApiModelProperty(value = "Integer describing whether or not the player left the game. 0: didn't leave. 1: left safely. 2+: Abandoned")
  public Integer getLeaverStatus() {
    return leaverStatus;
  }
  public void setLeaverStatus(Integer leaverStatus) {
    this.leaverStatus = leaverStatus;
  }

  
  /**
   * Total assists the player had at the end of the match
   **/
  @ApiModelProperty(value = "Total assists the player had at the end of the match")
  public Integer getAssists() {
    return assists;
  }
  public void setAssists(Integer assists) {
    this.assists = assists;
  }

  
  /**
   * Skill bracket assigned by Valve (Normal, High, Very High)
   **/
  @ApiModelProperty(value = "Skill bracket assigned by Valve (Normal, High, Very High)")
  public Integer getSkill() {
    return skill;
  }
  public void setSkill(Integer skill) {
    this.skill = skill;
  }

  
  /**
   * Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json
   **/
  @ApiModelProperty(value = "Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json")
  public Integer getGameMode() {
    return gameMode;
  }
  public void setGameMode(Integer gameMode) {
    this.gameMode = gameMode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHeroId() {
    return heroId;
  }
  public void setHeroId(Integer heroId) {
    this.heroId = heroId;
  }

  
  /**
   * Total deaths the player had at the end of the match
   **/
  @ApiModelProperty(value = "Total deaths the player had at the end of the match")
  public Integer getDeaths() {
    return deaths;
  }
  public void setDeaths(Integer deaths) {
    this.deaths = deaths;
  }

  
  /**
   * Integer corresponding to which lane the player laned in for the match
   **/
  @ApiModelProperty(value = "Integer corresponding to which lane the player laned in for the match")
  public Integer getLane() {
    return lane;
  }
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;
    return Objects.equals(kills, inlineResponse20017.kills) &&
        Objects.equals(cluster, inlineResponse20017.cluster) &&
        Objects.equals(isRoaming, inlineResponse20017.isRoaming) &&
        Objects.equals(matchId, inlineResponse20017.matchId) &&
        Objects.equals(playerSlot, inlineResponse20017.playerSlot) &&
        Objects.equals(partySize, inlineResponse20017.partySize) &&
        Objects.equals(lobbyType, inlineResponse20017.lobbyType) &&
        Objects.equals(version, inlineResponse20017.version) &&
        Objects.equals(laneRole, inlineResponse20017.laneRole) &&
        Objects.equals(duration, inlineResponse20017.duration) &&
        Objects.equals(startTime, inlineResponse20017.startTime) &&
        Objects.equals(radiantWin, inlineResponse20017.radiantWin) &&
        Objects.equals(leaverStatus, inlineResponse20017.leaverStatus) &&
        Objects.equals(assists, inlineResponse20017.assists) &&
        Objects.equals(skill, inlineResponse20017.skill) &&
        Objects.equals(gameMode, inlineResponse20017.gameMode) &&
        Objects.equals(heroId, inlineResponse20017.heroId) &&
        Objects.equals(deaths, inlineResponse20017.deaths) &&
        Objects.equals(lane, inlineResponse20017.lane);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kills, cluster, isRoaming, matchId, playerSlot, partySize, lobbyType, version, laneRole, duration, startTime, radiantWin, leaverStatus, assists, skill, gameMode, heroId, deaths, lane);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    isRoaming: ").append(toIndentedString(isRoaming)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
    sb.append("    partySize: ").append(toIndentedString(partySize)).append("\n");
    sb.append("    lobbyType: ").append(toIndentedString(lobbyType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    laneRole: ").append(toIndentedString(laneRole)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    leaverStatus: ").append(toIndentedString(leaverStatus)).append("\n");
    sb.append("    assists: ").append(toIndentedString(assists)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
    sb.append("    lane: ").append(toIndentedString(lane)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
