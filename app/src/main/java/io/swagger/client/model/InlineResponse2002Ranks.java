package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2002RanksFields;
import io.swagger.client.model.InlineResponse2002RanksRows;
import io.swagger.client.model.InlineResponse2002RanksSum;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * ranks
 **/
@ApiModel(description = "ranks")
public class InlineResponse2002Ranks   {
  
  @SerializedName("rowAsArray")
  private Boolean rowAsArray = null;
  
  @SerializedName("sum")
  private InlineResponse2002RanksSum sum = null;
  
  @SerializedName("rowCount")
  private Integer rowCount = null;
  
  @SerializedName("rows")
  private List<InlineResponse2002RanksRows> rows = new ArrayList<InlineResponse2002RanksRows>();
  
  @SerializedName("fields")
  private List<InlineResponse2002RanksFields> fields = new ArrayList<InlineResponse2002RanksFields>();
  
  @SerializedName("commmand")
  private String commmand = null;
  

  
  /**
   * rowAsArray
   **/
  @ApiModelProperty(value = "rowAsArray")
  public Boolean getRowAsArray() {
    return rowAsArray;
  }
  public void setRowAsArray(Boolean rowAsArray) {
    this.rowAsArray = rowAsArray;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2002RanksSum getSum() {
    return sum;
  }
  public void setSum(InlineResponse2002RanksSum sum) {
    this.sum = sum;
  }

  
  /**
   * rowCount
   **/
  @ApiModelProperty(value = "rowCount")
  public Integer getRowCount() {
    return rowCount;
  }
  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }

  
  /**
   * rows
   **/
  @ApiModelProperty(value = "rows")
  public List<InlineResponse2002RanksRows> getRows() {
    return rows;
  }
  public void setRows(List<InlineResponse2002RanksRows> rows) {
    this.rows = rows;
  }

  
  /**
   * fields
   **/
  @ApiModelProperty(value = "fields")
  public List<InlineResponse2002RanksFields> getFields() {
    return fields;
  }
  public void setFields(List<InlineResponse2002RanksFields> fields) {
    this.fields = fields;
  }

  
  /**
   * command
   **/
  @ApiModelProperty(value = "command")
  public String getCommmand() {
    return commmand;
  }
  public void setCommmand(String commmand) {
    this.commmand = commmand;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Ranks inlineResponse2002Ranks = (InlineResponse2002Ranks) o;
    return Objects.equals(rowAsArray, inlineResponse2002Ranks.rowAsArray) &&
        Objects.equals(sum, inlineResponse2002Ranks.sum) &&
        Objects.equals(rowCount, inlineResponse2002Ranks.rowCount) &&
        Objects.equals(rows, inlineResponse2002Ranks.rows) &&
        Objects.equals(fields, inlineResponse2002Ranks.fields) &&
        Objects.equals(commmand, inlineResponse2002Ranks.commmand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowAsArray, sum, rowCount, rows, fields, commmand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Ranks {\n");
    
    sb.append("    rowAsArray: ").append(toIndentedString(rowAsArray)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    commmand: ").append(toIndentedString(commmand)).append("\n");
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
