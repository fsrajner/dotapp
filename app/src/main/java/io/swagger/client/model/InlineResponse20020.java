package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20020   {
  
  @SerializedName("lose")
  private Integer lose = null;
  
  @SerializedName("win")
  private Integer win = null;
  

  
  /**
   * Number of loses
   **/
  @ApiModelProperty(value = "Number of loses")
  public Integer getLose() {
    return lose;
  }
  public void setLose(Integer lose) {
    this.lose = lose;
  }

  
  /**
   * Number of wins
   **/
  @ApiModelProperty(value = "Number of wins")
  public Integer getWin() {
    return win;
  }
  public void setWin(Integer win) {
    this.win = win;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20020 inlineResponse20020 = (InlineResponse20020) o;
    return Objects.equals(lose, inlineResponse20020.lose) &&
        Objects.equals(win, inlineResponse20020.win);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lose, win);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20020 {\n");
    
    sb.append("    lose: ").append(toIndentedString(lose)).append("\n");
    sb.append("    win: ").append(toIndentedString(win)).append("\n");
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
