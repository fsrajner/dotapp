package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PlayersaccountIdmatchesHeroes;

import com.google.gson.annotations.SerializedName;




/**
 * Object containing information on the match
 **/
@ApiModel(description = "Object containing information on the match")
public class InlineResponse20013   {
  
  @SerializedName("kills")
  private Integer kills = null;
  
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
  
  @SerializedName("duration")
  private Integer duration = null;
  
  @SerializedName("start_time")
  private Integer startTime = null;
  
  @SerializedName("radiant_win")
  private Boolean radiantWin = null;
  
  @SerializedName("heroes")
  private PlayersaccountIdmatchesHeroes heroes = null;
  
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
  

  
  /**
   * Total kills the player had at the end of the game
   **/
  @ApiModelProperty(value = "Total kills the player had at the end of the game")
  public Integer getKills() {
    return kills;
  }
  public void setKills(Integer kills) {
    this.kills = kills;
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
   * Size of the player's party
   **/
  @ApiModelProperty(value = "Size of the player's party")
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
   * Time the game started in seconds since 1970
   **/
  @ApiModelProperty(value = "Time the game started in seconds since 1970")
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
   **/
  @ApiModelProperty(value = "")
  public PlayersaccountIdmatchesHeroes getHeroes() {
    return heroes;
  }
  public void setHeroes(PlayersaccountIdmatchesHeroes heroes) {
    this.heroes = heroes;
  }

  
  /**
   * Total assists the player had at the end of the game
   **/
  @ApiModelProperty(value = "Total assists the player had at the end of the game")
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
   * Total deaths the player had at the end of the game
   **/
  @ApiModelProperty(value = "Total deaths the player had at the end of the game")
  public Integer getDeaths() {
    return deaths;
  }
  public void setDeaths(Integer deaths) {
    this.deaths = deaths;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return Objects.equals(kills, inlineResponse20013.kills) &&
        Objects.equals(matchId, inlineResponse20013.matchId) &&
        Objects.equals(playerSlot, inlineResponse20013.playerSlot) &&
        Objects.equals(partySize, inlineResponse20013.partySize) &&
        Objects.equals(lobbyType, inlineResponse20013.lobbyType) &&
        Objects.equals(version, inlineResponse20013.version) &&
        Objects.equals(duration, inlineResponse20013.duration) &&
        Objects.equals(startTime, inlineResponse20013.startTime) &&
        Objects.equals(radiantWin, inlineResponse20013.radiantWin) &&
        Objects.equals(heroes, inlineResponse20013.heroes) &&
        Objects.equals(assists, inlineResponse20013.assists) &&
        Objects.equals(skill, inlineResponse20013.skill) &&
        Objects.equals(gameMode, inlineResponse20013.gameMode) &&
        Objects.equals(heroId, inlineResponse20013.heroId) &&
        Objects.equals(deaths, inlineResponse20013.deaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kills, matchId, playerSlot, partySize, lobbyType, version, duration, startTime, radiantWin, heroes, assists, skill, gameMode, heroId, deaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
    sb.append("    partySize: ").append(toIndentedString(partySize)).append("\n");
    sb.append("    lobbyType: ").append(toIndentedString(lobbyType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    heroes: ").append(toIndentedString(heroes)).append("\n");
    sb.append("    assists: ").append(toIndentedString(assists)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
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
