package tomat.dev.xin4j.endpoints.player;

import com.google.gson.annotations.SerializedName;

/**
 * Statistics of the player including overall, solos, doubles, threes and fours.
 */
public class PlayerStats {
    @SerializedName("overall")
    public GamemodeStats overall;

    @SerializedName("solos")
    public GamemodeStats solos;

    @SerializedName("doubles")
    public GamemodeStats doubles;

    @SerializedName("threes")
    public GamemodeStats threes;

    @SerializedName("fours")
    public GamemodeStats fours;
}
