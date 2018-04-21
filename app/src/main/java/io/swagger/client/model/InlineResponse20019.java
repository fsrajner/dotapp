package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20019   {
  
  @SerializedName("obs")
  private Object obs = null;
  
  @SerializedName("sen")
  private Object sen = null;
  

  
  /**
   * obs
   **/
  @ApiModelProperty(value = "obs")
  public Object getObs() {
    return obs;
  }
  public void setObs(Object obs) {
    this.obs = obs;
  }

  
  /**
   * sen
   **/
  @ApiModelProperty(value = "sen")
  public Object getSen() {
    return sen;
  }
  public void setSen(Object sen) {
    this.sen = sen;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20019 inlineResponse20019 = (InlineResponse20019) o;
    return Objects.equals(obs, inlineResponse20019.obs) &&
        Objects.equals(sen, inlineResponse20019.sen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(obs, sen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20019 {\n");
    
    sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
    sb.append("    sen: ").append(toIndentedString(sen)).append("\n");
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
