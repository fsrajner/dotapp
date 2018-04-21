package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2001ResultGoldPerMin;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * result
 **/
@ApiModel(description = "result")
public class InlineResponse2001Result   {
  
  @SerializedName("gold_per_min")
  private List<InlineResponse2001ResultGoldPerMin> goldPerMin = new ArrayList<InlineResponse2001ResultGoldPerMin>();
  
  @SerializedName("tower_damage")
  private List<InlineResponse2001ResultGoldPerMin> towerDamage = new ArrayList<InlineResponse2001ResultGoldPerMin>();
  
  @SerializedName("last_hits_per_min")
  private List<InlineResponse2001ResultGoldPerMin> lastHitsPerMin = new ArrayList<InlineResponse2001ResultGoldPerMin>();
  
  @SerializedName("hero_damage_per_min")
  private List<InlineResponse2001ResultGoldPerMin> heroDamagePerMin = new ArrayList<InlineResponse2001ResultGoldPerMin>();
  
  @SerializedName("xp_per_min")
  private List<InlineResponse2001ResultGoldPerMin> xpPerMin = new ArrayList<InlineResponse2001ResultGoldPerMin>();
  
  @SerializedName("hero_healing_per_min")
  private List<InlineResponse2001ResultGoldPerMin> heroHealingPerMin = new ArrayList<InlineResponse2001ResultGoldPerMin>();
  
  @SerializedName("kills_per_min")
  private List<InlineResponse2001ResultGoldPerMin> killsPerMin = new ArrayList<InlineResponse2001ResultGoldPerMin>();
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultGoldPerMin> getGoldPerMin() {
    return goldPerMin;
  }
  public void setGoldPerMin(List<InlineResponse2001ResultGoldPerMin> goldPerMin) {
    this.goldPerMin = goldPerMin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultGoldPerMin> getTowerDamage() {
    return towerDamage;
  }
  public void setTowerDamage(List<InlineResponse2001ResultGoldPerMin> towerDamage) {
    this.towerDamage = towerDamage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultGoldPerMin> getLastHitsPerMin() {
    return lastHitsPerMin;
  }
  public void setLastHitsPerMin(List<InlineResponse2001ResultGoldPerMin> lastHitsPerMin) {
    this.lastHitsPerMin = lastHitsPerMin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultGoldPerMin> getHeroDamagePerMin() {
    return heroDamagePerMin;
  }
  public void setHeroDamagePerMin(List<InlineResponse2001ResultGoldPerMin> heroDamagePerMin) {
    this.heroDamagePerMin = heroDamagePerMin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultGoldPerMin> getXpPerMin() {
    return xpPerMin;
  }
  public void setXpPerMin(List<InlineResponse2001ResultGoldPerMin> xpPerMin) {
    this.xpPerMin = xpPerMin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultGoldPerMin> getHeroHealingPerMin() {
    return heroHealingPerMin;
  }
  public void setHeroHealingPerMin(List<InlineResponse2001ResultGoldPerMin> heroHealingPerMin) {
    this.heroHealingPerMin = heroHealingPerMin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001ResultGoldPerMin> getKillsPerMin() {
    return killsPerMin;
  }
  public void setKillsPerMin(List<InlineResponse2001ResultGoldPerMin> killsPerMin) {
    this.killsPerMin = killsPerMin;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Result inlineResponse2001Result = (InlineResponse2001Result) o;
    return Objects.equals(goldPerMin, inlineResponse2001Result.goldPerMin) &&
        Objects.equals(towerDamage, inlineResponse2001Result.towerDamage) &&
        Objects.equals(lastHitsPerMin, inlineResponse2001Result.lastHitsPerMin) &&
        Objects.equals(heroDamagePerMin, inlineResponse2001Result.heroDamagePerMin) &&
        Objects.equals(xpPerMin, inlineResponse2001Result.xpPerMin) &&
        Objects.equals(heroHealingPerMin, inlineResponse2001Result.heroHealingPerMin) &&
        Objects.equals(killsPerMin, inlineResponse2001Result.killsPerMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goldPerMin, towerDamage, lastHitsPerMin, heroDamagePerMin, xpPerMin, heroHealingPerMin, killsPerMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Result {\n");
    
    sb.append("    goldPerMin: ").append(toIndentedString(goldPerMin)).append("\n");
    sb.append("    towerDamage: ").append(toIndentedString(towerDamage)).append("\n");
    sb.append("    lastHitsPerMin: ").append(toIndentedString(lastHitsPerMin)).append("\n");
    sb.append("    heroDamagePerMin: ").append(toIndentedString(heroDamagePerMin)).append("\n");
    sb.append("    xpPerMin: ").append(toIndentedString(xpPerMin)).append("\n");
    sb.append("    heroHealingPerMin: ").append(toIndentedString(heroHealingPerMin)).append("\n");
    sb.append("    killsPerMin: ").append(toIndentedString(killsPerMin)).append("\n");
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
