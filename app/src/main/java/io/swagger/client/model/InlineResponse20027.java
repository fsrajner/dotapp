package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20027   {
  
  @SerializedName("wins")
  private String wins = null;
  
  @SerializedName("item")
  private String item = null;
  
  @SerializedName("games")
  private String games = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  
  @SerializedName("time")
  private Integer time = null;
  

  
  /**
   * The number of games won where the hero bought this item before this time
   **/
  @ApiModelProperty(value = "The number of games won where the hero bought this item before this time")
  public String getWins() {
    return wins;
  }
  public void setWins(String wins) {
    this.wins = wins;
  }

  
  /**
   * Purchased item
   **/
  @ApiModelProperty(value = "Purchased item")
  public String getItem() {
    return item;
  }
  public void setItem(String item) {
    this.item = item;
  }

  
  /**
   * The number of games where the hero bought this item before this time
   **/
  @ApiModelProperty(value = "The number of games where the hero bought this item before this time")
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
   * Ingame time in seconds before the item was purchased
   **/
  @ApiModelProperty(value = "Ingame time in seconds before the item was purchased")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20027 inlineResponse20027 = (InlineResponse20027) o;
    return Objects.equals(wins, inlineResponse20027.wins) &&
        Objects.equals(item, inlineResponse20027.item) &&
        Objects.equals(games, inlineResponse20027.games) &&
        Objects.equals(heroId, inlineResponse20027.heroId) &&
        Objects.equals(time, inlineResponse20027.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wins, item, games, heroId, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20027 {\n");
    
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
