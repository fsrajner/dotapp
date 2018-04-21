package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2002CountryMmrRows   {
  
  @SerializedName("avg")
  private String avg = null;
  
  @SerializedName("common")
  private String common = null;
  
  @SerializedName("count")
  private Integer count = null;
  
  @SerializedName("loccountrycode")
  private String loccountrycode = null;
  

  
  /**
   * avg
   **/
  @ApiModelProperty(value = "avg")
  public String getAvg() {
    return avg;
  }
  public void setAvg(String avg) {
    this.avg = avg;
  }

  
  /**
   * common
   **/
  @ApiModelProperty(value = "common")
  public String getCommon() {
    return common;
  }
  public void setCommon(String common) {
    this.common = common;
  }

  
  /**
   * count
   **/
  @ApiModelProperty(value = "count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002CountryMmrRows inlineResponse2002CountryMmrRows = (InlineResponse2002CountryMmrRows) o;
    return Objects.equals(avg, inlineResponse2002CountryMmrRows.avg) &&
        Objects.equals(common, inlineResponse2002CountryMmrRows.common) &&
        Objects.equals(count, inlineResponse2002CountryMmrRows.count) &&
        Objects.equals(loccountrycode, inlineResponse2002CountryMmrRows.loccountrycode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avg, common, count, loccountrycode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002CountryMmrRows {\n");
    
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
