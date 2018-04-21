package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2009Cheese;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2009   {
  
  @SerializedName("banner")
  private Object banner = null;
  
  @SerializedName("cheese")
  private InlineResponse2009Cheese cheese = null;
  

  
  /**
   * banner
   **/
  @ApiModelProperty(value = "banner")
  public Object getBanner() {
    return banner;
  }
  public void setBanner(Object banner) {
    this.banner = banner;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2009Cheese getCheese() {
    return cheese;
  }
  public void setCheese(InlineResponse2009Cheese cheese) {
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
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(banner, inlineResponse2009.banner) &&
        Objects.equals(cheese, inlineResponse2009.cheese);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banner, cheese);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
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
