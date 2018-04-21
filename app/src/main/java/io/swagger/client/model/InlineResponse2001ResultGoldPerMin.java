package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2001ResultGoldPerMin   {
  
  @SerializedName("percentile")
  private BigDecimal percentile = null;
  
  @SerializedName("value")
  private Integer value = null;
  

  
  /**
   * percentile
   **/
  @ApiModelProperty(value = "percentile")
  public BigDecimal getPercentile() {
    return percentile;
  }
  public void setPercentile(BigDecimal percentile) {
    this.percentile = percentile;
  }

  
  /**
   * value
   **/
  @ApiModelProperty(value = "value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001ResultGoldPerMin inlineResponse2001ResultGoldPerMin = (InlineResponse2001ResultGoldPerMin) o;
    return Objects.equals(percentile, inlineResponse2001ResultGoldPerMin.percentile) &&
        Objects.equals(value, inlineResponse2001ResultGoldPerMin.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentile, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001ResultGoldPerMin {\n");
    
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
