package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20033   {
  
  @SerializedName("wins")
  private Integer wins = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("games_played")
  private Integer gamesPlayed = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  

  
  /**
   * Number of wins
   **/
  @ApiModelProperty(value = "Number of wins")
  public Integer getWins() {
    return wins;
  }
  public void setWins(Integer wins) {
    this.wins = wins;
  }

  
  /**
   * The hero name
   **/
  @ApiModelProperty(value = "The hero name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Number of games played
   **/
  @ApiModelProperty(value = "Number of games played")
  public Integer getGamesPlayed() {
    return gamesPlayed;
  }
  public void setGamesPlayed(Integer gamesPlayed) {
    this.gamesPlayed = gamesPlayed;
  }

  
  /**
   * The hero ID
   **/
  @ApiModelProperty(value = "The hero ID")
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
    InlineResponse20033 inlineResponse20033 = (InlineResponse20033) o;
    return Objects.equals(wins, inlineResponse20033.wins) &&
        Objects.equals(name, inlineResponse20033.name) &&
        Objects.equals(gamesPlayed, inlineResponse20033.gamesPlayed) &&
        Objects.equals(heroId, inlineResponse20033.heroId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wins, name, gamesPlayed, heroId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20033 {\n");
    
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gamesPlayed: ").append(toIndentedString(gamesPlayed)).append("\n");
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
