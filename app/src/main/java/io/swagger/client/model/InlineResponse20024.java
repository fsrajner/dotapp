package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse20024Rankings;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20024   {
  
  @SerializedName("rankings")
  private InlineResponse20024Rankings rankings = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse20024Rankings getRankings() {
    return rankings;
  }
  public void setRankings(InlineResponse20024Rankings rankings) {
    this.rankings = rankings;
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
    InlineResponse20024 inlineResponse20024 = (InlineResponse20024) o;
    return Objects.equals(rankings, inlineResponse20024.rankings) &&
        Objects.equals(heroId, inlineResponse20024.heroId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankings, heroId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20024 {\n");
    
    sb.append("    rankings: ").append(toIndentedString(rankings)).append("\n");
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
