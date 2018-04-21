package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2002RanksFields   {
  
  @SerializedName("columnID")
  private Integer columnID = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("dataTypeID")
  private Integer dataTypeID = null;
  
  @SerializedName("format")
  private String format = null;
  
  @SerializedName("tableID")
  private Integer tableID = null;
  
  @SerializedName("dataTypeModifier")
  private String dataTypeModifier = null;
  
  @SerializedName("dataTypeSize")
  private Integer dataTypeSize = null;
  

  
  /**
   * columnID
   **/
  @ApiModelProperty(value = "columnID")
  public Integer getColumnID() {
    return columnID;
  }
  public void setColumnID(Integer columnID) {
    this.columnID = columnID;
  }

  
  /**
   * name
   **/
  @ApiModelProperty(value = "name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * dataTypeID
   **/
  @ApiModelProperty(value = "dataTypeID")
  public Integer getDataTypeID() {
    return dataTypeID;
  }
  public void setDataTypeID(Integer dataTypeID) {
    this.dataTypeID = dataTypeID;
  }

  
  /**
   * format
   **/
  @ApiModelProperty(value = "format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   * tableID
   **/
  @ApiModelProperty(value = "tableID")
  public Integer getTableID() {
    return tableID;
  }
  public void setTableID(Integer tableID) {
    this.tableID = tableID;
  }

  
  /**
   * dataTypeModifier
   **/
  @ApiModelProperty(value = "dataTypeModifier")
  public String getDataTypeModifier() {
    return dataTypeModifier;
  }
  public void setDataTypeModifier(String dataTypeModifier) {
    this.dataTypeModifier = dataTypeModifier;
  }

  
  /**
   * dataTypeSize
   **/
  @ApiModelProperty(value = "dataTypeSize")
  public Integer getDataTypeSize() {
    return dataTypeSize;
  }
  public void setDataTypeSize(Integer dataTypeSize) {
    this.dataTypeSize = dataTypeSize;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002RanksFields inlineResponse2002RanksFields = (InlineResponse2002RanksFields) o;
    return Objects.equals(columnID, inlineResponse2002RanksFields.columnID) &&
        Objects.equals(name, inlineResponse2002RanksFields.name) &&
        Objects.equals(dataTypeID, inlineResponse2002RanksFields.dataTypeID) &&
        Objects.equals(format, inlineResponse2002RanksFields.format) &&
        Objects.equals(tableID, inlineResponse2002RanksFields.tableID) &&
        Objects.equals(dataTypeModifier, inlineResponse2002RanksFields.dataTypeModifier) &&
        Objects.equals(dataTypeSize, inlineResponse2002RanksFields.dataTypeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnID, name, dataTypeID, format, tableID, dataTypeModifier, dataTypeSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002RanksFields {\n");
    
    sb.append("    columnID: ").append(toIndentedString(columnID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataTypeID: ").append(toIndentedString(dataTypeID)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    tableID: ").append(toIndentedString(tableID)).append("\n");
    sb.append("    dataTypeModifier: ").append(toIndentedString(dataTypeModifier)).append("\n");
    sb.append("    dataTypeSize: ").append(toIndentedString(dataTypeSize)).append("\n");
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
