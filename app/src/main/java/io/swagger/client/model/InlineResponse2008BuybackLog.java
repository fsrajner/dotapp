package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2008BuybackLog   {
  
  @SerializedName("player_slot")
  private Integer playerSlot = null;
  
  @SerializedName("time")
  private Integer time = null;
  
  @SerializedName("slot")
  private Integer slot = null;
  

  
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
   * Time in seconds the buyback occurred
   **/
  @ApiModelProperty(value = "Time in seconds the buyback occurred")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }

  
  /**
   * slot
   **/
  @ApiModelProperty(value = "slot")
  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008BuybackLog inlineResponse2008BuybackLog = (InlineResponse2008BuybackLog) o;
    return Objects.equals(playerSlot, inlineResponse2008BuybackLog.playerSlot) &&
        Objects.equals(time, inlineResponse2008BuybackLog.time) &&
        Objects.equals(slot, inlineResponse2008BuybackLog.slot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerSlot, time, slot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008BuybackLog {\n");
    
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
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
