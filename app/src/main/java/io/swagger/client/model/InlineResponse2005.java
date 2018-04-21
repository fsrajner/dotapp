package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2005   {
  
  @SerializedName("wins")
  private Integer wins = null;
  
  @SerializedName("duration_bin")
  private String durationBin = null;
  
  @SerializedName("games_played")
  private Integer gamesPlayed = null;
  

  
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
   * Lower bound of number of seconds the match lasted
   **/
  @ApiModelProperty(value = "Lower bound of number of seconds the match lasted")
  public String getDurationBin() {
    return durationBin;
  }
  public void setDurationBin(String durationBin) {
    this.durationBin = durationBin;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(wins, inlineResponse2005.wins) &&
        Objects.equals(durationBin, inlineResponse2005.durationBin) &&
        Objects.equals(gamesPlayed, inlineResponse2005.gamesPlayed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wins, durationBin, gamesPlayed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    durationBin: ").append(toIndentedString(durationBin)).append("\n");
    sb.append("    gamesPlayed: ").append(toIndentedString(gamesPlayed)).append("\n");
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
