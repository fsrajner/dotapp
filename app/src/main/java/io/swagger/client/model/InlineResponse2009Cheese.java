package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * cheese
 **/
@ApiModel(description = "cheese")
public class InlineResponse2009Cheese   {
  
  @SerializedName("goal")
  private String goal = null;
  
  @SerializedName("cheese")
  private String cheese = null;
  

  
  /**
   * goal
   **/
  @ApiModelProperty(value = "goal")
  public String getGoal() {
    return goal;
  }
  public void setGoal(String goal) {
    this.goal = goal;
  }

  
  /**
   * cheese
   **/
  @ApiModelProperty(value = "cheese")
  public String getCheese() {
    return cheese;
  }
  public void setCheese(String cheese) {
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
    InlineResponse2009Cheese inlineResponse2009Cheese = (InlineResponse2009Cheese) o;
    return Objects.equals(goal, inlineResponse2009Cheese.goal) &&
        Objects.equals(cheese, inlineResponse2009Cheese.cheese);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goal, cheese);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009Cheese {\n");
    
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
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
