package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20031   {
  
  @SerializedName("account_id")
  private Integer accountId = null;
  
  @SerializedName("similarity")
  private BigDecimal similarity = null;
  
  @SerializedName("avatarfull")
  private String avatarfull = null;
  
  @SerializedName("personaname")
  private String personaname = null;
  

  
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
   * similarity
   **/
  @ApiModelProperty(value = "similarity")
  public BigDecimal getSimilarity() {
    return similarity;
  }
  public void setSimilarity(BigDecimal similarity) {
    this.similarity = similarity;
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
   * personaname
   **/
  @ApiModelProperty(value = "personaname")
  public String getPersonaname() {
    return personaname;
  }
  public void setPersonaname(String personaname) {
    this.personaname = personaname;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20031 inlineResponse20031 = (InlineResponse20031) o;
    return Objects.equals(accountId, inlineResponse20031.accountId) &&
        Objects.equals(similarity, inlineResponse20031.similarity) &&
        Objects.equals(avatarfull, inlineResponse20031.avatarfull) &&
        Objects.equals(personaname, inlineResponse20031.personaname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, similarity, avatarfull, personaname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20031 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    avatarfull: ").append(toIndentedString(avatarfull)).append("\n");
    sb.append("    personaname: ").append(toIndentedString(personaname)).append("\n");
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
