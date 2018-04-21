package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20028   {
  
  @SerializedName("wins")
  private String wins = null;
  
  @SerializedName("games")
  private String games = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  
  @SerializedName("time")
  private Integer time = null;
  
  @SerializedName("lane_role")
  private Integer laneRole = null;
  

  
  /**
   * The number of games won where the hero played in this lane role
   **/
  @ApiModelProperty(value = "The number of games won where the hero played in this lane role")
  public String getWins() {
    return wins;
  }
  public void setWins(String wins) {
    this.wins = wins;
  }

  
  /**
   * The number of games where the hero played in this lane role
   **/
  @ApiModelProperty(value = "The number of games where the hero played in this lane role")
  public String getGames() {
    return games;
  }
  public void setGames(String games) {
    this.games = games;
  }

  
  /**
   * Hero ID
   **/
  @ApiModelProperty(value = "Hero ID")
  public Integer getHeroId() {
    return heroId;
  }
  public void setHeroId(Integer heroId) {
    this.heroId = heroId;
  }

  
  /**
   * Maximum game length in seconds
   **/
  @ApiModelProperty(value = "Maximum game length in seconds")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }

  
  /**
   * The hero's lane role
   **/
  @ApiModelProperty(value = "The hero's lane role")
  public Integer getLaneRole() {
    return laneRole;
  }
  public void setLaneRole(Integer laneRole) {
    this.laneRole = laneRole;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20028 inlineResponse20028 = (InlineResponse20028) o;
    return Objects.equals(wins, inlineResponse20028.wins) &&
        Objects.equals(games, inlineResponse20028.games) &&
        Objects.equals(heroId, inlineResponse20028.heroId) &&
        Objects.equals(time, inlineResponse20028.time) &&
        Objects.equals(laneRole, inlineResponse20028.laneRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wins, games, heroId, time, laneRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20028 {\n");
    
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    laneRole: ").append(toIndentedString(laneRole)).append("\n");
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
