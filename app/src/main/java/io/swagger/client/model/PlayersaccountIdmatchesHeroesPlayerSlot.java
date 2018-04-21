package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Which slot the player is in. 0-127 are Radiant, 128-255 are Dire
 **/
@ApiModel(description = "Which slot the player is in. 0-127 are Radiant, 128-255 are Dire")
public class PlayersaccountIdmatchesHeroesPlayerSlot   {
  
  @SerializedName("account_id")
  private Integer accountId = null;
  
  @SerializedName("player_slot")
  private Integer playerSlot = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  

  
  /**
   * account_id
   **/
  @ApiModelProperty(value = "account_id")
  public Integer getAccountId() {
    return accountId;
  }
  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  
  /**
   * Which slot the player is in. 0-127 are Radiant, 128-255 are Dire
   **/
  @ApiModelProperty(value = "Which slot the player is in. 0-127 are Radiant, 128-255 are Dire")
  public Integer getPlayerSlot() {
    return playerSlot;
  }
  public void setPlayerSlot(Integer playerSlot) {
    this.playerSlot = playerSlot;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayersaccountIdmatchesHeroesPlayerSlot playersaccountIdmatchesHeroesPlayerSlot = (PlayersaccountIdmatchesHeroesPlayerSlot) o;
    return Objects.equals(accountId, playersaccountIdmatchesHeroesPlayerSlot.accountId) &&
        Objects.equals(playerSlot, playersaccountIdmatchesHeroesPlayerSlot.playerSlot) &&
        Objects.equals(heroId, playersaccountIdmatchesHeroesPlayerSlot.heroId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, playerSlot, heroId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayersaccountIdmatchesHeroesPlayerSlot {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
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
