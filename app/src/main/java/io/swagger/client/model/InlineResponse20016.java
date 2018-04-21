package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20016   {
  
  @SerializedName("account_id")
  private Integer accountId = null;
  
  @SerializedName("solo_competitive_rank")
  private Integer soloCompetitiveRank = null;
  
  @SerializedName("competitive_rank")
  private Integer competitiveRank = null;
  
  @SerializedName("match_id")
  private Integer matchId = null;
  

  
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
   * solo_competitive_rank
   **/
  @ApiModelProperty(value = "solo_competitive_rank")
  public Integer getSoloCompetitiveRank() {
    return soloCompetitiveRank;
  }
  public void setSoloCompetitiveRank(Integer soloCompetitiveRank) {
    this.soloCompetitiveRank = soloCompetitiveRank;
  }

  
  /**
   * competitive_rank
   **/
  @ApiModelProperty(value = "competitive_rank")
  public Integer getCompetitiveRank() {
    return competitiveRank;
  }
  public void setCompetitiveRank(Integer competitiveRank) {
    this.competitiveRank = competitiveRank;
  }

  
  /**
   * match_id
   **/
  @ApiModelProperty(value = "match_id")
  public Integer getMatchId() {
    return matchId;
  }
  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20016 inlineResponse20016 = (InlineResponse20016) o;
    return Objects.equals(accountId, inlineResponse20016.accountId) &&
        Objects.equals(soloCompetitiveRank, inlineResponse20016.soloCompetitiveRank) &&
        Objects.equals(competitiveRank, inlineResponse20016.competitiveRank) &&
        Objects.equals(matchId, inlineResponse20016.matchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, soloCompetitiveRank, competitiveRank, matchId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    soloCompetitiveRank: ").append(toIndentedString(soloCompetitiveRank)).append("\n");
    sb.append("    competitiveRank: ").append(toIndentedString(competitiveRank)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
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
