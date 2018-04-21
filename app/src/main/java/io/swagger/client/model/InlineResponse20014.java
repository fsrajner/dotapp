package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20014   {
  
  @SerializedName("with_gpm_sum")
  private Integer withGpmSum = null;
  
  @SerializedName("against_win")
  private Integer againstWin = null;
  
  @SerializedName("last_login")
  private String lastLogin = null;
  
  @SerializedName("avatarfull")
  private String avatarfull = null;
  
  @SerializedName("avatar")
  private String avatar = null;
  
  @SerializedName("personaname")
  private String personaname = null;
  
  @SerializedName("with_win")
  private Integer withWin = null;
  
  @SerializedName("account_id")
  private Integer accountId = null;
  
  @SerializedName("with_games")
  private Integer withGames = null;
  
  @SerializedName("with_xpm_sum")
  private Integer withXpmSum = null;
  
  @SerializedName("last_played")
  private Integer lastPlayed = null;
  
  @SerializedName("games")
  private Integer games = null;
  
  @SerializedName("win")
  private Integer win = null;
  
  @SerializedName("against_games")
  private Integer againstGames = null;
  

  
  /**
   * with_gpm_sum
   **/
  @ApiModelProperty(value = "with_gpm_sum")
  public Integer getWithGpmSum() {
    return withGpmSum;
  }
  public void setWithGpmSum(Integer withGpmSum) {
    this.withGpmSum = withGpmSum;
  }

  
  /**
   * against_win
   **/
  @ApiModelProperty(value = "against_win")
  public Integer getAgainstWin() {
    return againstWin;
  }
  public void setAgainstWin(Integer againstWin) {
    this.againstWin = againstWin;
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
   * with_win
   **/
  @ApiModelProperty(value = "with_win")
  public Integer getWithWin() {
    return withWin;
  }
  public void setWithWin(Integer withWin) {
    this.withWin = withWin;
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
   * with_games
   **/
  @ApiModelProperty(value = "with_games")
  public Integer getWithGames() {
    return withGames;
  }
  public void setWithGames(Integer withGames) {
    this.withGames = withGames;
  }

  
  /**
   * with_xpm_sum
   **/
  @ApiModelProperty(value = "with_xpm_sum")
  public Integer getWithXpmSum() {
    return withXpmSum;
  }
  public void setWithXpmSum(Integer withXpmSum) {
    this.withXpmSum = withXpmSum;
  }

  
  /**
   * last_played
   **/
  @ApiModelProperty(value = "last_played")
  public Integer getLastPlayed() {
    return lastPlayed;
  }
  public void setLastPlayed(Integer lastPlayed) {
    this.lastPlayed = lastPlayed;
  }

  
  /**
   * games
   **/
  @ApiModelProperty(value = "games")
  public Integer getGames() {
    return games;
  }
  public void setGames(Integer games) {
    this.games = games;
  }

  
  /**
   * win
   **/
  @ApiModelProperty(value = "win")
  public Integer getWin() {
    return win;
  }
  public void setWin(Integer win) {
    this.win = win;
  }

  
  /**
   * against_games
   **/
  @ApiModelProperty(value = "against_games")
  public Integer getAgainstGames() {
    return againstGames;
  }
  public void setAgainstGames(Integer againstGames) {
    this.againstGames = againstGames;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(withGpmSum, inlineResponse20014.withGpmSum) &&
        Objects.equals(againstWin, inlineResponse20014.againstWin) &&
        Objects.equals(lastLogin, inlineResponse20014.lastLogin) &&
        Objects.equals(avatarfull, inlineResponse20014.avatarfull) &&
        Objects.equals(avatar, inlineResponse20014.avatar) &&
        Objects.equals(personaname, inlineResponse20014.personaname) &&
        Objects.equals(withWin, inlineResponse20014.withWin) &&
        Objects.equals(accountId, inlineResponse20014.accountId) &&
        Objects.equals(withGames, inlineResponse20014.withGames) &&
        Objects.equals(withXpmSum, inlineResponse20014.withXpmSum) &&
        Objects.equals(lastPlayed, inlineResponse20014.lastPlayed) &&
        Objects.equals(games, inlineResponse20014.games) &&
        Objects.equals(win, inlineResponse20014.win) &&
        Objects.equals(againstGames, inlineResponse20014.againstGames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withGpmSum, againstWin, lastLogin, avatarfull, avatar, personaname, withWin, accountId, withGames, withXpmSum, lastPlayed, games, win, againstGames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    withGpmSum: ").append(toIndentedString(withGpmSum)).append("\n");
    sb.append("    againstWin: ").append(toIndentedString(againstWin)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    avatarfull: ").append(toIndentedString(avatarfull)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    personaname: ").append(toIndentedString(personaname)).append("\n");
    sb.append("    withWin: ").append(toIndentedString(withWin)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    withGames: ").append(toIndentedString(withGames)).append("\n");
    sb.append("    withXpmSum: ").append(toIndentedString(withXpmSum)).append("\n");
    sb.append("    lastPlayed: ").append(toIndentedString(lastPlayed)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    win: ").append(toIndentedString(win)).append("\n");
    sb.append("    againstGames: ").append(toIndentedString(againstGames)).append("\n");
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
