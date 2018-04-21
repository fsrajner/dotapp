package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2001Result;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2001   {
  
  @SerializedName("result")
  private InlineResponse2001Result result = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2001Result getResult() {
    return result;
  }
  public void setResult(InlineResponse2001Result result) {
    this.result = result;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHeroId() {
    return heroId;
  }
  public void setHeroId(Integer heroId) {
    this.heroId = heroId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(result, inlineResponse2001.result) &&
        Objects.equals(heroId, inlineResponse2001.heroId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, heroId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
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
