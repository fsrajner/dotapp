package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2002CountryMmr;
import io.swagger.client.model.InlineResponse2002Mmr;
import io.swagger.client.model.InlineResponse2002Ranks;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2002   {
  
  @SerializedName("ranks")
  private InlineResponse2002Ranks ranks = null;
  
  @SerializedName("mmr")
  private InlineResponse2002Mmr mmr = null;
  
  @SerializedName("country_mmr")
  private InlineResponse2002CountryMmr countryMmr = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2002Ranks getRanks() {
    return ranks;
  }
  public void setRanks(InlineResponse2002Ranks ranks) {
    this.ranks = ranks;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2002Mmr getMmr() {
    return mmr;
  }
  public void setMmr(InlineResponse2002Mmr mmr) {
    this.mmr = mmr;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2002CountryMmr getCountryMmr() {
    return countryMmr;
  }
  public void setCountryMmr(InlineResponse2002CountryMmr countryMmr) {
    this.countryMmr = countryMmr;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(ranks, inlineResponse2002.ranks) &&
        Objects.equals(mmr, inlineResponse2002.mmr) &&
        Objects.equals(countryMmr, inlineResponse2002.countryMmr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranks, mmr, countryMmr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    ranks: ").append(toIndentedString(ranks)).append("\n");
    sb.append("    mmr: ").append(toIndentedString(mmr)).append("\n");
    sb.append("    countryMmr: ").append(toIndentedString(countryMmr)).append("\n");
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
