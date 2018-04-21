package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse20030   {
  
  @SerializedName("column_name")
  private String columnName = null;
  
  @SerializedName("data_type")
  private String dataType = null;
  
  @SerializedName("table_name")
  private String tableName = null;
  

  
  /**
   * column_name
   **/
  @ApiModelProperty(value = "column_name")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  
  /**
   * data_type
   **/
  @ApiModelProperty(value = "data_type")
  public String getDataType() {
    return dataType;
  }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  
  /**
   * table_name
   **/
  @ApiModelProperty(value = "table_name")
  public String getTableName() {
    return tableName;
  }
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20030 inlineResponse20030 = (InlineResponse20030) o;
    return Objects.equals(columnName, inlineResponse20030.columnName) &&
        Objects.equals(dataType, inlineResponse20030.dataType) &&
        Objects.equals(tableName, inlineResponse20030.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, dataType, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20030 {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
