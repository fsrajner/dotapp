package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20026   {
  
  @SerializedName("cluster")
  private Integer cluster = null;
  
  @SerializedName("replay_salt")
  private Integer replaySalt = null;
  
  @SerializedName("match_id")
  private Integer matchId = null;
  

  
  /**
   * cluster
   **/
  @ApiModelProperty(value = "cluster")
  public Integer getCluster() {
    return cluster;
  }
  public void setCluster(Integer cluster) {
    this.cluster = cluster;
  }

  
  /**
   * replay_salt
   **/
  @ApiModelProperty(value = "replay_salt")
  public Integer getReplaySalt() {
    return replaySalt;
  }
  public void setReplaySalt(Integer replaySalt) {
    this.replaySalt = replaySalt;
  }

  
  /**
   * match_id
   **/
  @ApiModelProperty(value = "match_id")
  public Integer getMatchId() {
    return matchId;
  }
  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20026 inlineResponse20026 = (InlineResponse20026) o;
    return Objects.equals(cluster, inlineResponse20026.cluster) &&
        Objects.equals(replaySalt, inlineResponse20026.replaySalt) &&
        Objects.equals(matchId, inlineResponse20026.matchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, replaySalt, matchId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20026 {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    replaySalt: ").append(toIndentedString(replaySalt)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
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
