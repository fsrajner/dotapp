package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2007   {
  
  @SerializedName("ticket")
  private String ticket = null;
  
  @SerializedName("tier")
  private String tier = null;
  
  @SerializedName("leagueid")
  private Integer leagueid = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("banner")
  private String banner = null;
  

  
  /**
   * ticket
   **/
  @ApiModelProperty(value = "ticket")
  public String getTicket() {
    return ticket;
  }
  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  
  /**
   * tier
   **/
  @ApiModelProperty(value = "tier")
  public String getTier() {
    return tier;
  }
  public void setTier(String tier) {
    this.tier = tier;
  }

  
  /**
   * leagueid
   **/
  @ApiModelProperty(value = "leagueid")
  public Integer getLeagueid() {
    return leagueid;
  }
  public void setLeagueid(Integer leagueid) {
    this.leagueid = leagueid;
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
   * banner
   **/
  @ApiModelProperty(value = "banner")
  public String getBanner() {
    return banner;
  }
  public void setBanner(String banner) {
    this.banner = banner;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(ticket, inlineResponse2007.ticket) &&
        Objects.equals(tier, inlineResponse2007.tier) &&
        Objects.equals(leagueid, inlineResponse2007.leagueid) &&
        Objects.equals(name, inlineResponse2007.name) &&
        Objects.equals(banner, inlineResponse2007.banner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticket, tier, leagueid, name, banner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    leagueid: ").append(toIndentedString(leagueid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
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
