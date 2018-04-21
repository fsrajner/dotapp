package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse20010MmrEstimate;
import io.swagger.client.model.InlineResponse20010Profile;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20010   {
  
  @SerializedName("tracked_until")
  private String trackedUntil = null;
  
  @SerializedName("solo_competitive_rank")
  private String soloCompetitiveRank = null;
  
  @SerializedName("rank_tier")
  private BigDecimal rankTier = null;
  
  @SerializedName("competitive_rank")
  private String competitiveRank = null;
  
  @SerializedName("profile")
  private InlineResponse20010Profile profile = null;
  
  @SerializedName("leaderboard_rank")
  private BigDecimal leaderboardRank = null;
  
  @SerializedName("mmr_estimate")
  private InlineResponse20010MmrEstimate mmrEstimate = null;
  

  
  /**
   * tracked_until
   **/
  @ApiModelProperty(value = "tracked_until")
  public String getTrackedUntil() {
    return trackedUntil;
  }
  public void setTrackedUntil(String trackedUntil) {
    this.trackedUntil = trackedUntil;
  }

  
  /**
   * solo_competitive_rank
   **/
  @ApiModelProperty(value = "solo_competitive_rank")
  public String getSoloCompetitiveRank() {
    return soloCompetitiveRank;
  }
  public void setSoloCompetitiveRank(String soloCompetitiveRank) {
    this.soloCompetitiveRank = soloCompetitiveRank;
  }

  
  /**
   * rank_tier
   **/
  @ApiModelProperty(value = "rank_tier")
  public BigDecimal getRankTier() {
    return rankTier;
  }
  public void setRankTier(BigDecimal rankTier) {
    this.rankTier = rankTier;
  }

  
  /**
   * competitive_rank
   **/
  @ApiModelProperty(value = "competitive_rank")
  public String getCompetitiveRank() {
    return competitiveRank;
  }
  public void setCompetitiveRank(String competitiveRank) {
    this.competitiveRank = competitiveRank;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse20010Profile getProfile() {
    return profile;
  }
  public void setProfile(InlineResponse20010Profile profile) {
    this.profile = profile;
  }

  
  /**
   * leaderboard_rank
   **/
  @ApiModelProperty(value = "leaderboard_rank")
  public BigDecimal getLeaderboardRank() {
    return leaderboardRank;
  }
  public void setLeaderboardRank(BigDecimal leaderboardRank) {
    this.leaderboardRank = leaderboardRank;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse20010MmrEstimate getMmrEstimate() {
    return mmrEstimate;
  }
  public void setMmrEstimate(InlineResponse20010MmrEstimate mmrEstimate) {
    this.mmrEstimate = mmrEstimate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(trackedUntil, inlineResponse20010.trackedUntil) &&
        Objects.equals(soloCompetitiveRank, inlineResponse20010.soloCompetitiveRank) &&
        Objects.equals(rankTier, inlineResponse20010.rankTier) &&
        Objects.equals(competitiveRank, inlineResponse20010.competitiveRank) &&
        Objects.equals(profile, inlineResponse20010.profile) &&
        Objects.equals(leaderboardRank, inlineResponse20010.leaderboardRank) &&
        Objects.equals(mmrEstimate, inlineResponse20010.mmrEstimate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackedUntil, soloCompetitiveRank, rankTier, competitiveRank, profile, leaderboardRank, mmrEstimate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    trackedUntil: ").append(toIndentedString(trackedUntil)).append("\n");
    sb.append("    soloCompetitiveRank: ").append(toIndentedString(soloCompetitiveRank)).append("\n");
    sb.append("    rankTier: ").append(toIndentedString(rankTier)).append("\n");
    sb.append("    competitiveRank: ").append(toIndentedString(competitiveRank)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    leaderboardRank: ").append(toIndentedString(leaderboardRank)).append("\n");
    sb.append("    mmrEstimate: ").append(toIndentedString(mmrEstimate)).append("\n");
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
