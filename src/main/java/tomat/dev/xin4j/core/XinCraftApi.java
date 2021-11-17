package tomat.dev.xin4j.core;

import org.json.JSONObject;
import tomat.dev.xin4j.user.UserInfo;

public class XinCraftApi {
    public static final String BaseUrl = "https://xincraft.net/api";
    public static final String ApiVersion = "v1";

    private final String apiKey;

    public XinCraftApi(String apiKey) {
        this.apiKey = apiKey;
    }

    /*public ApiResponse<UserInfo> getUserInfo(String uuid) {
        return getFromEndpoint("/players/uuid/" + uuid);
    }

    public <T> ApiResponse<T> getFromEndpoint(String endpoint) {
        return new ApiResponse<T>(object)
    }*/
}
