package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20022   {
  
  @SerializedName("profileurl")
  private String profileurl = null;
  
  @SerializedName("is_locked")
  private Boolean isLocked = null;
  
  @SerializedName("fantasy_role")
  private Integer fantasyRole = null;
  
  @SerializedName("avatarfull")
  private String avatarfull = null;
  
  @SerializedName("fh_unavailable")
  private Boolean fhUnavailable = null;
  
  @SerializedName("team_tag")
  private String teamTag = null;
  
  @SerializedName("avatarmedium")
  private String avatarmedium = null;
  
  @SerializedName("locked_until")
  private Integer lockedUntil = null;
  
  @SerializedName("avatar")
  private String avatar = null;
  
  @SerializedName("team_id")
  private Integer teamId = null;
  
  @SerializedName("personaname")
  private String personaname = null;
  
  @SerializedName("team_name")
  private String teamName = null;
  
  @SerializedName("cheese")
  private Integer cheese = null;
  
  @SerializedName("steamid")
  private String steamid = null;
  
  @SerializedName("country_code")
  private String countryCode = null;
  
  @SerializedName("account_id")
  private Integer accountId = null;
  
  @SerializedName("is_pro")
  private Boolean isPro = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("loccountrycode")
  private String loccountrycode = null;
  

  
  /**
   * Steam profile URL
   **/
  @ApiModelProperty(value = "Steam profile URL")
  public String getProfileurl() {
    return profileurl;
  }
  public void setProfileurl(String profileurl) {
    this.profileurl = profileurl;
  }

  
  /**
   * Whether the roster lock is active
   **/
  @ApiModelProperty(value = "Whether the roster lock is active")
  public Boolean getIsLocked() {
    return isLocked;
  }
  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  
  /**
   * Player's ingame role (core: 1 or support: 2)
   **/
  @ApiModelProperty(value = "Player's ingame role (core: 1 or support: 2)")
  public Integer getFantasyRole() {
    return fantasyRole;
  }
  public void setFantasyRole(Integer fantasyRole) {
    this.fantasyRole = fantasyRole;
  }

  
  /**
   * Steam picture URL (full picture)
   **/
  @ApiModelProperty(value = "Steam picture URL (full picture)")
  public String getAvatarfull() {
    return avatarfull;
  }
  public void setAvatarfull(String avatarfull) {
    this.avatarfull = avatarfull;
  }

  
  /**
   * Whether the refresh of player' match history failed
   **/
  @ApiModelProperty(value = "Whether the refresh of player' match history failed")
  public Boolean getFhUnavailable() {
    return fhUnavailable;
  }
  public void setFhUnavailable(Boolean fhUnavailable) {
    this.fhUnavailable = fhUnavailable;
  }

  
  /**
   * Player's team shorthand tag, e.g. 'EG'
   **/
  @ApiModelProperty(value = "Player's team shorthand tag, e.g. 'EG'")
  public String getTeamTag() {
    return teamTag;
  }
  public void setTeamTag(String teamTag) {
    this.teamTag = teamTag;
  }

  
  /**
   * Steam picture URL (medium picture)
   **/
  @ApiModelProperty(value = "Steam picture URL (medium picture)")
  public String getAvatarmedium() {
    return avatarmedium;
  }
  public void setAvatarmedium(String avatarmedium) {
    this.avatarmedium = avatarmedium;
  }

  
  /**
   * When the roster lock will end
   **/
  @ApiModelProperty(value = "When the roster lock will end")
  public Integer getLockedUntil() {
    return lockedUntil;
  }
  public void setLockedUntil(Integer lockedUntil) {
    this.lockedUntil = lockedUntil;
  }

  
  /**
   * Steam picture URL (small picture)
   **/
  @ApiModelProperty(value = "Steam picture URL (small picture)")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  
  /**
   * Player's team identifier
   **/
  @ApiModelProperty(value = "Player's team identifier")
  public Integer getTeamId() {
    return teamId;
  }
  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  
  /**
   * Player's Steam name
   **/
  @ApiModelProperty(value = "Player's Steam name")
  public String getPersonaname() {
    return personaname;
  }
  public void setPersonaname(String personaname) {
    this.personaname = personaname;
  }

  
  /**
   * Player's team name, e.g. 'Evil Geniuses'
   **/
  @ApiModelProperty(value = "Player's team name, e.g. 'Evil Geniuses'")
  public String getTeamName() {
    return teamName;
  }
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  
  /**
   * Amount of dollars the player has donated to OpenDota
   **/
  @ApiModelProperty(value = "Amount of dollars the player has donated to OpenDota")
  public Integer getCheese() {
    return cheese;
  }
  public void setCheese(Integer cheese) {
    this.cheese = cheese;
  }

  
  /**
   * Player's steam identifier
   **/
  @ApiModelProperty(value = "Player's steam identifier")
  public String getSteamid() {
    return steamid;
  }
  public void setSteamid(String steamid) {
    this.steamid = steamid;
  }

  
  /**
   * Player's country code
   **/
  @ApiModelProperty(value = "Player's country code")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * Player's account identifier
   **/
  @ApiModelProperty(value = "Player's account identifier")
  public Integer getAccountId() {
    return accountId;
  }
  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  
  /**
   * Whether the player is professional or not
   **/
  @ApiModelProperty(value = "Whether the player is professional or not")
  public Boolean getIsPro() {
    return isPro;
  }
  public void setIsPro(Boolean isPro) {
    this.isPro = isPro;
  }

  
  /**
   * Verified player name, e.g. 'Miracle-'
   **/
  @ApiModelProperty(value = "Verified player name, e.g. 'Miracle-'")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Player's country identifier, e.g. US
   **/
  @ApiModelProperty(value = "Player's country identifier, e.g. US")
  public String getLoccountrycode() {
    return loccountrycode;
  }
  public void setLoccountrycode(String loccountrycode) {
    this.loccountrycode = loccountrycode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022 inlineResponse20022 = (InlineResponse20022) o;
    return Objects.equals(profileurl, inlineResponse20022.profileurl) &&
        Objects.equals(isLocked, inlineResponse20022.isLocked) &&
        Objects.equals(fantasyRole, inlineResponse20022.fantasyRole) &&
        Objects.equals(avatarfull, inlineResponse20022.avatarfull) &&
        Objects.equals(fhUnavailable, inlineResponse20022.fhUnavailable) &&
        Objects.equals(teamTag, inlineResponse20022.teamTag) &&
        Objects.equals(avatarmedium, inlineResponse20022.avatarmedium) &&
        Objects.equals(lockedUntil, inlineResponse20022.lockedUntil) &&
        Objects.equals(avatar, inlineResponse20022.avatar) &&
        Objects.equals(teamId, inlineResponse20022.teamId) &&
        Objects.equals(personaname, inlineResponse20022.personaname) &&
        Objects.equals(teamName, inlineResponse20022.teamName) &&
        Objects.equals(cheese, inlineResponse20022.cheese) &&
        Objects.equals(steamid, inlineResponse20022.steamid) &&
        Objects.equals(countryCode, inlineResponse20022.countryCode) &&
        Objects.equals(accountId, inlineResponse20022.accountId) &&
        Objects.equals(isPro, inlineResponse20022.isPro) &&
        Objects.equals(name, inlineResponse20022.name) &&
        Objects.equals(loccountrycode, inlineResponse20022.loccountrycode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileurl, isLocked, fantasyRole, avatarfull, fhUnavailable, teamTag, avatarmedium, lockedUntil, avatar, teamId, personaname, teamName, cheese, steamid, countryCode, accountId, isPro, name, loccountrycode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022 {\n");
    
    sb.append("    profileurl: ").append(toIndentedString(profileurl)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    fantasyRole: ").append(toIndentedString(fantasyRole)).append("\n");
    sb.append("    avatarfull: ").append(toIndentedString(avatarfull)).append("\n");
    sb.append("    fhUnavailable: ").append(toIndentedString(fhUnavailable)).append("\n");
    sb.append("    teamTag: ").append(toIndentedString(teamTag)).append("\n");
    sb.append("    avatarmedium: ").append(toIndentedString(avatarmedium)).append("\n");
    sb.append("    lockedUntil: ").append(toIndentedString(lockedUntil)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    personaname: ").append(toIndentedString(personaname)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    cheese: ").append(toIndentedString(cheese)).append("\n");
    sb.append("    steamid: ").append(toIndentedString(steamid)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    isPro: ").append(toIndentedString(isPro)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    loccountrycode: ").append(toIndentedString(loccountrycode)).append("\n");
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
