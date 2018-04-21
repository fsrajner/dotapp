package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2008KillsLog   {
  
  @SerializedName("time")
  private Integer time = null;
  
  @SerializedName("key")
  private String key = null;
  

  
  /**
   * Time in seconds the player killed the hero
   **/
  @ApiModelProperty(value = "Time in seconds the player killed the hero")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }

  
  /**
   * Hero killed
   **/
  @ApiModelProperty(value = "Hero killed")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008KillsLog inlineResponse2008KillsLog = (InlineResponse2008KillsLog) o;
    return Objects.equals(time, inlineResponse2008KillsLog.time) &&
        Objects.equals(key, inlineResponse2008KillsLog.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008KillsLog {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
