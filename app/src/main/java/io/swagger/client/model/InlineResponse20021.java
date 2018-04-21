package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20021   {
  
  @SerializedName("my_word_counts")
  private Object myWordCounts = null;
  
  @SerializedName("all_word_counts")
  private Object allWordCounts = null;
  

  
  /**
   * my_word_counts
   **/
  @ApiModelProperty(value = "my_word_counts")
  public Object getMyWordCounts() {
    return myWordCounts;
  }
  public void setMyWordCounts(Object myWordCounts) {
    this.myWordCounts = myWordCounts;
  }

  
  /**
   * all_word_counts
   **/
  @ApiModelProperty(value = "all_word_counts")
  public Object getAllWordCounts() {
    return allWordCounts;
  }
  public void setAllWordCounts(Object allWordCounts) {
    this.allWordCounts = allWordCounts;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021 inlineResponse20021 = (InlineResponse20021) o;
    return Objects.equals(myWordCounts, inlineResponse20021.myWordCounts) &&
        Objects.equals(allWordCounts, inlineResponse20021.allWordCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myWordCounts, allWordCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021 {\n");
    
    sb.append("    myWordCounts: ").append(toIndentedString(myWordCounts)).append("\n");
    sb.append("    allWordCounts: ").append(toIndentedString(allWordCounts)).append("\n");
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
