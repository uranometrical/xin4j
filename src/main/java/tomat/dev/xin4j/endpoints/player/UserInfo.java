package tomat.dev.xin4j.endpoints.player;

import com.google.gson.annotations.SerializedName;
import tomat.dev.xin4j.core.IApiObject;

import java.util.List;

/**
 * UserInfo object returned when querying the /player endpoint.
 */
public class UserInfo implements IApiObject
{
    @SerializedName("uuid")
    public String Uuid;

    @SerializedName("name")
    public String Name;

    @SerializedName("title")
    public String Title;

    @SerializedName("rankcolor")
    public String RankColor;

    @SerializedName("stats")
    public PlayerStats Stats;

    @SerializedName("favoritemaps")
    public List<Object> FavoriteMaps;
}