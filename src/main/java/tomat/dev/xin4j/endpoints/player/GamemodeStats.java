package tomat.dev.xin4j.endpoints.player;

import com.google.gson.annotations.SerializedName;

/**
 * Struct for statistics such as wins and losses.
 */
public class GamemodeStats {
    @SerializedName("wins")
    public int wins;

    @SerializedName("losses")
    public int losses;

    @SerializedName("draws")
    public int draws;

    @SerializedName("kills")
    public int kills;

    @SerializedName("deaths")
    public int deaths;

    @SerializedName("goals")
    public int goals;

    @SerializedName("winstreak")
    public int winstreak;

    @SerializedName("bestWinstreak")
    public int bestWinstreak;
}
