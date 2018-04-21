package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * profile
 **/
@ApiModel(description = "profile")
public class InlineResponse20010Profile   {
  
  @SerializedName("steamid")
  private String steamid = null;
  
  @SerializedName("profileurl")
  private String profileurl = null;
  
  @SerializedName("account_id")
  private Integer accountId = null;
  
  @SerializedName("last_login")
  private String lastLogin = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("avatarfull")
  private String avatarfull = null;
  
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
   * last_login
   **/
  @ApiModelProperty(value = "last_login")
  public String getLastLogin() {
    return lastLogin;
  }
  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  
  /**
   * name
   **/
  @ApiModelProperty(value = "name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
    InlineResponse20010Profile inlineResponse20010Profile = (InlineResponse20010Profile) o;
    return Objects.equals(steamid, inlineResponse20010Profile.steamid) &&
        Objects.equals(profileurl, inlineResponse20010Profile.profileurl) &&
        Objects.equals(accountId, inlineResponse20010Profile.accountId) &&
        Objects.equals(lastLogin, inlineResponse20010Profile.lastLogin) &&
        Objects.equals(name, inlineResponse20010Profile.name) &&
        Objects.equals(avatarfull, inlineResponse20010Profile.avatarfull) &&
        Objects.equals(avatarmedium, inlineResponse20010Profile.avatarmedium) &&
        Objects.equals(avatar, inlineResponse20010Profile.avatar) &&
        Objects.equals(loccountrycode, inlineResponse20010Profile.loccountrycode) &&
        Objects.equals(personaname, inlineResponse20010Profile.personaname) &&
        Objects.equals(cheese, inlineResponse20010Profile.cheese);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steamid, profileurl, accountId, lastLogin, name, avatarfull, avatarmedium, avatar, loccountrycode, personaname, cheese);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010Profile {\n");
    
    sb.append("    steamid: ").append(toIndentedString(steamid)).append("\n");
    sb.append("    profileurl: ").append(toIndentedString(profileurl)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarfull: ").append(toIndentedString(avatarfull)).append("\n");
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
