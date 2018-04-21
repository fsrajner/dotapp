package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




/**
 * mmr_estimate
 **/
@ApiModel(description = "mmr_estimate")
public class InlineResponse20010MmrEstimate   {
  
  @SerializedName("estimate")
  private BigDecimal estimate = null;
  
  @SerializedName("stdDev")
  private BigDecimal stdDev = null;
  
  @SerializedName("n")
  private Integer n = null;
  

  
  /**
   * estimate
   **/
  @ApiModelProperty(value = "estimate")
  public BigDecimal getEstimate() {
    return estimate;
  }
  public void setEstimate(BigDecimal estimate) {
    this.estimate = estimate;
  }

  
  /**
   * stdDev
   **/
  @ApiModelProperty(value = "stdDev")
  public BigDecimal getStdDev() {
    return stdDev;
  }
  public void setStdDev(BigDecimal stdDev) {
    this.stdDev = stdDev;
  }

  
  /**
   * n
   **/
  @ApiModelProperty(value = "n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010MmrEstimate inlineResponse20010MmrEstimate = (InlineResponse20010MmrEstimate) o;
    return Objects.equals(estimate, inlineResponse20010MmrEstimate.estimate) &&
        Objects.equals(stdDev, inlineResponse20010MmrEstimate.stdDev) &&
        Objects.equals(n, inlineResponse20010MmrEstimate.n);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimate, stdDev, n);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010MmrEstimate {\n");
    
    sb.append("    estimate: ").append(toIndentedString(estimate)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
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
