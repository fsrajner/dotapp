package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2006   {
  
  @SerializedName("match_id")
  private Integer matchId = null;
  
  @SerializedName("league_name")
  private String leagueName = null;
  
  @SerializedName("series_type")
  private Integer seriesType = null;
  
  @SerializedName("radiant")
  private Boolean radiant = null;
  
  @SerializedName("series_id")
  private Integer seriesId = null;
  
  @SerializedName("duration")
  private Integer duration = null;
  
  @SerializedName("start_time")
  private Integer startTime = null;
  
  @SerializedName("radiant_name")
  private String radiantName = null;
  
  @SerializedName("radiant_win")
  private Boolean radiantWin = null;
  
  @SerializedName("dire_name")
  private String direName = null;
  
  @SerializedName("leagueid")
  private Integer leagueid = null;
  
  @SerializedName("dire_score")
  private Integer direScore = null;
  
  @SerializedName("radiant_team_id")
  private Integer radiantTeamId = null;
  
  @SerializedName("radiant_score")
  private Integer radiantScore = null;
  
  @SerializedName("dire_team_id")
  private Integer direTeamId = null;
  

  
  /**
   * Used to identify individual matches, e.g. 3703866531
   **/
  @ApiModelProperty(value = "Used to identify individual matches, e.g. 3703866531")
  public Integer getMatchId() {
    return matchId;
  }
  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  
  /**
   * Name of league the match took place in
   **/
  @ApiModelProperty(value = "Name of league the match took place in")
  public String getLeagueName() {
    return leagueName;
  }
  public void setLeagueName(String leagueName) {
    this.leagueName = leagueName;
  }

  
  /**
   * Type of series the match was
   **/
  @ApiModelProperty(value = "Type of series the match was")
  public Integer getSeriesType() {
    return seriesType;
  }
  public void setSeriesType(Integer seriesType) {
    this.seriesType = seriesType;
  }

  
  /**
   * Whether the team/player/hero was on Radiant
   **/
  @ApiModelProperty(value = "Whether the team/player/hero was on Radiant")
  public Boolean getRadiant() {
    return radiant;
  }
  public void setRadiant(Boolean radiant) {
    this.radiant = radiant;
  }

  
  /**
   * Identifier for the series of the match
   **/
  @ApiModelProperty(value = "Identifier for the series of the match")
  public Integer getSeriesId() {
    return seriesId;
  }
  public void setSeriesId(Integer seriesId) {
    this.seriesId = seriesId;
  }

  
  /**
   * Length of the match
   **/
  @ApiModelProperty(value = "Length of the match")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Unix timestamp of when the match began
   **/
  @ApiModelProperty(value = "Unix timestamp of when the match began")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The Radiant's team name
   **/
  @ApiModelProperty(value = "The Radiant's team name")
  public String getRadiantName() {
    return radiantName;
  }
  public void setRadiantName(String radiantName) {
    this.radiantName = radiantName;
  }

  
  /**
   * Whether or not the Radiant won the match
   **/
  @ApiModelProperty(value = "Whether or not the Radiant won the match")
  public Boolean getRadiantWin() {
    return radiantWin;
  }
  public void setRadiantWin(Boolean radiantWin) {
    this.radiantWin = radiantWin;
  }

  
  /**
   * The Dire's team name
   **/
  @ApiModelProperty(value = "The Dire's team name")
  public String getDireName() {
    return direName;
  }
  public void setDireName(String direName) {
    this.direName = direName;
  }

  
  /**
   * Identifier for the league the match took place in
   **/
  @ApiModelProperty(value = "Identifier for the league the match took place in")
  public Integer getLeagueid() {
    return leagueid;
  }
  public void setLeagueid(Integer leagueid) {
    this.leagueid = leagueid;
  }

  
  /**
   * Number of kills the Dire team had when the match ended
   **/
  @ApiModelProperty(value = "Number of kills the Dire team had when the match ended")
  public Integer getDireScore() {
    return direScore;
  }
  public void setDireScore(Integer direScore) {
    this.direScore = direScore;
  }

  
  /**
   * The Radiant's team_id
   **/
  @ApiModelProperty(value = "The Radiant's team_id")
  public Integer getRadiantTeamId() {
    return radiantTeamId;
  }
  public void setRadiantTeamId(Integer radiantTeamId) {
    this.radiantTeamId = radiantTeamId;
  }

  
  /**
   * Number of kills the Radiant team had when the match ended
   **/
  @ApiModelProperty(value = "Number of kills the Radiant team had when the match ended")
  public Integer getRadiantScore() {
    return radiantScore;
  }
  public void setRadiantScore(Integer radiantScore) {
    this.radiantScore = radiantScore;
  }

  
  /**
   * The Dire's team_id
   **/
  @ApiModelProperty(value = "The Dire's team_id")
  public Integer getDireTeamId() {
    return direTeamId;
  }
  public void setDireTeamId(Integer direTeamId) {
    this.direTeamId = direTeamId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(matchId, inlineResponse2006.matchId) &&
        Objects.equals(leagueName, inlineResponse2006.leagueName) &&
        Objects.equals(seriesType, inlineResponse2006.seriesType) &&
        Objects.equals(radiant, inlineResponse2006.radiant) &&
        Objects.equals(seriesId, inlineResponse2006.seriesId) &&
        Objects.equals(duration, inlineResponse2006.duration) &&
        Objects.equals(startTime, inlineResponse2006.startTime) &&
        Objects.equals(radiantName, inlineResponse2006.radiantName) &&
        Objects.equals(radiantWin, inlineResponse2006.radiantWin) &&
        Objects.equals(direName, inlineResponse2006.direName) &&
        Objects.equals(leagueid, inlineResponse2006.leagueid) &&
        Objects.equals(direScore, inlineResponse2006.direScore) &&
        Objects.equals(radiantTeamId, inlineResponse2006.radiantTeamId) &&
        Objects.equals(radiantScore, inlineResponse2006.radiantScore) &&
        Objects.equals(direTeamId, inlineResponse2006.direTeamId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchId, leagueName, seriesType, radiant, seriesId, duration, startTime, radiantName, radiantWin, direName, leagueid, direScore, radiantTeamId, radiantScore, direTeamId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    leagueName: ").append(toIndentedString(leagueName)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    radiant: ").append(toIndentedString(radiant)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    radiantName: ").append(toIndentedString(radiantName)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    direName: ").append(toIndentedString(direName)).append("\n");
    sb.append("    leagueid: ").append(toIndentedString(leagueid)).append("\n");
    sb.append("    direScore: ").append(toIndentedString(direScore)).append("\n");
    sb.append("    radiantTeamId: ").append(toIndentedString(radiantTeamId)).append("\n");
    sb.append("    radiantScore: ").append(toIndentedString(radiantScore)).append("\n");
    sb.append("    direTeamId: ").append(toIndentedString(direTeamId)).append("\n");
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
