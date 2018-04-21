package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2008Chat;
import io.swagger.client.model.InlineResponse2008DraftTimings;
import io.swagger.client.model.InlineResponse2008Players;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2008   {
  
  @SerializedName("first_blood_time")
  private Integer firstBloodTime = null;
  
  @SerializedName("cluster")
  private Integer cluster = null;
  
  @SerializedName("match_seq_num")
  private Integer matchSeqNum = null;
  
  @SerializedName("replay_salt")
  private Integer replaySalt = null;
  
  @SerializedName("human_players")
  private Integer humanPlayers = null;
  
  @SerializedName("all_word_counts")
  private Object allWordCounts = null;
  
  @SerializedName("series_type")
  private Integer seriesType = null;
  
  @SerializedName("barracks_status_radiant")
  private Integer barracksStatusRadiant = null;
  
  @SerializedName("radiant_team")
  private Object radiantTeam = null;
  
  @SerializedName("cosmetics")
  private Object cosmetics = null;
  
  @SerializedName("duration")
  private Integer duration = null;
  
  @SerializedName("patch")
  private Integer patch = null;
  
  @SerializedName("loss")
  private Integer loss = null;
  
  @SerializedName("radiant_win")
  private Boolean radiantWin = null;
  
  @SerializedName("radiant_xp_adv")
  private Object radiantXpAdv = null;
  
  @SerializedName("my_word_counts")
  private Object myWordCounts = null;
  
  @SerializedName("engine")
  private Integer engine = null;
  
  @SerializedName("skill")
  private Integer skill = null;
  
  @SerializedName("negative_votes")
  private Integer negativeVotes = null;
  
  @SerializedName("picks_bans")
  private Object picksBans = null;
  
  @SerializedName("dire_team")
  private Object direTeam = null;
  
  @SerializedName("replay_url")
  private String replayUrl = null;
  
  @SerializedName("tower_status_radiant")
  private Integer towerStatusRadiant = null;
  
  @SerializedName("teamfights")
  private Object teamfights = null;
  
  @SerializedName("players")
  private List<InlineResponse2008Players> players = new ArrayList<InlineResponse2008Players>();
  
  @SerializedName("match_id")
  private Integer matchId = null;
  
  @SerializedName("league")
  private Object league = null;
  
  @SerializedName("lobby_type")
  private Integer lobbyType = null;
  
  @SerializedName("version")
  private Integer version = null;
  
  @SerializedName("series_id")
  private Integer seriesId = null;
  
  @SerializedName("start_time")
  private Integer startTime = null;
  
  @SerializedName("draft_timings")
  private List<InlineResponse2008DraftTimings> draftTimings = new ArrayList<InlineResponse2008DraftTimings>();
  
  @SerializedName("throw")
  private Integer _throw = null;
  
  @SerializedName("chat")
  private List<InlineResponse2008Chat> chat = new ArrayList<InlineResponse2008Chat>();
  
  @SerializedName("leagueid")
  private Integer leagueid = null;
  
  @SerializedName("dire_score")
  private Integer direScore = null;
  
  @SerializedName("game_mode")
  private Integer gameMode = null;
  
  @SerializedName("positive_votes")
  private Integer positiveVotes = null;
  
  @SerializedName("radiant_score")
  private Integer radiantScore = null;
  
  @SerializedName("tower_status_dire")
  private Integer towerStatusDire = null;
  
  @SerializedName("objectives")
  private Object objectives = null;
  
  @SerializedName("barracks_status_dire")
  private Integer barracksStatusDire = null;
  
  @SerializedName("region")
  private Integer region = null;
  
  @SerializedName("radiant_gold_adv")
  private Object radiantGoldAdv = null;
  

  
  /**
   * Time in seconds at which first blood occurred
   **/
  @ApiModelProperty(value = "Time in seconds at which first blood occurred")
  public Integer getFirstBloodTime() {
    return firstBloodTime;
  }
  public void setFirstBloodTime(Integer firstBloodTime) {
    this.firstBloodTime = firstBloodTime;
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
   * match_seq_num
   **/
  @ApiModelProperty(value = "match_seq_num")
  public Integer getMatchSeqNum() {
    return matchSeqNum;
  }
  public void setMatchSeqNum(Integer matchSeqNum) {
    this.matchSeqNum = matchSeqNum;
  }

  
  /**
   * replay_salt
   **/
  @ApiModelProperty(value = "replay_salt")
  public Integer getReplaySalt() {
    return replaySalt;
  }
  public void setReplaySalt(Integer replaySalt) {
    this.replaySalt = replaySalt;
  }

  
  /**
   * Number of human players in the game
   **/
  @ApiModelProperty(value = "Number of human players in the game")
  public Integer getHumanPlayers() {
    return humanPlayers;
  }
  public void setHumanPlayers(Integer humanPlayers) {
    this.humanPlayers = humanPlayers;
  }

  
  /**
   * all_word_counts
   **/
  @ApiModelProperty(value = "all_word_counts")
  public Object getAllWordCounts() {
    return allWordCounts;
  }
  public void setAllWordCounts(Object allWordCounts) {
    this.allWordCounts = allWordCounts;
  }

  
  /**
   * series_type
   **/
  @ApiModelProperty(value = "series_type")
  public Integer getSeriesType() {
    return seriesType;
  }
  public void setSeriesType(Integer seriesType) {
    this.seriesType = seriesType;
  }

  
  /**
   * Bitmask. An integer that represents a binary of which barracks are still standing. 63 would mean all barracks still stand at the end of the game.
   **/
  @ApiModelProperty(value = "Bitmask. An integer that represents a binary of which barracks are still standing. 63 would mean all barracks still stand at the end of the game.")
  public Integer getBarracksStatusRadiant() {
    return barracksStatusRadiant;
  }
  public void setBarracksStatusRadiant(Integer barracksStatusRadiant) {
    this.barracksStatusRadiant = barracksStatusRadiant;
  }

  
  /**
   * radiant_team
   **/
  @ApiModelProperty(value = "radiant_team")
  public Object getRadiantTeam() {
    return radiantTeam;
  }
  public void setRadiantTeam(Object radiantTeam) {
    this.radiantTeam = radiantTeam;
  }

  
  /**
   * cosmetics
   **/
  @ApiModelProperty(value = "cosmetics")
  public Object getCosmetics() {
    return cosmetics;
  }
  public void setCosmetics(Object cosmetics) {
    this.cosmetics = cosmetics;
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
   * Information on the patch version the game is played on
   **/
  @ApiModelProperty(value = "Information on the patch version the game is played on")
  public Integer getPatch() {
    return patch;
  }
  public void setPatch(Integer patch) {
    this.patch = patch;
  }

  
  /**
   * loss
   **/
  @ApiModelProperty(value = "loss")
  public Integer getLoss() {
    return loss;
  }
  public void setLoss(Integer loss) {
    this.loss = loss;
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
   * Array of the Radiant experience advantage at each minute in the game. A negative number means that Radiant is behind, and thus it is their experience disadvantage.
   **/
  @ApiModelProperty(value = "Array of the Radiant experience advantage at each minute in the game. A negative number means that Radiant is behind, and thus it is their experience disadvantage.")
  public Object getRadiantXpAdv() {
    return radiantXpAdv;
  }
  public void setRadiantXpAdv(Object radiantXpAdv) {
    this.radiantXpAdv = radiantXpAdv;
  }

  
  /**
   * my_word_counts
   **/
  @ApiModelProperty(value = "my_word_counts")
  public Object getMyWordCounts() {
    return myWordCounts;
  }
  public void setMyWordCounts(Object myWordCounts) {
    this.myWordCounts = myWordCounts;
  }

  
  /**
   * engine
   **/
  @ApiModelProperty(value = "engine")
  public Integer getEngine() {
    return engine;
  }
  public void setEngine(Integer engine) {
    this.engine = engine;
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
   * Number of negative votes the replay received in the in-game client
   **/
  @ApiModelProperty(value = "Number of negative votes the replay received in the in-game client")
  public Integer getNegativeVotes() {
    return negativeVotes;
  }
  public void setNegativeVotes(Integer negativeVotes) {
    this.negativeVotes = negativeVotes;
  }

  
  /**
   * Object containing information on the draft. Each pick/ban contains a boolean relating to whether the choice is a pick or a ban, the hero ID, the team the picked or banned it, and the order.
   **/
  @ApiModelProperty(value = "Object containing information on the draft. Each pick/ban contains a boolean relating to whether the choice is a pick or a ban, the hero ID, the team the picked or banned it, and the order.")
  public Object getPicksBans() {
    return picksBans;
  }
  public void setPicksBans(Object picksBans) {
    this.picksBans = picksBans;
  }

  
  /**
   * dire_team
   **/
  @ApiModelProperty(value = "dire_team")
  public Object getDireTeam() {
    return direTeam;
  }
  public void setDireTeam(Object direTeam) {
    this.direTeam = direTeam;
  }

  
  /**
   * replay_url
   **/
  @ApiModelProperty(value = "replay_url")
  public String getReplayUrl() {
    return replayUrl;
  }
  public void setReplayUrl(String replayUrl) {
    this.replayUrl = replayUrl;
  }

  
  /**
   * Bitmask. An integer that represents a binary of which Radiant towers are still standing.
   **/
  @ApiModelProperty(value = "Bitmask. An integer that represents a binary of which Radiant towers are still standing.")
  public Integer getTowerStatusRadiant() {
    return towerStatusRadiant;
  }
  public void setTowerStatusRadiant(Integer towerStatusRadiant) {
    this.towerStatusRadiant = towerStatusRadiant;
  }

  
  /**
   * teamfights
   **/
  @ApiModelProperty(value = "teamfights")
  public Object getTeamfights() {
    return teamfights;
  }
  public void setTeamfights(Object teamfights) {
    this.teamfights = teamfights;
  }

  
  /**
   * Array of information on individual players
   **/
  @ApiModelProperty(value = "Array of information on individual players")
  public List<InlineResponse2008Players> getPlayers() {
    return players;
  }
  public void setPlayers(List<InlineResponse2008Players> players) {
    this.players = players;
  }

  
  /**
   * The ID number of the match assigned by Valve
   **/
  @ApiModelProperty(value = "The ID number of the match assigned by Valve")
  public Integer getMatchId() {
    return matchId;
  }
  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  
  /**
   * league
   **/
  @ApiModelProperty(value = "league")
  public Object getLeague() {
    return league;
  }
  public void setLeague(Object league) {
    this.league = league;
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
   * Parse version, used internally by OpenDota
   **/
  @ApiModelProperty(value = "Parse version, used internally by OpenDota")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * series_id
   **/
  @ApiModelProperty(value = "series_id")
  public Integer getSeriesId() {
    return seriesId;
  }
  public void setSeriesId(Integer seriesId) {
    this.seriesId = seriesId;
  }

  
  /**
   * The Unix timestamp at which the game started
   **/
  @ApiModelProperty(value = "The Unix timestamp at which the game started")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  
  /**
   * draft_timings
   **/
  @ApiModelProperty(value = "draft_timings")
  public List<InlineResponse2008DraftTimings> getDraftTimings() {
    return draftTimings;
  }
  public void setDraftTimings(List<InlineResponse2008DraftTimings> draftTimings) {
    this.draftTimings = draftTimings;
  }

  
  /**
   * throw
   **/
  @ApiModelProperty(value = "throw")
  public Integer getThrow() {
    return _throw;
  }
  public void setThrow(Integer _throw) {
    this._throw = _throw;
  }

  
  /**
   * Array containing information on the chat of the game
   **/
  @ApiModelProperty(value = "Array containing information on the chat of the game")
  public List<InlineResponse2008Chat> getChat() {
    return chat;
  }
  public void setChat(List<InlineResponse2008Chat> chat) {
    this.chat = chat;
  }

  
  /**
   * leagueid
   **/
  @ApiModelProperty(value = "leagueid")
  public Integer getLeagueid() {
    return leagueid;
  }
  public void setLeagueid(Integer leagueid) {
    this.leagueid = leagueid;
  }

  
  /**
   * Final score for Dire (number of kills on Radiant)
   **/
  @ApiModelProperty(value = "Final score for Dire (number of kills on Radiant)")
  public Integer getDireScore() {
    return direScore;
  }
  public void setDireScore(Integer direScore) {
    this.direScore = direScore;
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
   * Number of positive votes the replay received in the in-game client
   **/
  @ApiModelProperty(value = "Number of positive votes the replay received in the in-game client")
  public Integer getPositiveVotes() {
    return positiveVotes;
  }
  public void setPositiveVotes(Integer positiveVotes) {
    this.positiveVotes = positiveVotes;
  }

  
  /**
   * Final score for Radiant (number of kills on Radiant)
   **/
  @ApiModelProperty(value = "Final score for Radiant (number of kills on Radiant)")
  public Integer getRadiantScore() {
    return radiantScore;
  }
  public void setRadiantScore(Integer radiantScore) {
    this.radiantScore = radiantScore;
  }

  
  /**
   * Bitmask. An integer that represents a binary of which Dire towers are still standing.
   **/
  @ApiModelProperty(value = "Bitmask. An integer that represents a binary of which Dire towers are still standing.")
  public Integer getTowerStatusDire() {
    return towerStatusDire;
  }
  public void setTowerStatusDire(Integer towerStatusDire) {
    this.towerStatusDire = towerStatusDire;
  }

  
  /**
   * objectives
   **/
  @ApiModelProperty(value = "objectives")
  public Object getObjectives() {
    return objectives;
  }
  public void setObjectives(Object objectives) {
    this.objectives = objectives;
  }

  
  /**
   * Bitmask. An integer that represents a binary of which barracks are still standing. 63 would mean all barracks still stand at the end of the game.
   **/
  @ApiModelProperty(value = "Bitmask. An integer that represents a binary of which barracks are still standing. 63 would mean all barracks still stand at the end of the game.")
  public Integer getBarracksStatusDire() {
    return barracksStatusDire;
  }
  public void setBarracksStatusDire(Integer barracksStatusDire) {
    this.barracksStatusDire = barracksStatusDire;
  }

  
  /**
   * Integer corresponding to the region the game was played on
   **/
  @ApiModelProperty(value = "Integer corresponding to the region the game was played on")
  public Integer getRegion() {
    return region;
  }
  public void setRegion(Integer region) {
    this.region = region;
  }

  
  /**
   * Array of the Radiant gold advantage at each minute in the game. A negative number means that Radiant is behind, and thus it is their gold disadvantage.
   **/
  @ApiModelProperty(value = "Array of the Radiant gold advantage at each minute in the game. A negative number means that Radiant is behind, and thus it is their gold disadvantage.")
  public Object getRadiantGoldAdv() {
    return radiantGoldAdv;
  }
  public void setRadiantGoldAdv(Object radiantGoldAdv) {
    this.radiantGoldAdv = radiantGoldAdv;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(firstBloodTime, inlineResponse2008.firstBloodTime) &&
        Objects.equals(cluster, inlineResponse2008.cluster) &&
        Objects.equals(matchSeqNum, inlineResponse2008.matchSeqNum) &&
        Objects.equals(replaySalt, inlineResponse2008.replaySalt) &&
        Objects.equals(humanPlayers, inlineResponse2008.humanPlayers) &&
        Objects.equals(allWordCounts, inlineResponse2008.allWordCounts) &&
        Objects.equals(seriesType, inlineResponse2008.seriesType) &&
        Objects.equals(barracksStatusRadiant, inlineResponse2008.barracksStatusRadiant) &&
        Objects.equals(radiantTeam, inlineResponse2008.radiantTeam) &&
        Objects.equals(cosmetics, inlineResponse2008.cosmetics) &&
        Objects.equals(duration, inlineResponse2008.duration) &&
        Objects.equals(patch, inlineResponse2008.patch) &&
        Objects.equals(loss, inlineResponse2008.loss) &&
        Objects.equals(radiantWin, inlineResponse2008.radiantWin) &&
        Objects.equals(radiantXpAdv, inlineResponse2008.radiantXpAdv) &&
        Objects.equals(myWordCounts, inlineResponse2008.myWordCounts) &&
        Objects.equals(engine, inlineResponse2008.engine) &&
        Objects.equals(skill, inlineResponse2008.skill) &&
        Objects.equals(negativeVotes, inlineResponse2008.negativeVotes) &&
        Objects.equals(picksBans, inlineResponse2008.picksBans) &&
        Objects.equals(direTeam, inlineResponse2008.direTeam) &&
        Objects.equals(replayUrl, inlineResponse2008.replayUrl) &&
        Objects.equals(towerStatusRadiant, inlineResponse2008.towerStatusRadiant) &&
        Objects.equals(teamfights, inlineResponse2008.teamfights) &&
        Objects.equals(players, inlineResponse2008.players) &&
        Objects.equals(matchId, inlineResponse2008.matchId) &&
        Objects.equals(league, inlineResponse2008.league) &&
        Objects.equals(lobbyType, inlineResponse2008.lobbyType) &&
        Objects.equals(version, inlineResponse2008.version) &&
        Objects.equals(seriesId, inlineResponse2008.seriesId) &&
        Objects.equals(startTime, inlineResponse2008.startTime) &&
        Objects.equals(draftTimings, inlineResponse2008.draftTimings) &&
        Objects.equals(_throw, inlineResponse2008._throw) &&
        Objects.equals(chat, inlineResponse2008.chat) &&
        Objects.equals(leagueid, inlineResponse2008.leagueid) &&
        Objects.equals(direScore, inlineResponse2008.direScore) &&
        Objects.equals(gameMode, inlineResponse2008.gameMode) &&
        Objects.equals(positiveVotes, inlineResponse2008.positiveVotes) &&
        Objects.equals(radiantScore, inlineResponse2008.radiantScore) &&
        Objects.equals(towerStatusDire, inlineResponse2008.towerStatusDire) &&
        Objects.equals(objectives, inlineResponse2008.objectives) &&
        Objects.equals(barracksStatusDire, inlineResponse2008.barracksStatusDire) &&
        Objects.equals(region, inlineResponse2008.region) &&
        Objects.equals(radiantGoldAdv, inlineResponse2008.radiantGoldAdv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstBloodTime, cluster, matchSeqNum, replaySalt, humanPlayers, allWordCounts, seriesType, barracksStatusRadiant, radiantTeam, cosmetics, duration, patch, loss, radiantWin, radiantXpAdv, myWordCounts, engine, skill, negativeVotes, picksBans, direTeam, replayUrl, towerStatusRadiant, teamfights, players, matchId, league, lobbyType, version, seriesId, startTime, draftTimings, _throw, chat, leagueid, direScore, gameMode, positiveVotes, radiantScore, towerStatusDire, objectives, barracksStatusDire, region, radiantGoldAdv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
    sb.append("    firstBloodTime: ").append(toIndentedString(firstBloodTime)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    matchSeqNum: ").append(toIndentedString(matchSeqNum)).append("\n");
    sb.append("    replaySalt: ").append(toIndentedString(replaySalt)).append("\n");
    sb.append("    humanPlayers: ").append(toIndentedString(humanPlayers)).append("\n");
    sb.append("    allWordCounts: ").append(toIndentedString(allWordCounts)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    barracksStatusRadiant: ").append(toIndentedString(barracksStatusRadiant)).append("\n");
    sb.append("    radiantTeam: ").append(toIndentedString(radiantTeam)).append("\n");
    sb.append("    cosmetics: ").append(toIndentedString(cosmetics)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    radiantXpAdv: ").append(toIndentedString(radiantXpAdv)).append("\n");
    sb.append("    myWordCounts: ").append(toIndentedString(myWordCounts)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    negativeVotes: ").append(toIndentedString(negativeVotes)).append("\n");
    sb.append("    picksBans: ").append(toIndentedString(picksBans)).append("\n");
    sb.append("    direTeam: ").append(toIndentedString(direTeam)).append("\n");
    sb.append("    replayUrl: ").append(toIndentedString(replayUrl)).append("\n");
    sb.append("    towerStatusRadiant: ").append(toIndentedString(towerStatusRadiant)).append("\n");
    sb.append("    teamfights: ").append(toIndentedString(teamfights)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    league: ").append(toIndentedString(league)).append("\n");
    sb.append("    lobbyType: ").append(toIndentedString(lobbyType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    draftTimings: ").append(toIndentedString(draftTimings)).append("\n");
    sb.append("    _throw: ").append(toIndentedString(_throw)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    leagueid: ").append(toIndentedString(leagueid)).append("\n");
    sb.append("    direScore: ").append(toIndentedString(direScore)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    positiveVotes: ").append(toIndentedString(positiveVotes)).append("\n");
    sb.append("    radiantScore: ").append(toIndentedString(radiantScore)).append("\n");
    sb.append("    towerStatusDire: ").append(toIndentedString(towerStatusDire)).append("\n");
    sb.append("    objectives: ").append(toIndentedString(objectives)).append("\n");
    sb.append("    barracksStatusDire: ").append(toIndentedString(barracksStatusDire)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    radiantGoldAdv: ").append(toIndentedString(radiantGoldAdv)).append("\n");
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
