import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Item {

    @SerializedName("match_id")
    @Expose
    private Integer match_id;
    @SerializedName("dire_score")
    @Expose
    private Integer dire_score;
    @SerializedName("radiant_score")
    @Expose
    private Integer radiant_score;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("game_mode")
    @Expose
    private Integer game_mode;
    @SerializedName("radiant_win")
    @Expose
    private Boolean radiant_win;
    @SerializedName("dire_team")
    @Expose
    private Team dire_team;
    @SerializedName("radiant_team")
    @Expose
    private Team radiant_team;
    @SerializedName("players")
    @Expose
    private List<Player> players = new ArrayList<Player>();
    @SerializedName("replay_url")
    @Expose
    private Boolean replay_url;

    public Integer getMatchId() {
        return match_id;
    }
    public Integer getDireScore() {
        return dire_score;
    }
    public Integer getRadiantScore() {
        return radiant_score;
    }
    public Integer getDuration() {
        return duration;
    }
    public Integer getGameMode() {
        return game_mode;
    }
    public Integer getRadiantWin() {
        return radiant_win;
    }
    public Team getRadiantTeam() {
        return radiant_team;
    }
    public Team getDireTeam() {
        return dire_team;
    }
    public Player getPlayers() {
        return players;
    }
    public String getReplayUrl() {
        return replay_url;
    }
}