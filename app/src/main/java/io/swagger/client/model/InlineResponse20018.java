package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20018   {
  
  @SerializedName("field")
  private String field = null;
  
  @SerializedName("sum")
  private Integer sum = null;
  
  @SerializedName("n")
  private Integer n = null;
  

  
  /**
   * field
   **/
  @ApiModelProperty(value = "field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  
  /**
   * sum
   **/
  @ApiModelProperty(value = "sum")
  public Integer getSum() {
    return sum;
  }
  public void setSum(Integer sum) {
    this.sum = sum;
  }

  
  /**
   * number
   **/
  @ApiModelProperty(value = "number")
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
    InlineResponse20018 inlineResponse20018 = (InlineResponse20018) o;
    return Objects.equals(field, inlineResponse20018.field) &&
        Objects.equals(sum, inlineResponse20018.sum) &&
        Objects.equals(n, inlineResponse20018.n);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, sum, n);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018 {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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
