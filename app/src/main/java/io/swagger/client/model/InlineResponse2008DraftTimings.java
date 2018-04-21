package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2008DraftTimings   {
  
  @SerializedName("active_team")
  private Integer activeTeam = null;
  
  @SerializedName("pick")
  private Boolean pick = null;
  
  @SerializedName("player_slot")
  private Integer playerSlot = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  
  @SerializedName("total_time_taken")
  private Integer totalTimeTaken = null;
  
  @SerializedName("order")
  private Integer order = null;
  
  @SerializedName("extra_time")
  private Integer extraTime = null;
  

  
  /**
   * active_team
   **/
  @ApiModelProperty(value = "active_team")
  public Integer getActiveTeam() {
    return activeTeam;
  }
  public void setActiveTeam(Integer activeTeam) {
    this.activeTeam = activeTeam;
  }

  
  /**
   * pick
   **/
  @ApiModelProperty(value = "pick")
  public Boolean getPick() {
    return pick;
  }
  public void setPick(Boolean pick) {
    this.pick = pick;
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

  
  /**
   * total_time_taken
   **/
  @ApiModelProperty(value = "total_time_taken")
  public Integer getTotalTimeTaken() {
    return totalTimeTaken;
  }
  public void setTotalTimeTaken(Integer totalTimeTaken) {
    this.totalTimeTaken = totalTimeTaken;
  }

  
  /**
   * order
   **/
  @ApiModelProperty(value = "order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  
  /**
   * extra_time
   **/
  @ApiModelProperty(value = "extra_time")
  public Integer getExtraTime() {
    return extraTime;
  }
  public void setExtraTime(Integer extraTime) {
    this.extraTime = extraTime;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008DraftTimings inlineResponse2008DraftTimings = (InlineResponse2008DraftTimings) o;
    return Objects.equals(activeTeam, inlineResponse2008DraftTimings.activeTeam) &&
        Objects.equals(pick, inlineResponse2008DraftTimings.pick) &&
        Objects.equals(playerSlot, inlineResponse2008DraftTimings.playerSlot) &&
        Objects.equals(heroId, inlineResponse2008DraftTimings.heroId) &&
        Objects.equals(totalTimeTaken, inlineResponse2008DraftTimings.totalTimeTaken) &&
        Objects.equals(order, inlineResponse2008DraftTimings.order) &&
        Objects.equals(extraTime, inlineResponse2008DraftTimings.extraTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTeam, pick, playerSlot, heroId, totalTimeTaken, order, extraTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008DraftTimings {\n");
    
    sb.append("    activeTeam: ").append(toIndentedString(activeTeam)).append("\n");
    sb.append("    pick: ").append(toIndentedString(pick)).append("\n");
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    totalTimeTaken: ").append(toIndentedString(totalTimeTaken)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    extraTime: ").append(toIndentedString(extraTime)).append("\n");
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
