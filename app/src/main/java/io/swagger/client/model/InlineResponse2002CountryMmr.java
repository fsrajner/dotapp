package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2002CountryMmrFields;
import io.swagger.client.model.InlineResponse2002CountryMmrRows;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * country_mmr
 **/
@ApiModel(description = "country_mmr")
public class InlineResponse2002CountryMmr   {
  
  @SerializedName("rowAsArray")
  private Boolean rowAsArray = null;
  
  @SerializedName("rowCount")
  private Integer rowCount = null;
  
  @SerializedName("rows")
  private List<InlineResponse2002CountryMmrRows> rows = new ArrayList<InlineResponse2002CountryMmrRows>();
  
  @SerializedName("fields")
  private List<InlineResponse2002CountryMmrFields> fields = new ArrayList<InlineResponse2002CountryMmrFields>();
  
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
  public List<InlineResponse2002CountryMmrRows> getRows() {
    return rows;
  }
  public void setRows(List<InlineResponse2002CountryMmrRows> rows) {
    this.rows = rows;
  }

  
  /**
   * fields
   **/
  @ApiModelProperty(value = "fields")
  public List<InlineResponse2002CountryMmrFields> getFields() {
    return fields;
  }
  public void setFields(List<InlineResponse2002CountryMmrFields> fields) {
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
    InlineResponse2002CountryMmr inlineResponse2002CountryMmr = (InlineResponse2002CountryMmr) o;
    return Objects.equals(rowAsArray, inlineResponse2002CountryMmr.rowAsArray) &&
        Objects.equals(rowCount, inlineResponse2002CountryMmr.rowCount) &&
        Objects.equals(rows, inlineResponse2002CountryMmr.rows) &&
        Objects.equals(fields, inlineResponse2002CountryMmr.fields) &&
        Objects.equals(commmand, inlineResponse2002CountryMmr.commmand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowAsArray, rowCount, rows, fields, commmand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002CountryMmr {\n");
    
    sb.append("    rowAsArray: ").append(toIndentedString(rowAsArray)).append("\n");
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
