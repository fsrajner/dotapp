package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20034   {
  
  @SerializedName("wins")
  private Integer wins = null;
  
  @SerializedName("account_id")
  private String accountId = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("games_played")
  private Integer gamesPlayed = null;
  
  @SerializedName("is_current_team_member")
  private Boolean isCurrentTeamMember = null;
  

  
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
   * The player account ID
   **/
  @ApiModelProperty(value = "The player account ID")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   * The player name
   **/
  @ApiModelProperty(value = "The player name")
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
   * If this player is on the current roster
   **/
  @ApiModelProperty(value = "If this player is on the current roster")
  public Boolean getIsCurrentTeamMember() {
    return isCurrentTeamMember;
  }
  public void setIsCurrentTeamMember(Boolean isCurrentTeamMember) {
    this.isCurrentTeamMember = isCurrentTeamMember;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20034 inlineResponse20034 = (InlineResponse20034) o;
    return Objects.equals(wins, inlineResponse20034.wins) &&
        Objects.equals(accountId, inlineResponse20034.accountId) &&
        Objects.equals(name, inlineResponse20034.name) &&
        Objects.equals(gamesPlayed, inlineResponse20034.gamesPlayed) &&
        Objects.equals(isCurrentTeamMember, inlineResponse20034.isCurrentTeamMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wins, accountId, name, gamesPlayed, isCurrentTeamMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20034 {\n");
    
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gamesPlayed: ").append(toIndentedString(gamesPlayed)).append("\n");
    sb.append("    isCurrentTeamMember: ").append(toIndentedString(isCurrentTeamMember)).append("\n");
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
