package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2002RanksRows   {
  
  @SerializedName("bin")
  private Integer bin = null;
  
  @SerializedName("bin_name")
  private Integer binName = null;
  
  @SerializedName("cumulative_sum")
  private Integer cumulativeSum = null;
  
  @SerializedName("count")
  private Integer count = null;
  

  
  /**
   * bin
   **/
  @ApiModelProperty(value = "bin")
  public Integer getBin() {
    return bin;
  }
  public void setBin(Integer bin) {
    this.bin = bin;
  }

  
  /**
   * bin_name
   **/
  @ApiModelProperty(value = "bin_name")
  public Integer getBinName() {
    return binName;
  }
  public void setBinName(Integer binName) {
    this.binName = binName;
  }

  
  /**
   * cumulative_sum
   **/
  @ApiModelProperty(value = "cumulative_sum")
  public Integer getCumulativeSum() {
    return cumulativeSum;
  }
  public void setCumulativeSum(Integer cumulativeSum) {
    this.cumulativeSum = cumulativeSum;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002RanksRows inlineResponse2002RanksRows = (InlineResponse2002RanksRows) o;
    return Objects.equals(bin, inlineResponse2002RanksRows.bin) &&
        Objects.equals(binName, inlineResponse2002RanksRows.binName) &&
        Objects.equals(cumulativeSum, inlineResponse2002RanksRows.cumulativeSum) &&
        Objects.equals(count, inlineResponse2002RanksRows.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bin, binName, cumulativeSum, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002RanksRows {\n");
    
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    binName: ").append(toIndentedString(binName)).append("\n");
    sb.append("    cumulativeSum: ").append(toIndentedString(cumulativeSum)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
