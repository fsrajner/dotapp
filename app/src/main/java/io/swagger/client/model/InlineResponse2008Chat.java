package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2008Chat   {
  
  @SerializedName("unit")
  private String unit = null;
  
  @SerializedName("player_slot")
  private Integer playerSlot = null;
  
  @SerializedName("time")
  private Integer time = null;
  
  @SerializedName("slot")
  private Integer slot = null;
  
  @SerializedName("key")
  private String key = null;
  

  
  /**
   * Name of the player who sent the message
   **/
  @ApiModelProperty(value = "Name of the player who sent the message")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
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
   * Time in seconds at which the message was said
   **/
  @ApiModelProperty(value = "Time in seconds at which the message was said")
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

  
  /**
   * The message the player sent
   **/
  @ApiModelProperty(value = "The message the player sent")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Chat inlineResponse2008Chat = (InlineResponse2008Chat) o;
    return Objects.equals(unit, inlineResponse2008Chat.unit) &&
        Objects.equals(playerSlot, inlineResponse2008Chat.playerSlot) &&
        Objects.equals(time, inlineResponse2008Chat.time) &&
        Objects.equals(slot, inlineResponse2008Chat.slot) &&
        Objects.equals(key, inlineResponse2008Chat.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, playerSlot, time, slot, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Chat {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
