package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2008BuybackLog;
import io.swagger.client.model.InlineResponse2008KillsLog;
import io.swagger.client.model.InlineResponse2008PurchaseLog;
import io.swagger.client.model.InlineResponse2008RunesLog;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;




/**
 * player
 **/
@ApiModel(description = "player")
public class InlineResponse2008Players   {
  
  @SerializedName("obs")
  private Object obs = null;
  
  @SerializedName("cluster")
  private Integer cluster = null;
  
  @SerializedName("gold_spent")
  private Integer goldSpent = null;
  
  @SerializedName("obs_left_log")
  private List<InlineResponse200> obsLeftLog = new ArrayList<InlineResponse200>();
  
  @SerializedName("runes")
  private Map<String, Integer> runes = new HashMap<String, Integer>();
  
  @SerializedName("observer_kills")
  private Integer observerKills = null;
  
  @SerializedName("purchase_tpscroll")
  private Object purchaseTpscroll = null;
  
  @SerializedName("obs_log")
  private List<InlineResponse200> obsLog = new ArrayList<InlineResponse200>();
  
  @SerializedName("lane_role")
  private Integer laneRole = null;
  
  @SerializedName("observer_uses")
  private Integer observerUses = null;
  
  @SerializedName("patch")
  private Integer patch = null;
  
  @SerializedName("neutral_kills")
  private Integer neutralKills = null;
  
  @SerializedName("roshan_kills")
  private Integer roshanKills = null;
  
  @SerializedName("item_uses")
  private Object itemUses = null;
  
  @SerializedName("pings")
  private Integer pings = null;
  
  @SerializedName("deaths")
  private Integer deaths = null;
  
  @SerializedName("purchase_log")
  private List<InlineResponse2008PurchaseLog> purchaseLog = new ArrayList<InlineResponse2008PurchaseLog>();
  
  @SerializedName("gold_per_min")
  private Integer goldPerMin = null;
  
  @SerializedName("lose")
  private Integer lose = null;
  
  @SerializedName("kda")
  private BigDecimal kda = null;
  
  @SerializedName("lane_pos")
  private Object lanePos = null;
  
  @SerializedName("kills_per_min")
  private BigDecimal killsPerMin = null;
  
  @SerializedName("xp_reasons")
  private Object xpReasons = null;
  
  @SerializedName("buyback_count")
  private Integer buybackCount = null;
  
  @SerializedName("necronomicon_kills")
  private Integer necronomiconKills = null;
  
  @SerializedName("multi_kills")
  private Object multiKills = null;
  
  @SerializedName("kills_log")
  private List<InlineResponse2008KillsLog> killsLog = new ArrayList<InlineResponse2008KillsLog>();
  
  @SerializedName("rune_pickups")
  private Integer runePickups = null;
  
  @SerializedName("actions")
  private Object actions = null;
  
  @SerializedName("damage")
  private Object damage = null;
  
  @SerializedName("lh_t")
  private List<Integer> lhT = new ArrayList<Integer>();
  
  @SerializedName("gold_t")
  private List<Integer> goldT = new ArrayList<Integer>();
  
  @SerializedName("first_purchase_time")
  private Object firstPurchaseTime = null;
  
  @SerializedName("additional_units")
  private Object additionalUnits = null;
  
  @SerializedName("gold")
  private Integer gold = null;
  
  @SerializedName("radiant_win")
  private Boolean radiantWin = null;
  
  @SerializedName("camps_stacked")
  private Integer campsStacked = null;
  
  @SerializedName("runes_log")
  private List<InlineResponse2008RunesLog> runesLog = new ArrayList<InlineResponse2008RunesLog>();
  
  @SerializedName("purchase_time")
  private Object purchaseTime = null;
  
  @SerializedName("sen")
  private Object sen = null;
  
  @SerializedName("ancient_kills")
  private Integer ancientKills = null;
  
  @SerializedName("actions_per_min")
  private Integer actionsPerMin = null;
  
  @SerializedName("match_id")
  private Integer matchId = null;
  
  @SerializedName("life_state_dead")
  private Integer lifeStateDead = null;
  
  @SerializedName("lane_kills")
  private Integer laneKills = null;
  
  @SerializedName("hero_kills")
  private Integer heroKills = null;
  
  @SerializedName("stuns")
  private BigDecimal stuns = null;
  
  @SerializedName("account_id")
  private Integer accountId = null;
  
  @SerializedName("leaver_status")
  private Integer leaverStatus = null;
  
  @SerializedName("hero_healing")
  private Integer heroHealing = null;
  
  @SerializedName("max_hero_hit")
  private Object maxHeroHit = null;
  
  @SerializedName("killed_by")
  private Object killedBy = null;
  
  @SerializedName("game_mode")
  private Integer gameMode = null;
  
  @SerializedName("obs_placed")
  private Integer obsPlaced = null;
  
  @SerializedName("total_xp")
  private Integer totalXp = null;
  
  @SerializedName("item_win")
  private Object itemWin = null;
  
  @SerializedName("gold_reasons")
  private Object goldReasons = null;
  
  @SerializedName("personaname")
  private String personaname = null;
  
  @SerializedName("damage_inflictor_received")
  private Object damageInflictorReceived = null;
  
  @SerializedName("damage_inflictor")
  private Object damageInflictor = null;
  
  @SerializedName("total_gold")
  private Integer totalGold = null;
  
  @SerializedName("buyback_log")
  private List<InlineResponse2008BuybackLog> buybackLog = new ArrayList<InlineResponse2008BuybackLog>();
  
  @SerializedName("sentry_kills")
  private Integer sentryKills = null;
  
  @SerializedName("kill_streaks")
  private Object killStreaks = null;
  
  @SerializedName("hero_hits")
  private Object heroHits = null;
  
  @SerializedName("xp_per_min")
  private Integer xpPerMin = null;
  
  @SerializedName("benchmarks")
  private Object benchmarks = null;
  
  @SerializedName("level")
  private Integer level = null;
  
  @SerializedName("abandons")
  private Integer abandons = null;
  
  @SerializedName("player_slot")
  private Integer playerSlot = null;
  
  @SerializedName("damage_taken")
  private Object damageTaken = null;
  
  @SerializedName("start_time")
  private Integer startTime = null;
  
  @SerializedName("last_hits")
  private Integer lastHits = null;
  
  @SerializedName("sentry_uses")
  private Integer sentryUses = null;
  
  @SerializedName("ability_uses")
  private Object abilityUses = null;
  
  @SerializedName("item_5")
  private Integer item5 = null;
  
  @SerializedName("item_4")
  private Integer item4 = null;
  
  @SerializedName("item_usage")
  private Object itemUsage = null;
  
  @SerializedName("item_3")
  private Integer item3 = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("item_2")
  private Integer item2 = null;
  
  @SerializedName("item_1")
  private Integer item1 = null;
  
  @SerializedName("lane_efficiency")
  private BigDecimal laneEfficiency = null;
  
  @SerializedName("creeps_stacked")
  private Integer creepsStacked = null;
  
  @SerializedName("item_0")
  private Integer item0 = null;
  
  @SerializedName("region")
  private Integer region = null;
  
  @SerializedName("kills")
  private Integer kills = null;
  
  @SerializedName("hero_damage")
  private Integer heroDamage = null;
  
  @SerializedName("tower_kills")
  private Integer towerKills = null;
  
  @SerializedName("backpack_1")
  private Integer backpack1 = null;
  
  @SerializedName("damage_targets")
  private Object damageTargets = null;
  
  @SerializedName("backpack_2")
  private Integer backpack2 = null;
  
  @SerializedName("denies")
  private Integer denies = null;
  
  @SerializedName("backpack_0")
  private Integer backpack0 = null;
  
  @SerializedName("life_state")
  private Object lifeState = null;
  
  @SerializedName("courier_kills")
  private Integer courierKills = null;
  
  @SerializedName("cosmetics")
  private List<Integer> cosmetics = new ArrayList<Integer>();
  
  @SerializedName("dn_t")
  private List<Integer> dnT = new ArrayList<Integer>();
  
  @SerializedName("duration")
  private Integer duration = null;
  
  @SerializedName("permanent_buffs")
  private List<InlineResponse200> permanentBuffs = new ArrayList<InlineResponse200>();
  
  @SerializedName("times")
  private List<Integer> times = new ArrayList<Integer>();
  
  @SerializedName("lane_efficiency_pct")
  private BigDecimal laneEfficiencyPct = null;
  
  @SerializedName("assists")
  private Integer assists = null;
  
  @SerializedName("tower_damage")
  private Integer towerDamage = null;
  
  @SerializedName("xp_t")
  private List<Integer> xpT = new ArrayList<Integer>();
  
  @SerializedName("rank_tier")
  private Integer rankTier = null;
  
  @SerializedName("isRadiant")
  private Boolean isRadiant = null;
  
  @SerializedName("hero_id")
  private Integer heroId = null;
  
  @SerializedName("win")
  private Integer win = null;
  
  @SerializedName("lane")
  private Integer lane = null;
  
  @SerializedName("sen_log")
  private List<InlineResponse200> senLog = new ArrayList<InlineResponse200>();
  
  @SerializedName("sen_left_log")
  private List<InlineResponse200> senLeftLog = new ArrayList<InlineResponse200>();
  
  @SerializedName("is_roaming")
  private Boolean isRoaming = null;
  
  @SerializedName("purchase")
  private Object purchase = null;
  
  @SerializedName("lobby_type")
  private Integer lobbyType = null;
  
  @SerializedName("ability_targets")
  private Object abilityTargets = null;
  
  @SerializedName("killed")
  private Object killed = null;
  
  @SerializedName("sen_placed")
  private Integer senPlaced = null;
  
  @SerializedName("ability_upgrades_arr")
  private List<Integer> abilityUpgradesArr = new ArrayList<Integer>();
  
  @SerializedName("party_id")
  private Integer partyId = null;
  

  
  /**
   * Object with information on where the player placed observer wards. The location takes the form (outer number, inner number) and are from ~64-192.
   **/
  @ApiModelProperty(value = "Object with information on where the player placed observer wards. The location takes the form (outer number, inner number) and are from ~64-192.")
  public Object getObs() {
    return obs;
  }
  public void setObs(Object obs) {
    this.obs = obs;
  }

  
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
   * How much gold the player spent
   **/
  @ApiModelProperty(value = "How much gold the player spent")
  public Integer getGoldSpent() {
    return goldSpent;
  }
  public void setGoldSpent(Integer goldSpent) {
    this.goldSpent = goldSpent;
  }

  
  /**
   * obs_left_log
   **/
  @ApiModelProperty(value = "obs_left_log")
  public List<InlineResponse200> getObsLeftLog() {
    return obsLeftLog;
  }
  public void setObsLeftLog(List<InlineResponse200> obsLeftLog) {
    this.obsLeftLog = obsLeftLog;
  }

  
  /**
   * Object with information about which runes the player picked up
   **/
  @ApiModelProperty(value = "Object with information about which runes the player picked up")
  public Map<String, Integer> getRunes() {
    return runes;
  }
  public void setRunes(Map<String, Integer> runes) {
    this.runes = runes;
  }

  
  /**
   * Total number of observer wards killed by the player
   **/
  @ApiModelProperty(value = "Total number of observer wards killed by the player")
  public Integer getObserverKills() {
    return observerKills;
  }
  public void setObserverKills(Integer observerKills) {
    this.observerKills = observerKills;
  }

  
  /**
   * Total number of TP scrolls purchased by the player
   **/
  @ApiModelProperty(value = "Total number of TP scrolls purchased by the player")
  public Object getPurchaseTpscroll() {
    return purchaseTpscroll;
  }
  public void setPurchaseTpscroll(Object purchaseTpscroll) {
    this.purchaseTpscroll = purchaseTpscroll;
  }

  
  /**
   * Object containing information on when and where the player placed observer wards
   **/
  @ApiModelProperty(value = "Object containing information on when and where the player placed observer wards")
  public List<InlineResponse200> getObsLog() {
    return obsLog;
  }
  public void setObsLog(List<InlineResponse200> obsLog) {
    this.obsLog = obsLog;
  }

  
  /**
   * lane_role
   **/
  @ApiModelProperty(value = "lane_role")
  public Integer getLaneRole() {
    return laneRole;
  }
  public void setLaneRole(Integer laneRole) {
    this.laneRole = laneRole;
  }

  
  /**
   * Number of observer wards used
   **/
  @ApiModelProperty(value = "Number of observer wards used")
  public Integer getObserverUses() {
    return observerUses;
  }
  public void setObserverUses(Integer observerUses) {
    this.observerUses = observerUses;
  }

  
  /**
   * Integer representing the patch the game was played on
   **/
  @ApiModelProperty(value = "Integer representing the patch the game was played on")
  public Integer getPatch() {
    return patch;
  }
  public void setPatch(Integer patch) {
    this.patch = patch;
  }

  
  /**
   * Total number of neutral creeps killed
   **/
  @ApiModelProperty(value = "Total number of neutral creeps killed")
  public Integer getNeutralKills() {
    return neutralKills;
  }
  public void setNeutralKills(Integer neutralKills) {
    this.neutralKills = neutralKills;
  }

  
  /**
   * Total number of roshan kills (last hit on roshan) the player had
   **/
  @ApiModelProperty(value = "Total number of roshan kills (last hit on roshan) the player had")
  public Integer getRoshanKills() {
    return roshanKills;
  }
  public void setRoshanKills(Integer roshanKills) {
    this.roshanKills = roshanKills;
  }

  
  /**
   * Object containing information about how many times a player used items
   **/
  @ApiModelProperty(value = "Object containing information about how many times a player used items")
  public Object getItemUses() {
    return itemUses;
  }
  public void setItemUses(Object itemUses) {
    this.itemUses = itemUses;
  }

  
  /**
   * Total number of pings
   **/
  @ApiModelProperty(value = "Total number of pings")
  public Integer getPings() {
    return pings;
  }
  public void setPings(Integer pings) {
    this.pings = pings;
  }

  
  /**
   * Number of deaths
   **/
  @ApiModelProperty(value = "Number of deaths")
  public Integer getDeaths() {
    return deaths;
  }
  public void setDeaths(Integer deaths) {
    this.deaths = deaths;
  }

  
  /**
   * Object containing information on when items were purchased
   **/
  @ApiModelProperty(value = "Object containing information on when items were purchased")
  public List<InlineResponse2008PurchaseLog> getPurchaseLog() {
    return purchaseLog;
  }
  public void setPurchaseLog(List<InlineResponse2008PurchaseLog> purchaseLog) {
    this.purchaseLog = purchaseLog;
  }

  
  /**
   * Gold Per Minute obtained by this player
   **/
  @ApiModelProperty(value = "Gold Per Minute obtained by this player")
  public Integer getGoldPerMin() {
    return goldPerMin;
  }
  public void setGoldPerMin(Integer goldPerMin) {
    this.goldPerMin = goldPerMin;
  }

  
  /**
   * Binary integer representing whether or not the player lost
   **/
  @ApiModelProperty(value = "Binary integer representing whether or not the player lost")
  public Integer getLose() {
    return lose;
  }
  public void setLose(Integer lose) {
    this.lose = lose;
  }

  
  /**
   * kda
   **/
  @ApiModelProperty(value = "kda")
  public BigDecimal getKda() {
    return kda;
  }
  public void setKda(BigDecimal kda) {
    this.kda = kda;
  }

  
  /**
   * Object containing information on lane position
   **/
  @ApiModelProperty(value = "Object containing information on lane position")
  public Object getLanePos() {
    return lanePos;
  }
  public void setLanePos(Object lanePos) {
    this.lanePos = lanePos;
  }

  
  /**
   * Number of kills per minute
   **/
  @ApiModelProperty(value = "Number of kills per minute")
  public BigDecimal getKillsPerMin() {
    return killsPerMin;
  }
  public void setKillsPerMin(BigDecimal killsPerMin) {
    this.killsPerMin = killsPerMin;
  }

  
  /**
   * Object containing information on the sources of this player's experience
   **/
  @ApiModelProperty(value = "Object containing information on the sources of this player's experience")
  public Object getXpReasons() {
    return xpReasons;
  }
  public void setXpReasons(Object xpReasons) {
    this.xpReasons = xpReasons;
  }

  
  /**
   * Total number of buyback the player used
   **/
  @ApiModelProperty(value = "Total number of buyback the player used")
  public Integer getBuybackCount() {
    return buybackCount;
  }
  public void setBuybackCount(Integer buybackCount) {
    this.buybackCount = buybackCount;
  }

  
  /**
   * Total number of Necronomicon creeps killed by the player
   **/
  @ApiModelProperty(value = "Total number of Necronomicon creeps killed by the player")
  public Integer getNecronomiconKills() {
    return necronomiconKills;
  }
  public void setNecronomiconKills(Integer necronomiconKills) {
    this.necronomiconKills = necronomiconKills;
  }

  
  /**
   * Object with information on the number of the number of multikills the player had
   **/
  @ApiModelProperty(value = "Object with information on the number of the number of multikills the player had")
  public Object getMultiKills() {
    return multiKills;
  }
  public void setMultiKills(Object multiKills) {
    this.multiKills = multiKills;
  }

  
  /**
   * Array containing information on which hero the player killed at what time
   **/
  @ApiModelProperty(value = "Array containing information on which hero the player killed at what time")
  public List<InlineResponse2008KillsLog> getKillsLog() {
    return killsLog;
  }
  public void setKillsLog(List<InlineResponse2008KillsLog> killsLog) {
    this.killsLog = killsLog;
  }

  
  /**
   * Number of runes picked up
   **/
  @ApiModelProperty(value = "Number of runes picked up")
  public Integer getRunePickups() {
    return runePickups;
  }
  public void setRunePickups(Integer runePickups) {
    this.runePickups = runePickups;
  }

  
  /**
   * Object containing information on how many and what type of actions the player issued to their hero
   **/
  @ApiModelProperty(value = "Object containing information on how many and what type of actions the player issued to their hero")
  public Object getActions() {
    return actions;
  }
  public void setActions(Object actions) {
    this.actions = actions;
  }

  
  /**
   * Object containing information about damage dealt by the player to different units
   **/
  @ApiModelProperty(value = "Object containing information about damage dealt by the player to different units")
  public Object getDamage() {
    return damage;
  }
  public void setDamage(Object damage) {
    this.damage = damage;
  }

  
  /**
   * Array describing last hits at each minute in the game
   **/
  @ApiModelProperty(value = "Array describing last hits at each minute in the game")
  public List<Integer> getLhT() {
    return lhT;
  }
  public void setLhT(List<Integer> lhT) {
    this.lhT = lhT;
  }

  
  /**
   * Array containing total gold at different times of the match
   **/
  @ApiModelProperty(value = "Array containing total gold at different times of the match")
  public List<Integer> getGoldT() {
    return goldT;
  }
  public void setGoldT(List<Integer> goldT) {
    this.goldT = goldT;
  }

  
  /**
   * Object with information on when the player first puchased an item
   **/
  @ApiModelProperty(value = "Object with information on when the player first puchased an item")
  public Object getFirstPurchaseTime() {
    return firstPurchaseTime;
  }
  public void setFirstPurchaseTime(Object firstPurchaseTime) {
    this.firstPurchaseTime = firstPurchaseTime;
  }

  
  /**
   * Object containing information on additional units the player had under their control
   **/
  @ApiModelProperty(value = "Object containing information on additional units the player had under their control")
  public Object getAdditionalUnits() {
    return additionalUnits;
  }
  public void setAdditionalUnits(Object additionalUnits) {
    this.additionalUnits = additionalUnits;
  }

  
  /**
   * Gold at the end of the game
   **/
  @ApiModelProperty(value = "Gold at the end of the game")
  public Integer getGold() {
    return gold;
  }
  public void setGold(Integer gold) {
    this.gold = gold;
  }

  
  /**
   * Boolean indicating whether Radiant won the match
   **/
  @ApiModelProperty(value = "Boolean indicating whether Radiant won the match")
  public Boolean getRadiantWin() {
    return radiantWin;
  }
  public void setRadiantWin(Boolean radiantWin) {
    this.radiantWin = radiantWin;
  }

  
  /**
   * Number of camps stacked
   **/
  @ApiModelProperty(value = "Number of camps stacked")
  public Integer getCampsStacked() {
    return campsStacked;
  }
  public void setCampsStacked(Integer campsStacked) {
    this.campsStacked = campsStacked;
  }

  
  /**
   * Array with information on when runes were picked up
   **/
  @ApiModelProperty(value = "Array with information on when runes were picked up")
  public List<InlineResponse2008RunesLog> getRunesLog() {
    return runesLog;
  }
  public void setRunesLog(List<InlineResponse2008RunesLog> runesLog) {
    this.runesLog = runesLog;
  }

  
  /**
   * Object with information on when the player last purchased an item
   **/
  @ApiModelProperty(value = "Object with information on when the player last purchased an item")
  public Object getPurchaseTime() {
    return purchaseTime;
  }
  public void setPurchaseTime(Object purchaseTime) {
    this.purchaseTime = purchaseTime;
  }

  
  /**
   * Object with information on where sentries were placed. The location takes the form (outer number, inner number) and are from ~64-192.
   **/
  @ApiModelProperty(value = "Object with information on where sentries were placed. The location takes the form (outer number, inner number) and are from ~64-192.")
  public Object getSen() {
    return sen;
  }
  public void setSen(Object sen) {
    this.sen = sen;
  }

  
  /**
   * Total number of Ancient creeps killed by the player
   **/
  @ApiModelProperty(value = "Total number of Ancient creeps killed by the player")
  public Integer getAncientKills() {
    return ancientKills;
  }
  public void setAncientKills(Integer ancientKills) {
    this.ancientKills = ancientKills;
  }

  
  /**
   * Actions per minute
   **/
  @ApiModelProperty(value = "Actions per minute")
  public Integer getActionsPerMin() {
    return actionsPerMin;
  }
  public void setActionsPerMin(Integer actionsPerMin) {
    this.actionsPerMin = actionsPerMin;
  }

  
  /**
   * Match ID
   **/
  @ApiModelProperty(value = "Match ID")
  public Integer getMatchId() {
    return matchId;
  }
  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  
  /**
   * life_state_dead
   **/
  @ApiModelProperty(value = "life_state_dead")
  public Integer getLifeStateDead() {
    return lifeStateDead;
  }
  public void setLifeStateDead(Integer lifeStateDead) {
    this.lifeStateDead = lifeStateDead;
  }

  
  /**
   * Total number of lane creeps killed by the player
   **/
  @ApiModelProperty(value = "Total number of lane creeps killed by the player")
  public Integer getLaneKills() {
    return laneKills;
  }
  public void setLaneKills(Integer laneKills) {
    this.laneKills = laneKills;
  }

  
  /**
   * Total number of heroes killed by the player
   **/
  @ApiModelProperty(value = "Total number of heroes killed by the player")
  public Integer getHeroKills() {
    return heroKills;
  }
  public void setHeroKills(Integer heroKills) {
    this.heroKills = heroKills;
  }

  
  /**
   * Total stun duration of all stuns by the player
   **/
  @ApiModelProperty(value = "Total stun duration of all stuns by the player")
  public BigDecimal getStuns() {
    return stuns;
  }
  public void setStuns(BigDecimal stuns) {
    this.stuns = stuns;
  }

  
  /**
   * account_id
   **/
  @ApiModelProperty(value = "account_id")
  public Integer getAccountId() {
    return accountId;
  }
  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  
  /**
   * Integer describing whether or not the player left the game. 0: didn't leave. 1: left safely. 2+: Abandoned
   **/
  @ApiModelProperty(value = "Integer describing whether or not the player left the game. 0: didn't leave. 1: left safely. 2+: Abandoned")
  public Integer getLeaverStatus() {
    return leaverStatus;
  }
  public void setLeaverStatus(Integer leaverStatus) {
    this.leaverStatus = leaverStatus;
  }

  
  /**
   * Hero Healing Done
   **/
  @ApiModelProperty(value = "Hero Healing Done")
  public Integer getHeroHealing() {
    return heroHealing;
  }
  public void setHeroHealing(Integer heroHealing) {
    this.heroHealing = heroHealing;
  }

  
  /**
   * Object with information on the highest damage instance the player inflicted
   **/
  @ApiModelProperty(value = "Object with information on the highest damage instance the player inflicted")
  public Object getMaxHeroHit() {
    return maxHeroHit;
  }
  public void setMaxHeroHit(Object maxHeroHit) {
    this.maxHeroHit = maxHeroHit;
  }

  
  /**
   * Object containing information about who killed the player
   **/
  @ApiModelProperty(value = "Object containing information about who killed the player")
  public Object getKilledBy() {
    return killedBy;
  }
  public void setKilledBy(Object killedBy) {
    this.killedBy = killedBy;
  }

  
  /**
   * Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json
   **/
  @ApiModelProperty(value = "Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json")
  public Integer getGameMode() {
    return gameMode;
  }
  public void setGameMode(Integer gameMode) {
    this.gameMode = gameMode;
  }

  
  /**
   * Total number of observer wards placed
   **/
  @ApiModelProperty(value = "Total number of observer wards placed")
  public Integer getObsPlaced() {
    return obsPlaced;
  }
  public void setObsPlaced(Integer obsPlaced) {
    this.obsPlaced = obsPlaced;
  }

  
  /**
   * Total experience at the end of the game
   **/
  @ApiModelProperty(value = "Total experience at the end of the game")
  public Integer getTotalXp() {
    return totalXp;
  }
  public void setTotalXp(Integer totalXp) {
    this.totalXp = totalXp;
  }

  
  /**
   * Object with information on whether or not the item won
   **/
  @ApiModelProperty(value = "Object with information on whether or not the item won")
  public Object getItemWin() {
    return itemWin;
  }
  public void setItemWin(Object itemWin) {
    this.itemWin = itemWin;
  }

  
  /**
   * Object containing information on how the player gainined gold over the course of the match
   **/
  @ApiModelProperty(value = "Object containing information on how the player gainined gold over the course of the match")
  public Object getGoldReasons() {
    return goldReasons;
  }
  public void setGoldReasons(Object goldReasons) {
    this.goldReasons = goldReasons;
  }

  
  /**
   * personaname
   **/
  @ApiModelProperty(value = "personaname")
  public String getPersonaname() {
    return personaname;
  }
  public void setPersonaname(String personaname) {
    this.personaname = personaname;
  }

  
  /**
   * Object containing information about the sources of damage received by this player from heroes
   **/
  @ApiModelProperty(value = "Object containing information about the sources of damage received by this player from heroes")
  public Object getDamageInflictorReceived() {
    return damageInflictorReceived;
  }
  public void setDamageInflictorReceived(Object damageInflictorReceived) {
    this.damageInflictorReceived = damageInflictorReceived;
  }

  
  /**
   * Object containing information about about the sources of this player's damage to heroes
   **/
  @ApiModelProperty(value = "Object containing information about about the sources of this player's damage to heroes")
  public Object getDamageInflictor() {
    return damageInflictor;
  }
  public void setDamageInflictor(Object damageInflictor) {
    this.damageInflictor = damageInflictor;
  }

  
  /**
   * Total gold at the end of the game
   **/
  @ApiModelProperty(value = "Total gold at the end of the game")
  public Integer getTotalGold() {
    return totalGold;
  }
  public void setTotalGold(Integer totalGold) {
    this.totalGold = totalGold;
  }

  
  /**
   * Array containing information about buybacks
   **/
  @ApiModelProperty(value = "Array containing information about buybacks")
  public List<InlineResponse2008BuybackLog> getBuybackLog() {
    return buybackLog;
  }
  public void setBuybackLog(List<InlineResponse2008BuybackLog> buybackLog) {
    this.buybackLog = buybackLog;
  }

  
  /**
   * Total number of sentry wards killed by the player
   **/
  @ApiModelProperty(value = "Total number of sentry wards killed by the player")
  public Integer getSentryKills() {
    return sentryKills;
  }
  public void setSentryKills(Integer sentryKills) {
    this.sentryKills = sentryKills;
  }

  
  /**
   * Object containing information about the player's killstreaks
   **/
  @ApiModelProperty(value = "Object containing information about the player's killstreaks")
  public Object getKillStreaks() {
    return killStreaks;
  }
  public void setKillStreaks(Object killStreaks) {
    this.killStreaks = killStreaks;
  }

  
  /**
   * Object containing information on how many ticks of damages the hero inflicted with different spells and damage inflictors
   **/
  @ApiModelProperty(value = "Object containing information on how many ticks of damages the hero inflicted with different spells and damage inflictors")
  public Object getHeroHits() {
    return heroHits;
  }
  public void setHeroHits(Object heroHits) {
    this.heroHits = heroHits;
  }

  
  /**
   * Experience Per Minute obtained by the player
   **/
  @ApiModelProperty(value = "Experience Per Minute obtained by the player")
  public Integer getXpPerMin() {
    return xpPerMin;
  }
  public void setXpPerMin(Integer xpPerMin) {
    this.xpPerMin = xpPerMin;
  }

  
  /**
   * Object containing information on certain benchmarks like GPM, XPM, KDA, tower damage, etc
   **/
  @ApiModelProperty(value = "Object containing information on certain benchmarks like GPM, XPM, KDA, tower damage, etc")
  public Object getBenchmarks() {
    return benchmarks;
  }
  public void setBenchmarks(Object benchmarks) {
    this.benchmarks = benchmarks;
  }

  
  /**
   * Level at the end of the game
   **/
  @ApiModelProperty(value = "Level at the end of the game")
  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }

  
  /**
   * abandons
   **/
  @ApiModelProperty(value = "abandons")
  public Integer getAbandons() {
    return abandons;
  }
  public void setAbandons(Integer abandons) {
    this.abandons = abandons;
  }

  
  /**
   * Which slot the player is in. 0-127 are Radiant, 128-255 are Dire
   **/
  @ApiModelProperty(value = "Which slot the player is in. 0-127 are Radiant, 128-255 are Dire")
  public Integer getPlayerSlot() {
    return playerSlot;
  }
  public void setPlayerSlot(Integer playerSlot) {
    this.playerSlot = playerSlot;
  }

  
  /**
   * Object containing information about from whom the player took damage
   **/
  @ApiModelProperty(value = "Object containing information about from whom the player took damage")
  public Object getDamageTaken() {
    return damageTaken;
  }
  public void setDamageTaken(Object damageTaken) {
    this.damageTaken = damageTaken;
  }

  
  /**
   * Start time of the match in seconds since 1970
   **/
  @ApiModelProperty(value = "Start time of the match in seconds since 1970")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Number of last hits
   **/
  @ApiModelProperty(value = "Number of last hits")
  public Integer getLastHits() {
    return lastHits;
  }
  public void setLastHits(Integer lastHits) {
    this.lastHits = lastHits;
  }

  
  /**
   * Number of sentry wards used
   **/
  @ApiModelProperty(value = "Number of sentry wards used")
  public Integer getSentryUses() {
    return sentryUses;
  }
  public void setSentryUses(Integer sentryUses) {
    this.sentryUses = sentryUses;
  }

  
  /**
   * Object containing information on how many times the played used their abilities
   **/
  @ApiModelProperty(value = "Object containing information on how many times the played used their abilities")
  public Object getAbilityUses() {
    return abilityUses;
  }
  public void setAbilityUses(Object abilityUses) {
    this.abilityUses = abilityUses;
  }

  
  /**
   * Item in the player's sixth slot
   **/
  @ApiModelProperty(value = "Item in the player's sixth slot")
  public Integer getItem5() {
    return item5;
  }
  public void setItem5(Integer item5) {
    this.item5 = item5;
  }

  
  /**
   * Item in the player's fifth slot
   **/
  @ApiModelProperty(value = "Item in the player's fifth slot")
  public Integer getItem4() {
    return item4;
  }
  public void setItem4(Integer item4) {
    this.item4 = item4;
  }

  
  /**
   * Object containing binary integers the tell whether the item was purchased by the player (note: this is always 1)
   **/
  @ApiModelProperty(value = "Object containing binary integers the tell whether the item was purchased by the player (note: this is always 1)")
  public Object getItemUsage() {
    return itemUsage;
  }
  public void setItemUsage(Object itemUsage) {
    this.itemUsage = itemUsage;
  }

  
  /**
   * Item in the player's fourth slot
   **/
  @ApiModelProperty(value = "Item in the player's fourth slot")
  public Integer getItem3() {
    return item3;
  }
  public void setItem3(Integer item3) {
    this.item3 = item3;
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
   * Item in the player's third slot
   **/
  @ApiModelProperty(value = "Item in the player's third slot")
  public Integer getItem2() {
    return item2;
  }
  public void setItem2(Integer item2) {
    this.item2 = item2;
  }

  
  /**
   * Item in the player's second slot
   **/
  @ApiModelProperty(value = "Item in the player's second slot")
  public Integer getItem1() {
    return item1;
  }
  public void setItem1(Integer item1) {
    this.item1 = item1;
  }

  
  /**
   * lane_efficiency
   **/
  @ApiModelProperty(value = "lane_efficiency")
  public BigDecimal getLaneEfficiency() {
    return laneEfficiency;
  }
  public void setLaneEfficiency(BigDecimal laneEfficiency) {
    this.laneEfficiency = laneEfficiency;
  }

  
  /**
   * Number of creeps stacked
   **/
  @ApiModelProperty(value = "Number of creeps stacked")
  public Integer getCreepsStacked() {
    return creepsStacked;
  }
  public void setCreepsStacked(Integer creepsStacked) {
    this.creepsStacked = creepsStacked;
  }

  
  /**
   * Item in the player's first slot
   **/
  @ApiModelProperty(value = "Item in the player's first slot")
  public Integer getItem0() {
    return item0;
  }
  public void setItem0(Integer item0) {
    this.item0 = item0;
  }

  
  /**
   * Integer corresponding to the region the game was played on
   **/
  @ApiModelProperty(value = "Integer corresponding to the region the game was played on")
  public Integer getRegion() {
    return region;
  }
  public void setRegion(Integer region) {
    this.region = region;
  }

  
  /**
   * Number of kills
   **/
  @ApiModelProperty(value = "Number of kills")
  public Integer getKills() {
    return kills;
  }
  public void setKills(Integer kills) {
    this.kills = kills;
  }

  
  /**
   * Hero Damage Dealt
   **/
  @ApiModelProperty(value = "Hero Damage Dealt")
  public Integer getHeroDamage() {
    return heroDamage;
  }
  public void setHeroDamage(Integer heroDamage) {
    this.heroDamage = heroDamage;
  }

  
  /**
   * Total number of tower kills the player had
   **/
  @ApiModelProperty(value = "Total number of tower kills the player had")
  public Integer getTowerKills() {
    return towerKills;
  }
  public void setTowerKills(Integer towerKills) {
    this.towerKills = towerKills;
  }

  
  /**
   * Item in backpack slot 1
   **/
  @ApiModelProperty(value = "Item in backpack slot 1")
  public Integer getBackpack1() {
    return backpack1;
  }
  public void setBackpack1(Integer backpack1) {
    this.backpack1 = backpack1;
  }

  
  /**
   * Object containing information on how and how much damage the player dealt to other heroes
   **/
  @ApiModelProperty(value = "Object containing information on how and how much damage the player dealt to other heroes")
  public Object getDamageTargets() {
    return damageTargets;
  }
  public void setDamageTargets(Object damageTargets) {
    this.damageTargets = damageTargets;
  }

  
  /**
   * Item in backpack slot 2
   **/
  @ApiModelProperty(value = "Item in backpack slot 2")
  public Integer getBackpack2() {
    return backpack2;
  }
  public void setBackpack2(Integer backpack2) {
    this.backpack2 = backpack2;
  }

  
  /**
   * Number of denies
   **/
  @ApiModelProperty(value = "Number of denies")
  public Integer getDenies() {
    return denies;
  }
  public void setDenies(Integer denies) {
    this.denies = denies;
  }

  
  /**
   * Item in backpack slot 0
   **/
  @ApiModelProperty(value = "Item in backpack slot 0")
  public Integer getBackpack0() {
    return backpack0;
  }
  public void setBackpack0(Integer backpack0) {
    this.backpack0 = backpack0;
  }

  
  /**
   * life_state
   **/
  @ApiModelProperty(value = "life_state")
  public Object getLifeState() {
    return lifeState;
  }
  public void setLifeState(Object lifeState) {
    this.lifeState = lifeState;
  }

  
  /**
   * Total number of courier kills the player had
   **/
  @ApiModelProperty(value = "Total number of courier kills the player had")
  public Integer getCourierKills() {
    return courierKills;
  }
  public void setCourierKills(Integer courierKills) {
    this.courierKills = courierKills;
  }

  
  /**
   * cosmetics
   **/
  @ApiModelProperty(value = "cosmetics")
  public List<Integer> getCosmetics() {
    return cosmetics;
  }
  public void setCosmetics(List<Integer> cosmetics) {
    this.cosmetics = cosmetics;
  }

  
  /**
   * Array containing number of denies at different times of the match
   **/
  @ApiModelProperty(value = "Array containing number of denies at different times of the match")
  public List<Integer> getDnT() {
    return dnT;
  }
  public void setDnT(List<Integer> dnT) {
    this.dnT = dnT;
  }

  
  /**
   * Duration of the game in seconds
   **/
  @ApiModelProperty(value = "Duration of the game in seconds")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Array describing permanent buffs the player had at the end of the game. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/permanent_buffs.json
   **/
  @ApiModelProperty(value = "Array describing permanent buffs the player had at the end of the game. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/permanent_buffs.json")
  public List<InlineResponse200> getPermanentBuffs() {
    return permanentBuffs;
  }
  public void setPermanentBuffs(List<InlineResponse200> permanentBuffs) {
    this.permanentBuffs = permanentBuffs;
  }

  
  /**
   * Time in seconds corresponding to the time of entries of other arrays in the match.
   **/
  @ApiModelProperty(value = "Time in seconds corresponding to the time of entries of other arrays in the match.")
  public List<Integer> getTimes() {
    return times;
  }
  public void setTimes(List<Integer> times) {
    this.times = times;
  }

  
  /**
   * lane_efficiency_pct
   **/
  @ApiModelProperty(value = "lane_efficiency_pct")
  public BigDecimal getLaneEfficiencyPct() {
    return laneEfficiencyPct;
  }
  public void setLaneEfficiencyPct(BigDecimal laneEfficiencyPct) {
    this.laneEfficiencyPct = laneEfficiencyPct;
  }

  
  /**
   * Number of assists the player had
   **/
  @ApiModelProperty(value = "Number of assists the player had")
  public Integer getAssists() {
    return assists;
  }
  public void setAssists(Integer assists) {
    this.assists = assists;
  }

  
  /**
   * Total tower damage done by the player
   **/
  @ApiModelProperty(value = "Total tower damage done by the player")
  public Integer getTowerDamage() {
    return towerDamage;
  }
  public void setTowerDamage(Integer towerDamage) {
    this.towerDamage = towerDamage;
  }

  
  /**
   * Experience at each minute of the game
   **/
  @ApiModelProperty(value = "Experience at each minute of the game")
  public List<Integer> getXpT() {
    return xpT;
  }
  public void setXpT(List<Integer> xpT) {
    this.xpT = xpT;
  }

  
  /**
   * The rank tier of the player. Tens place indicates rank, ones place indicates stars.
   **/
  @ApiModelProperty(value = "The rank tier of the player. Tens place indicates rank, ones place indicates stars.")
  public Integer getRankTier() {
    return rankTier;
  }
  public void setRankTier(Integer rankTier) {
    this.rankTier = rankTier;
  }

  
  /**
   * Boolean for whether or not the player is on Radiant
   **/
  @ApiModelProperty(value = "Boolean for whether or not the player is on Radiant")
  public Boolean getIsRadiant() {
    return isRadiant;
  }
  public void setIsRadiant(Boolean isRadiant) {
    this.isRadiant = isRadiant;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHeroId() {
    return heroId;
  }
  public void setHeroId(Integer heroId) {
    this.heroId = heroId;
  }

  
  /**
   * Binary integer representing whether or not the player won
   **/
  @ApiModelProperty(value = "Binary integer representing whether or not the player won")
  public Integer getWin() {
    return win;
  }
  public void setWin(Integer win) {
    this.win = win;
  }

  
  /**
   * Integer referring to which lane the hero laned in
   **/
  @ApiModelProperty(value = "Integer referring to which lane the hero laned in")
  public Integer getLane() {
    return lane;
  }
  public void setLane(Integer lane) {
    this.lane = lane;
  }

  
  /**
   * Array with information on when and where sentries were placed by the player
   **/
  @ApiModelProperty(value = "Array with information on when and where sentries were placed by the player")
  public List<InlineResponse200> getSenLog() {
    return senLog;
  }
  public void setSenLog(List<InlineResponse200> senLog) {
    this.senLog = senLog;
  }

  
  /**
   * Array containing information on when and where the player placed sentries
   **/
  @ApiModelProperty(value = "Array containing information on when and where the player placed sentries")
  public List<InlineResponse200> getSenLeftLog() {
    return senLeftLog;
  }
  public void setSenLeftLog(List<InlineResponse200> senLeftLog) {
    this.senLeftLog = senLeftLog;
  }

  
  /**
   * Boolean referring to whether or not the player roamed
   **/
  @ApiModelProperty(value = "Boolean referring to whether or not the player roamed")
  public Boolean getIsRoaming() {
    return isRoaming;
  }
  public void setIsRoaming(Boolean isRoaming) {
    this.isRoaming = isRoaming;
  }

  
  /**
   * Object containing information on the items the player purchased
   **/
  @ApiModelProperty(value = "Object containing information on the items the player purchased")
  public Object getPurchase() {
    return purchase;
  }
  public void setPurchase(Object purchase) {
    this.purchase = purchase;
  }

  
  /**
   * Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json
   **/
  @ApiModelProperty(value = "Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json")
  public Integer getLobbyType() {
    return lobbyType;
  }
  public void setLobbyType(Integer lobbyType) {
    this.lobbyType = lobbyType;
  }

  
  /**
   * Object containing information on who the player used their abilities on
   **/
  @ApiModelProperty(value = "Object containing information on who the player used their abilities on")
  public Object getAbilityTargets() {
    return abilityTargets;
  }
  public void setAbilityTargets(Object abilityTargets) {
    this.abilityTargets = abilityTargets;
  }

  
  /**
   * Object containing information about what units the player killed
   **/
  @ApiModelProperty(value = "Object containing information about what units the player killed")
  public Object getKilled() {
    return killed;
  }
  public void setKilled(Object killed) {
    this.killed = killed;
  }

  
  /**
   * How many sentries were placed by the player
   **/
  @ApiModelProperty(value = "How many sentries were placed by the player")
  public Integer getSenPlaced() {
    return senPlaced;
  }
  public void setSenPlaced(Integer senPlaced) {
    this.senPlaced = senPlaced;
  }

  
  /**
   * An array describing how abilities were upgraded
   **/
  @ApiModelProperty(value = "An array describing how abilities were upgraded")
  public List<Integer> getAbilityUpgradesArr() {
    return abilityUpgradesArr;
  }
  public void setAbilityUpgradesArr(List<Integer> abilityUpgradesArr) {
    this.abilityUpgradesArr = abilityUpgradesArr;
  }

  
  /**
   * party_id
   **/
  @ApiModelProperty(value = "party_id")
  public Integer getPartyId() {
    return partyId;
  }
  public void setPartyId(Integer partyId) {
    this.partyId = partyId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Players inlineResponse2008Players = (InlineResponse2008Players) o;
    return Objects.equals(obs, inlineResponse2008Players.obs) &&
        Objects.equals(cluster, inlineResponse2008Players.cluster) &&
        Objects.equals(goldSpent, inlineResponse2008Players.goldSpent) &&
        Objects.equals(obsLeftLog, inlineResponse2008Players.obsLeftLog) &&
        Objects.equals(runes, inlineResponse2008Players.runes) &&
        Objects.equals(observerKills, inlineResponse2008Players.observerKills) &&
        Objects.equals(purchaseTpscroll, inlineResponse2008Players.purchaseTpscroll) &&
        Objects.equals(obsLog, inlineResponse2008Players.obsLog) &&
        Objects.equals(laneRole, inlineResponse2008Players.laneRole) &&
        Objects.equals(observerUses, inlineResponse2008Players.observerUses) &&
        Objects.equals(patch, inlineResponse2008Players.patch) &&
        Objects.equals(neutralKills, inlineResponse2008Players.neutralKills) &&
        Objects.equals(roshanKills, inlineResponse2008Players.roshanKills) &&
        Objects.equals(itemUses, inlineResponse2008Players.itemUses) &&
        Objects.equals(pings, inlineResponse2008Players.pings) &&
        Objects.equals(deaths, inlineResponse2008Players.deaths) &&
        Objects.equals(purchaseLog, inlineResponse2008Players.purchaseLog) &&
        Objects.equals(goldPerMin, inlineResponse2008Players.goldPerMin) &&
        Objects.equals(lose, inlineResponse2008Players.lose) &&
        Objects.equals(kda, inlineResponse2008Players.kda) &&
        Objects.equals(lanePos, inlineResponse2008Players.lanePos) &&
        Objects.equals(killsPerMin, inlineResponse2008Players.killsPerMin) &&
        Objects.equals(xpReasons, inlineResponse2008Players.xpReasons) &&
        Objects.equals(buybackCount, inlineResponse2008Players.buybackCount) &&
        Objects.equals(necronomiconKills, inlineResponse2008Players.necronomiconKills) &&
        Objects.equals(multiKills, inlineResponse2008Players.multiKills) &&
        Objects.equals(killsLog, inlineResponse2008Players.killsLog) &&
        Objects.equals(runePickups, inlineResponse2008Players.runePickups) &&
        Objects.equals(actions, inlineResponse2008Players.actions) &&
        Objects.equals(damage, inlineResponse2008Players.damage) &&
        Objects.equals(lhT, inlineResponse2008Players.lhT) &&
        Objects.equals(goldT, inlineResponse2008Players.goldT) &&
        Objects.equals(firstPurchaseTime, inlineResponse2008Players.firstPurchaseTime) &&
        Objects.equals(additionalUnits, inlineResponse2008Players.additionalUnits) &&
        Objects.equals(gold, inlineResponse2008Players.gold) &&
        Objects.equals(radiantWin, inlineResponse2008Players.radiantWin) &&
        Objects.equals(campsStacked, inlineResponse2008Players.campsStacked) &&
        Objects.equals(runesLog, inlineResponse2008Players.runesLog) &&
        Objects.equals(purchaseTime, inlineResponse2008Players.purchaseTime) &&
        Objects.equals(sen, inlineResponse2008Players.sen) &&
        Objects.equals(ancientKills, inlineResponse2008Players.ancientKills) &&
        Objects.equals(actionsPerMin, inlineResponse2008Players.actionsPerMin) &&
        Objects.equals(matchId, inlineResponse2008Players.matchId) &&
        Objects.equals(lifeStateDead, inlineResponse2008Players.lifeStateDead) &&
        Objects.equals(laneKills, inlineResponse2008Players.laneKills) &&
        Objects.equals(heroKills, inlineResponse2008Players.heroKills) &&
        Objects.equals(stuns, inlineResponse2008Players.stuns) &&
        Objects.equals(accountId, inlineResponse2008Players.accountId) &&
        Objects.equals(leaverStatus, inlineResponse2008Players.leaverStatus) &&
        Objects.equals(heroHealing, inlineResponse2008Players.heroHealing) &&
        Objects.equals(maxHeroHit, inlineResponse2008Players.maxHeroHit) &&
        Objects.equals(killedBy, inlineResponse2008Players.killedBy) &&
        Objects.equals(gameMode, inlineResponse2008Players.gameMode) &&
        Objects.equals(obsPlaced, inlineResponse2008Players.obsPlaced) &&
        Objects.equals(totalXp, inlineResponse2008Players.totalXp) &&
        Objects.equals(itemWin, inlineResponse2008Players.itemWin) &&
        Objects.equals(goldReasons, inlineResponse2008Players.goldReasons) &&
        Objects.equals(personaname, inlineResponse2008Players.personaname) &&
        Objects.equals(damageInflictorReceived, inlineResponse2008Players.damageInflictorReceived) &&
        Objects.equals(damageInflictor, inlineResponse2008Players.damageInflictor) &&
        Objects.equals(totalGold, inlineResponse2008Players.totalGold) &&
        Objects.equals(buybackLog, inlineResponse2008Players.buybackLog) &&
        Objects.equals(sentryKills, inlineResponse2008Players.sentryKills) &&
        Objects.equals(killStreaks, inlineResponse2008Players.killStreaks) &&
        Objects.equals(heroHits, inlineResponse2008Players.heroHits) &&
        Objects.equals(xpPerMin, inlineResponse2008Players.xpPerMin) &&
        Objects.equals(benchmarks, inlineResponse2008Players.benchmarks) &&
        Objects.equals(level, inlineResponse2008Players.level) &&
        Objects.equals(abandons, inlineResponse2008Players.abandons) &&
        Objects.equals(playerSlot, inlineResponse2008Players.playerSlot) &&
        Objects.equals(damageTaken, inlineResponse2008Players.damageTaken) &&
        Objects.equals(startTime, inlineResponse2008Players.startTime) &&
        Objects.equals(lastHits, inlineResponse2008Players.lastHits) &&
        Objects.equals(sentryUses, inlineResponse2008Players.sentryUses) &&
        Objects.equals(abilityUses, inlineResponse2008Players.abilityUses) &&
        Objects.equals(item5, inlineResponse2008Players.item5) &&
        Objects.equals(item4, inlineResponse2008Players.item4) &&
        Objects.equals(itemUsage, inlineResponse2008Players.itemUsage) &&
        Objects.equals(item3, inlineResponse2008Players.item3) &&
        Objects.equals(name, inlineResponse2008Players.name) &&
        Objects.equals(item2, inlineResponse2008Players.item2) &&
        Objects.equals(item1, inlineResponse2008Players.item1) &&
        Objects.equals(laneEfficiency, inlineResponse2008Players.laneEfficiency) &&
        Objects.equals(creepsStacked, inlineResponse2008Players.creepsStacked) &&
        Objects.equals(item0, inlineResponse2008Players.item0) &&
        Objects.equals(region, inlineResponse2008Players.region) &&
        Objects.equals(kills, inlineResponse2008Players.kills) &&
        Objects.equals(heroDamage, inlineResponse2008Players.heroDamage) &&
        Objects.equals(towerKills, inlineResponse2008Players.towerKills) &&
        Objects.equals(backpack1, inlineResponse2008Players.backpack1) &&
        Objects.equals(damageTargets, inlineResponse2008Players.damageTargets) &&
        Objects.equals(backpack2, inlineResponse2008Players.backpack2) &&
        Objects.equals(denies, inlineResponse2008Players.denies) &&
        Objects.equals(backpack0, inlineResponse2008Players.backpack0) &&
        Objects.equals(lifeState, inlineResponse2008Players.lifeState) &&
        Objects.equals(courierKills, inlineResponse2008Players.courierKills) &&
        Objects.equals(cosmetics, inlineResponse2008Players.cosmetics) &&
        Objects.equals(dnT, inlineResponse2008Players.dnT) &&
        Objects.equals(duration, inlineResponse2008Players.duration) &&
        Objects.equals(permanentBuffs, inlineResponse2008Players.permanentBuffs) &&
        Objects.equals(times, inlineResponse2008Players.times) &&
        Objects.equals(laneEfficiencyPct, inlineResponse2008Players.laneEfficiencyPct) &&
        Objects.equals(assists, inlineResponse2008Players.assists) &&
        Objects.equals(towerDamage, inlineResponse2008Players.towerDamage) &&
        Objects.equals(xpT, inlineResponse2008Players.xpT) &&
        Objects.equals(rankTier, inlineResponse2008Players.rankTier) &&
        Objects.equals(isRadiant, inlineResponse2008Players.isRadiant) &&
        Objects.equals(heroId, inlineResponse2008Players.heroId) &&
        Objects.equals(win, inlineResponse2008Players.win) &&
        Objects.equals(lane, inlineResponse2008Players.lane) &&
        Objects.equals(senLog, inlineResponse2008Players.senLog) &&
        Objects.equals(senLeftLog, inlineResponse2008Players.senLeftLog) &&
        Objects.equals(isRoaming, inlineResponse2008Players.isRoaming) &&
        Objects.equals(purchase, inlineResponse2008Players.purchase) &&
        Objects.equals(lobbyType, inlineResponse2008Players.lobbyType) &&
        Objects.equals(abilityTargets, inlineResponse2008Players.abilityTargets) &&
        Objects.equals(killed, inlineResponse2008Players.killed) &&
        Objects.equals(senPlaced, inlineResponse2008Players.senPlaced) &&
        Objects.equals(abilityUpgradesArr, inlineResponse2008Players.abilityUpgradesArr) &&
        Objects.equals(partyId, inlineResponse2008Players.partyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(obs, cluster, goldSpent, obsLeftLog, runes, observerKills, purchaseTpscroll, obsLog, laneRole, observerUses, patch, neutralKills, roshanKills, itemUses, pings, deaths, purchaseLog, goldPerMin, lose, kda, lanePos, killsPerMin, xpReasons, buybackCount, necronomiconKills, multiKills, killsLog, runePickups, actions, damage, lhT, goldT, firstPurchaseTime, additionalUnits, gold, radiantWin, campsStacked, runesLog, purchaseTime, sen, ancientKills, actionsPerMin, matchId, lifeStateDead, laneKills, heroKills, stuns, accountId, leaverStatus, heroHealing, maxHeroHit, killedBy, gameMode, obsPlaced, totalXp, itemWin, goldReasons, personaname, damageInflictorReceived, damageInflictor, totalGold, buybackLog, sentryKills, killStreaks, heroHits, xpPerMin, benchmarks, level, abandons, playerSlot, damageTaken, startTime, lastHits, sentryUses, abilityUses, item5, item4, itemUsage, item3, name, item2, item1, laneEfficiency, creepsStacked, item0, region, kills, heroDamage, towerKills, backpack1, damageTargets, backpack2, denies, backpack0, lifeState, courierKills, cosmetics, dnT, duration, permanentBuffs, times, laneEfficiencyPct, assists, towerDamage, xpT, rankTier, isRadiant, heroId, win, lane, senLog, senLeftLog, isRoaming, purchase, lobbyType, abilityTargets, killed, senPlaced, abilityUpgradesArr, partyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Players {\n");
    
    sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    goldSpent: ").append(toIndentedString(goldSpent)).append("\n");
    sb.append("    obsLeftLog: ").append(toIndentedString(obsLeftLog)).append("\n");
    sb.append("    runes: ").append(toIndentedString(runes)).append("\n");
    sb.append("    observerKills: ").append(toIndentedString(observerKills)).append("\n");
    sb.append("    purchaseTpscroll: ").append(toIndentedString(purchaseTpscroll)).append("\n");
    sb.append("    obsLog: ").append(toIndentedString(obsLog)).append("\n");
    sb.append("    laneRole: ").append(toIndentedString(laneRole)).append("\n");
    sb.append("    observerUses: ").append(toIndentedString(observerUses)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    neutralKills: ").append(toIndentedString(neutralKills)).append("\n");
    sb.append("    roshanKills: ").append(toIndentedString(roshanKills)).append("\n");
    sb.append("    itemUses: ").append(toIndentedString(itemUses)).append("\n");
    sb.append("    pings: ").append(toIndentedString(pings)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
    sb.append("    purchaseLog: ").append(toIndentedString(purchaseLog)).append("\n");
    sb.append("    goldPerMin: ").append(toIndentedString(goldPerMin)).append("\n");
    sb.append("    lose: ").append(toIndentedString(lose)).append("\n");
    sb.append("    kda: ").append(toIndentedString(kda)).append("\n");
    sb.append("    lanePos: ").append(toIndentedString(lanePos)).append("\n");
    sb.append("    killsPerMin: ").append(toIndentedString(killsPerMin)).append("\n");
    sb.append("    xpReasons: ").append(toIndentedString(xpReasons)).append("\n");
    sb.append("    buybackCount: ").append(toIndentedString(buybackCount)).append("\n");
    sb.append("    necronomiconKills: ").append(toIndentedString(necronomiconKills)).append("\n");
    sb.append("    multiKills: ").append(toIndentedString(multiKills)).append("\n");
    sb.append("    killsLog: ").append(toIndentedString(killsLog)).append("\n");
    sb.append("    runePickups: ").append(toIndentedString(runePickups)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    damage: ").append(toIndentedString(damage)).append("\n");
    sb.append("    lhT: ").append(toIndentedString(lhT)).append("\n");
    sb.append("    goldT: ").append(toIndentedString(goldT)).append("\n");
    sb.append("    firstPurchaseTime: ").append(toIndentedString(firstPurchaseTime)).append("\n");
    sb.append("    additionalUnits: ").append(toIndentedString(additionalUnits)).append("\n");
    sb.append("    gold: ").append(toIndentedString(gold)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    campsStacked: ").append(toIndentedString(campsStacked)).append("\n");
    sb.append("    runesLog: ").append(toIndentedString(runesLog)).append("\n");
    sb.append("    purchaseTime: ").append(toIndentedString(purchaseTime)).append("\n");
    sb.append("    sen: ").append(toIndentedString(sen)).append("\n");
    sb.append("    ancientKills: ").append(toIndentedString(ancientKills)).append("\n");
    sb.append("    actionsPerMin: ").append(toIndentedString(actionsPerMin)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    lifeStateDead: ").append(toIndentedString(lifeStateDead)).append("\n");
    sb.append("    laneKills: ").append(toIndentedString(laneKills)).append("\n");
    sb.append("    heroKills: ").append(toIndentedString(heroKills)).append("\n");
    sb.append("    stuns: ").append(toIndentedString(stuns)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    leaverStatus: ").append(toIndentedString(leaverStatus)).append("\n");
    sb.append("    heroHealing: ").append(toIndentedString(heroHealing)).append("\n");
    sb.append("    maxHeroHit: ").append(toIndentedString(maxHeroHit)).append("\n");
    sb.append("    killedBy: ").append(toIndentedString(killedBy)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    obsPlaced: ").append(toIndentedString(obsPlaced)).append("\n");
    sb.append("    totalXp: ").append(toIndentedString(totalXp)).append("\n");
    sb.append("    itemWin: ").append(toIndentedString(itemWin)).append("\n");
    sb.append("    goldReasons: ").append(toIndentedString(goldReasons)).append("\n");
    sb.append("    personaname: ").append(toIndentedString(personaname)).append("\n");
    sb.append("    damageInflictorReceived: ").append(toIndentedString(damageInflictorReceived)).append("\n");
    sb.append("    damageInflictor: ").append(toIndentedString(damageInflictor)).append("\n");
    sb.append("    totalGold: ").append(toIndentedString(totalGold)).append("\n");
    sb.append("    buybackLog: ").append(toIndentedString(buybackLog)).append("\n");
    sb.append("    sentryKills: ").append(toIndentedString(sentryKills)).append("\n");
    sb.append("    killStreaks: ").append(toIndentedString(killStreaks)).append("\n");
    sb.append("    heroHits: ").append(toIndentedString(heroHits)).append("\n");
    sb.append("    xpPerMin: ").append(toIndentedString(xpPerMin)).append("\n");
    sb.append("    benchmarks: ").append(toIndentedString(benchmarks)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    abandons: ").append(toIndentedString(abandons)).append("\n");
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
    sb.append("    damageTaken: ").append(toIndentedString(damageTaken)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    lastHits: ").append(toIndentedString(lastHits)).append("\n");
    sb.append("    sentryUses: ").append(toIndentedString(sentryUses)).append("\n");
    sb.append("    abilityUses: ").append(toIndentedString(abilityUses)).append("\n");
    sb.append("    item5: ").append(toIndentedString(item5)).append("\n");
    sb.append("    item4: ").append(toIndentedString(item4)).append("\n");
    sb.append("    itemUsage: ").append(toIndentedString(itemUsage)).append("\n");
    sb.append("    item3: ").append(toIndentedString(item3)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    item2: ").append(toIndentedString(item2)).append("\n");
    sb.append("    item1: ").append(toIndentedString(item1)).append("\n");
    sb.append("    laneEfficiency: ").append(toIndentedString(laneEfficiency)).append("\n");
    sb.append("    creepsStacked: ").append(toIndentedString(creepsStacked)).append("\n");
    sb.append("    item0: ").append(toIndentedString(item0)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    heroDamage: ").append(toIndentedString(heroDamage)).append("\n");
    sb.append("    towerKills: ").append(toIndentedString(towerKills)).append("\n");
    sb.append("    backpack1: ").append(toIndentedString(backpack1)).append("\n");
    sb.append("    damageTargets: ").append(toIndentedString(damageTargets)).append("\n");
    sb.append("    backpack2: ").append(toIndentedString(backpack2)).append("\n");
    sb.append("    denies: ").append(toIndentedString(denies)).append("\n");
    sb.append("    backpack0: ").append(toIndentedString(backpack0)).append("\n");
    sb.append("    lifeState: ").append(toIndentedString(lifeState)).append("\n");
    sb.append("    courierKills: ").append(toIndentedString(courierKills)).append("\n");
    sb.append("    cosmetics: ").append(toIndentedString(cosmetics)).append("\n");
    sb.append("    dnT: ").append(toIndentedString(dnT)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    permanentBuffs: ").append(toIndentedString(permanentBuffs)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    laneEfficiencyPct: ").append(toIndentedString(laneEfficiencyPct)).append("\n");
    sb.append("    assists: ").append(toIndentedString(assists)).append("\n");
    sb.append("    towerDamage: ").append(toIndentedString(towerDamage)).append("\n");
    sb.append("    xpT: ").append(toIndentedString(xpT)).append("\n");
    sb.append("    rankTier: ").append(toIndentedString(rankTier)).append("\n");
    sb.append("    isRadiant: ").append(toIndentedString(isRadiant)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    win: ").append(toIndentedString(win)).append("\n");
    sb.append("    lane: ").append(toIndentedString(lane)).append("\n");
    sb.append("    senLog: ").append(toIndentedString(senLog)).append("\n");
    sb.append("    senLeftLog: ").append(toIndentedString(senLeftLog)).append("\n");
    sb.append("    isRoaming: ").append(toIndentedString(isRoaming)).append("\n");
    sb.append("    purchase: ").append(toIndentedString(purchase)).append("\n");
    sb.append("    lobbyType: ").append(toIndentedString(lobbyType)).append("\n");
    sb.append("    abilityTargets: ").append(toIndentedString(abilityTargets)).append("\n");
    sb.append("    killed: ").append(toIndentedString(killed)).append("\n");
    sb.append("    senPlaced: ").append(toIndentedString(senPlaced)).append("\n");
    sb.append("    abilityUpgradesArr: ").append(toIndentedString(abilityUpgradesArr)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
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
