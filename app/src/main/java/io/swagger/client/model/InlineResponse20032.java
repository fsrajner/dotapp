package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20032   {
  
  @SerializedName("wins")
  private Integer wins = null;
  
  @SerializedName("last_match_time")
  private Integer lastMatchTime = null;
  
  @SerializedName("rating")
  private BigDecimal rating = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("team_id")
  private Integer teamId = null;
  
  @SerializedName("tag")
  private String tag = null;
  
  @SerializedName("losses")
  private Integer losses = null;
  

  
  /**
   * The number of games won by this team
   **/
  @ApiModelProperty(value = "The number of games won by this team")
  public Integer getWins() {
    return wins;
  }
  public void setWins(Integer wins) {
    this.wins = wins;
  }

  
  /**
   * The Unix timestamp of the last match played by this team
   **/
  @ApiModelProperty(value = "The Unix timestamp of the last match played by this team")
  public Integer getLastMatchTime() {
    return lastMatchTime;
  }
  public void setLastMatchTime(Integer lastMatchTime) {
    this.lastMatchTime = lastMatchTime;
  }

  
  /**
   * The Elo rating of the team
   **/
  @ApiModelProperty(value = "The Elo rating of the team")
  public BigDecimal getRating() {
    return rating;
  }
  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }

  
  /**
   * Team name, eg. 'Newbee'
   **/
  @ApiModelProperty(value = "Team name, eg. 'Newbee'")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Team's identifier
   **/
  @ApiModelProperty(value = "Team's identifier")
  public Integer getTeamId() {
    return teamId;
  }
  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  
  /**
   * The team tag/abbreviation
   **/
  @ApiModelProperty(value = "The team tag/abbreviation")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  
  /**
   * The number of losses by this team
   **/
  @ApiModelProperty(value = "The number of losses by this team")
  public Integer getLosses() {
    return losses;
  }
  public void setLosses(Integer losses) {
    this.losses = losses;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20032 inlineResponse20032 = (InlineResponse20032) o;
    return Objects.equals(wins, inlineResponse20032.wins) &&
        Objects.equals(lastMatchTime, inlineResponse20032.lastMatchTime) &&
        Objects.equals(rating, inlineResponse20032.rating) &&
        Objects.equals(name, inlineResponse20032.name) &&
        Objects.equals(teamId, inlineResponse20032.teamId) &&
        Objects.equals(tag, inlineResponse20032.tag) &&
        Objects.equals(losses, inlineResponse20032.losses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wins, lastMatchTime, rating, name, teamId, tag, losses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20032 {\n");
    
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    lastMatchTime: ").append(toIndentedString(lastMatchTime)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
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
