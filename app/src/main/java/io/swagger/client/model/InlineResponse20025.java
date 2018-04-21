package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20025   {
  
  @SerializedName("start_time")
  private Integer startTime = null;
  
  @SerializedName("score")
  private BigDecimal score = null;
  
  @SerializedName("match_id")
  private Integer matchId = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  

  
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
   * score
   **/
  @ApiModelProperty(value = "score")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
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
   * The ID value of the hero played
   **/
  @ApiModelProperty(value = "The ID value of the hero played")
  public Integer getHeroId() {
    return heroId;
  }
  public void setHeroId(Integer heroId) {
    this.heroId = heroId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025 inlineResponse20025 = (InlineResponse20025) o;
    return Objects.equals(startTime, inlineResponse20025.startTime) &&
        Objects.equals(score, inlineResponse20025.score) &&
        Objects.equals(matchId, inlineResponse20025.matchId) &&
        Objects.equals(heroId, inlineResponse20025.heroId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, score, matchId, heroId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025 {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
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
