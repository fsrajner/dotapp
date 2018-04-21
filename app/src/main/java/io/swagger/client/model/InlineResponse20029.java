package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20029   {
  
  @SerializedName("wins")
  private String wins = null;
  
  @SerializedName("scenario")
  private String scenario = null;
  
  @SerializedName("is_radiant")
  private Boolean isRadiant = null;
  
  @SerializedName("games")
  private String games = null;
  
  @SerializedName("region")
  private Integer region = null;
  

  
  /**
   * The number of games won where this scenario occured
   **/
  @ApiModelProperty(value = "The number of games won where this scenario occured")
  public String getWins() {
    return wins;
  }
  public void setWins(String wins) {
    this.wins = wins;
  }

  
  /**
   * The scenario's name or description
   **/
  @ApiModelProperty(value = "The scenario's name or description")
  public String getScenario() {
    return scenario;
  }
  public void setScenario(String scenario) {
    this.scenario = scenario;
  }

  
  /**
   * Boolean indicating whether Radiant executed this scenario
   **/
  @ApiModelProperty(value = "Boolean indicating whether Radiant executed this scenario")
  public Boolean getIsRadiant() {
    return isRadiant;
  }
  public void setIsRadiant(Boolean isRadiant) {
    this.isRadiant = isRadiant;
  }

  
  /**
   * The number of games where this scenario occurred
   **/
  @ApiModelProperty(value = "The number of games where this scenario occurred")
  public String getGames() {
    return games;
  }
  public void setGames(String games) {
    this.games = games;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getRegion() {
    return region;
  }
  public void setRegion(Integer region) {
    this.region = region;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20029 inlineResponse20029 = (InlineResponse20029) o;
    return Objects.equals(wins, inlineResponse20029.wins) &&
        Objects.equals(scenario, inlineResponse20029.scenario) &&
        Objects.equals(isRadiant, inlineResponse20029.isRadiant) &&
        Objects.equals(games, inlineResponse20029.games) &&
        Objects.equals(region, inlineResponse20029.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wins, scenario, isRadiant, games, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20029 {\n");
    
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    isRadiant: ").append(toIndentedString(isRadiant)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
