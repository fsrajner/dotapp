package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * hero
 **/
@ApiModel(description = "hero")
public class InlineResponse20012   {
  
  @SerializedName("with_win")
  private Integer withWin = null;
  
  @SerializedName("with_games")
  private Integer withGames = null;
  
  @SerializedName("against_win")
  private Integer againstWin = null;
  
  @SerializedName("last_played")
  private Integer lastPlayed = null;
  
  @SerializedName("games")
  private Integer games = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  
  @SerializedName("win")
  private Integer win = null;
  
  @SerializedName("against_games")
  private Integer againstGames = null;
  

  
  /**
   * with_win
   **/
  @ApiModelProperty(value = "with_win")
  public Integer getWithWin() {
    return withWin;
  }
  public void setWithWin(Integer withWin) {
    this.withWin = withWin;
  }

  
  /**
   * with_games
   **/
  @ApiModelProperty(value = "with_games")
  public Integer getWithGames() {
    return withGames;
  }
  public void setWithGames(Integer withGames) {
    this.withGames = withGames;
  }

  
  /**
   * against_win
   **/
  @ApiModelProperty(value = "against_win")
  public Integer getAgainstWin() {
    return againstWin;
  }
  public void setAgainstWin(Integer againstWin) {
    this.againstWin = againstWin;
  }

  
  /**
   * last_played
   **/
  @ApiModelProperty(value = "last_played")
  public Integer getLastPlayed() {
    return lastPlayed;
  }
  public void setLastPlayed(Integer lastPlayed) {
    this.lastPlayed = lastPlayed;
  }

  
  /**
   * games
   **/
  @ApiModelProperty(value = "games")
  public Integer getGames() {
    return games;
  }
  public void setGames(Integer games) {
    this.games = games;
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
   * win
   **/
  @ApiModelProperty(value = "win")
  public Integer getWin() {
    return win;
  }
  public void setWin(Integer win) {
    this.win = win;
  }

  
  /**
   * against_games
   **/
  @ApiModelProperty(value = "against_games")
  public Integer getAgainstGames() {
    return againstGames;
  }
  public void setAgainstGames(Integer againstGames) {
    this.againstGames = againstGames;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012 inlineResponse20012 = (InlineResponse20012) o;
    return Objects.equals(withWin, inlineResponse20012.withWin) &&
        Objects.equals(withGames, inlineResponse20012.withGames) &&
        Objects.equals(againstWin, inlineResponse20012.againstWin) &&
        Objects.equals(lastPlayed, inlineResponse20012.lastPlayed) &&
        Objects.equals(games, inlineResponse20012.games) &&
        Objects.equals(heroId, inlineResponse20012.heroId) &&
        Objects.equals(win, inlineResponse20012.win) &&
        Objects.equals(againstGames, inlineResponse20012.againstGames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withWin, withGames, againstWin, lastPlayed, games, heroId, win, againstGames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012 {\n");
    
    sb.append("    withWin: ").append(toIndentedString(withWin)).append("\n");
    sb.append("    withGames: ").append(toIndentedString(withGames)).append("\n");
    sb.append("    againstWin: ").append(toIndentedString(againstWin)).append("\n");
    sb.append("    lastPlayed: ").append(toIndentedString(lastPlayed)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    win: ").append(toIndentedString(win)).append("\n");
    sb.append("    againstGames: ").append(toIndentedString(againstGames)).append("\n");
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
