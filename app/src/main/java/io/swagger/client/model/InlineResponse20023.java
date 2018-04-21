package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20023   {
  
  @SerializedName("duration")
  private Integer duration = null;
  
  @SerializedName("start_time")
  private Integer startTime = null;
  
  @SerializedName("radiant_win")
  private Boolean radiantWin = null;
  
  @SerializedName("dire_team")
  private String direTeam = null;
  
  @SerializedName("match_seq_num")
  private Integer matchSeqNum = null;
  
  @SerializedName("match_id")
  private Integer matchId = null;
  
  @SerializedName("radiant_team")
  private String radiantTeam = null;
  

  
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
   * start_time
   **/
  @ApiModelProperty(value = "start_time")
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
   * dire_team
   **/
  @ApiModelProperty(value = "dire_team")
  public String getDireTeam() {
    return direTeam;
  }
  public void setDireTeam(String direTeam) {
    this.direTeam = direTeam;
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
   * match_id
   **/
  @ApiModelProperty(value = "match_id")
  public Integer getMatchId() {
    return matchId;
  }
  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  
  /**
   * radiant_team
   **/
  @ApiModelProperty(value = "radiant_team")
  public String getRadiantTeam() {
    return radiantTeam;
  }
  public void setRadiantTeam(String radiantTeam) {
    this.radiantTeam = radiantTeam;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20023 inlineResponse20023 = (InlineResponse20023) o;
    return Objects.equals(duration, inlineResponse20023.duration) &&
        Objects.equals(startTime, inlineResponse20023.startTime) &&
        Objects.equals(radiantWin, inlineResponse20023.radiantWin) &&
        Objects.equals(direTeam, inlineResponse20023.direTeam) &&
        Objects.equals(matchSeqNum, inlineResponse20023.matchSeqNum) &&
        Objects.equals(matchId, inlineResponse20023.matchId) &&
        Objects.equals(radiantTeam, inlineResponse20023.radiantTeam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, startTime, radiantWin, direTeam, matchSeqNum, matchId, radiantTeam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20023 {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    direTeam: ").append(toIndentedString(direTeam)).append("\n");
    sb.append("    matchSeqNum: ").append(toIndentedString(matchSeqNum)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    radiantTeam: ").append(toIndentedString(radiantTeam)).append("\n");
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
