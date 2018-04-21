package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2004   {
  
  @SerializedName("primary_attr")
  private String primaryAttr = null;
  
  @SerializedName("attack_type")
  private String attackType = null;
  
  @SerializedName("roles")
  private List<String> roles = new ArrayList<String>();
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("id")
  private Integer id = null;
  
  @SerializedName("localized_name")
  private String localizedName = null;
  

  
  /**
   * Hero primary shorthand attribute name, e.g. 'agi'
   **/
  @ApiModelProperty(value = "Hero primary shorthand attribute name, e.g. 'agi'")
  public String getPrimaryAttr() {
    return primaryAttr;
  }
  public void setPrimaryAttr(String primaryAttr) {
    this.primaryAttr = primaryAttr;
  }

  
  /**
   * Hero attack type, either 'Melee' or 'Ranged'
   **/
  @ApiModelProperty(value = "Hero attack type, either 'Melee' or 'Ranged'")
  public String getAttackType() {
    return attackType;
  }
  public void setAttackType(String attackType) {
    this.attackType = attackType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRoles() {
    return roles;
  }
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  
  /**
   * Dota hero command name, e.g. 'npc_dota_hero_antimage'
   **/
  @ApiModelProperty(value = "Dota hero command name, e.g. 'npc_dota_hero_antimage'")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Numeric identifier for the hero object
   **/
  @ApiModelProperty(value = "Numeric identifier for the hero object")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * Hero name, e.g. 'Anti-Mage'
   **/
  @ApiModelProperty(value = "Hero name, e.g. 'Anti-Mage'")
  public String getLocalizedName() {
    return localizedName;
  }
  public void setLocalizedName(String localizedName) {
    this.localizedName = localizedName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(primaryAttr, inlineResponse2004.primaryAttr) &&
        Objects.equals(attackType, inlineResponse2004.attackType) &&
        Objects.equals(roles, inlineResponse2004.roles) &&
        Objects.equals(name, inlineResponse2004.name) &&
        Objects.equals(id, inlineResponse2004.id) &&
        Objects.equals(localizedName, inlineResponse2004.localizedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryAttr, attackType, roles, name, id, localizedName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    primaryAttr: ").append(toIndentedString(primaryAttr)).append("\n");
    sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localizedName: ").append(toIndentedString(localizedName)).append("\n");
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
