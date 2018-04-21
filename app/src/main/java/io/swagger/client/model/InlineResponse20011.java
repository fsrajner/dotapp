package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20011   {
  
  @SerializedName("patch")
  private Object patch = null;
  
  @SerializedName("leaver_status")
  private Object leaverStatus = null;
  
  @SerializedName("game_mode")
  private Object gameMode = null;
  
  @SerializedName("lobby_type")
  private Object lobbyType = null;
  
  @SerializedName("region")
  private Object region = null;
  
  @SerializedName("lane_role")
  private Object laneRole = null;
  

  
  /**
   * patch
   **/
  @ApiModelProperty(value = "patch")
  public Object getPatch() {
    return patch;
  }
  public void setPatch(Object patch) {
    this.patch = patch;
  }

  
  /**
   * Integer describing whether or not the player left the game. 0: didn't leave. 1: left safely. 2+: Abandoned
   **/
  @ApiModelProperty(value = "Integer describing whether or not the player left the game. 0: didn't leave. 1: left safely. 2+: Abandoned")
  public Object getLeaverStatus() {
    return leaverStatus;
  }
  public void setLeaverStatus(Object leaverStatus) {
    this.leaverStatus = leaverStatus;
  }

  
  /**
   * Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json
   **/
  @ApiModelProperty(value = "Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json")
  public Object getGameMode() {
    return gameMode;
  }
  public void setGameMode(Object gameMode) {
    this.gameMode = gameMode;
  }

  
  /**
   * Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json
   **/
  @ApiModelProperty(value = "Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json")
  public Object getLobbyType() {
    return lobbyType;
  }
  public void setLobbyType(Object lobbyType) {
    this.lobbyType = lobbyType;
  }

  
  /**
   * Integer corresponding to the region the game was played on
   **/
  @ApiModelProperty(value = "Integer corresponding to the region the game was played on")
  public Object getRegion() {
    return region;
  }
  public void setRegion(Object region) {
    this.region = region;
  }

  
  /**
   * lane_role
   **/
  @ApiModelProperty(value = "lane_role")
  public Object getLaneRole() {
    return laneRole;
  }
  public void setLaneRole(Object laneRole) {
    this.laneRole = laneRole;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011 inlineResponse20011 = (InlineResponse20011) o;
    return Objects.equals(patch, inlineResponse20011.patch) &&
        Objects.equals(leaverStatus, inlineResponse20011.leaverStatus) &&
        Objects.equals(gameMode, inlineResponse20011.gameMode) &&
        Objects.equals(lobbyType, inlineResponse20011.lobbyType) &&
        Objects.equals(region, inlineResponse20011.region) &&
        Objects.equals(laneRole, inlineResponse20011.laneRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patch, leaverStatus, gameMode, lobbyType, region, laneRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011 {\n");
    
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    leaverStatus: ").append(toIndentedString(leaverStatus)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    lobbyType: ").append(toIndentedString(lobbyType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    laneRole: ").append(toIndentedString(laneRole)).append("\n");
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
