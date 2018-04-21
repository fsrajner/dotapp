package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PlayersaccountIdmatchesHeroesPlayerSlot;

import com.google.gson.annotations.SerializedName;




/**
 * heroes (requires ?project=heroes)
 **/
@ApiModel(description = "heroes (requires ?project=heroes)")
public class PlayersaccountIdmatchesHeroes   {
  
  @SerializedName("player_slot")
  private PlayersaccountIdmatchesHeroesPlayerSlot playerSlot = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public PlayersaccountIdmatchesHeroesPlayerSlot getPlayerSlot() {
    return playerSlot;
  }
  public void setPlayerSlot(PlayersaccountIdmatchesHeroesPlayerSlot playerSlot) {
    this.playerSlot = playerSlot;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayersaccountIdmatchesHeroes playersaccountIdmatchesHeroes = (PlayersaccountIdmatchesHeroes) o;
    return Objects.equals(playerSlot, playersaccountIdmatchesHeroes.playerSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerSlot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayersaccountIdmatchesHeroes {\n");
    
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
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
