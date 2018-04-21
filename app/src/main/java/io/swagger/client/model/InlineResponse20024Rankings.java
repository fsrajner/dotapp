package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * rankings
 **/
@ApiModel(description = "rankings")
public class InlineResponse20024Rankings   {
  
  @SerializedName("steamid")
  private String steamid = null;
  
  @SerializedName("score")
  private String score = null;
  
  @SerializedName("profileurl")
  private String profileurl = null;
  
  @SerializedName("account_id")
  private Integer accountId = null;
  
  @SerializedName("rank_tier")
  private Integer rankTier = null;
  
  @SerializedName("avatarfull")
  private String avatarfull = null;
  
  @SerializedName("fh_unavailable")
  private Boolean fhUnavailable = null;
  
  @SerializedName("avatarmedium")
  private String avatarmedium = null;
  
  @SerializedName("avatar")
  private String avatar = null;
  
  @SerializedName("loccountrycode")
  private String loccountrycode = null;
  
  @SerializedName("personaname")
  private String personaname = null;
  
  @SerializedName("cheese")
  private Integer cheese = null;
  

  
  /**
   * steamid
   **/
  @ApiModelProperty(value = "steamid")
  public String getSteamid() {
    return steamid;
  }
  public void setSteamid(String steamid) {
    this.steamid = steamid;
  }

  
  /**
   * score
   **/
  @ApiModelProperty(value = "score")
  public String getScore() {
    return score;
  }
  public void setScore(String score) {
    this.score = score;
  }

  
  /**
   * profileurl
   **/
  @ApiModelProperty(value = "profileurl")
  public String getProfileurl() {
    return profileurl;
  }
  public void setProfileurl(String profileurl) {
    this.profileurl = profileurl;
  }

  
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
   * rank_tier
   **/
  @ApiModelProperty(value = "rank_tier")
  public Integer getRankTier() {
    return rankTier;
  }
  public void setRankTier(Integer rankTier) {
    this.rankTier = rankTier;
  }

  
  /**
   * avatarfull
   **/
  @ApiModelProperty(value = "avatarfull")
  public String getAvatarfull() {
    return avatarfull;
  }
  public void setAvatarfull(String avatarfull) {
    this.avatarfull = avatarfull;
  }

  
  /**
   * fh_unavailable
   **/
  @ApiModelProperty(value = "fh_unavailable")
  public Boolean getFhUnavailable() {
    return fhUnavailable;
  }
  public void setFhUnavailable(Boolean fhUnavailable) {
    this.fhUnavailable = fhUnavailable;
  }

  
  /**
   * avatarmedium
   **/
  @ApiModelProperty(value = "avatarmedium")
  public String getAvatarmedium() {
    return avatarmedium;
  }
  public void setAvatarmedium(String avatarmedium) {
    this.avatarmedium = avatarmedium;
  }

  
  /**
   * avatar
   **/
  @ApiModelProperty(value = "avatar")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  
  /**
   * loccountrycode
   **/
  @ApiModelProperty(value = "loccountrycode")
  public String getLoccountrycode() {
    return loccountrycode;
  }
  public void setLoccountrycode(String loccountrycode) {
    this.loccountrycode = loccountrycode;
  }

  
  /**
   * personaname
   **/
  @ApiModelProperty(value = "personaname")
  public String getPersonaname() {
    return personaname;
  }
  public void setPersonaname(String personaname) {
    this.personaname = personaname;
  }

  
  /**
   * cheese
   **/
  @ApiModelProperty(value = "cheese")
  public Integer getCheese() {
    return cheese;
  }
  public void setCheese(Integer cheese) {
    this.cheese = cheese;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20024Rankings inlineResponse20024Rankings = (InlineResponse20024Rankings) o;
    return Objects.equals(steamid, inlineResponse20024Rankings.steamid) &&
        Objects.equals(score, inlineResponse20024Rankings.score) &&
        Objects.equals(profileurl, inlineResponse20024Rankings.profileurl) &&
        Objects.equals(accountId, inlineResponse20024Rankings.accountId) &&
        Objects.equals(rankTier, inlineResponse20024Rankings.rankTier) &&
        Objects.equals(avatarfull, inlineResponse20024Rankings.avatarfull) &&
        Objects.equals(fhUnavailable, inlineResponse20024Rankings.fhUnavailable) &&
        Objects.equals(avatarmedium, inlineResponse20024Rankings.avatarmedium) &&
        Objects.equals(avatar, inlineResponse20024Rankings.avatar) &&
        Objects.equals(loccountrycode, inlineResponse20024Rankings.loccountrycode) &&
        Objects.equals(personaname, inlineResponse20024Rankings.personaname) &&
        Objects.equals(cheese, inlineResponse20024Rankings.cheese);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steamid, score, profileurl, accountId, rankTier, avatarfull, fhUnavailable, avatarmedium, avatar, loccountrycode, personaname, cheese);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20024Rankings {\n");
    
    sb.append("    steamid: ").append(toIndentedString(steamid)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    profileurl: ").append(toIndentedString(profileurl)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    rankTier: ").append(toIndentedString(rankTier)).append("\n");
    sb.append("    avatarfull: ").append(toIndentedString(avatarfull)).append("\n");
    sb.append("    fhUnavailable: ").append(toIndentedString(fhUnavailable)).append("\n");
    sb.append("    avatarmedium: ").append(toIndentedString(avatarmedium)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    loccountrycode: ").append(toIndentedString(loccountrycode)).append("\n");
    sb.append("    personaname: ").append(toIndentedString(personaname)).append("\n");
    sb.append("    cheese: ").append(toIndentedString(cheese)).append("\n");
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
