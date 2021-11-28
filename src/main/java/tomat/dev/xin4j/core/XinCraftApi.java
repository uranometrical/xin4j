package tomat.dev.xin4j.core;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.hc.core5.http.HttpHeaders;
import tomat.dev.xin4j.endpoints.player.UserInfo;
import tomat.dev.xin4j.util.HttpUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Main API class where endpoints are accessed from.
 */
public class XinCraftApi {
    /**
     * Base URL for all requests.
     */
    public static final String BaseUrl = "https://xincraft.net/api/v1";

    /**
     * API key used to authorize requests.
     */
    private final String ApiKey;

    public XinCraftApi(String apiKey) {
        ApiKey = apiKey;
    }

    /**
     * Get an ApiResponse of a UserInfo object from username.
     * @param username The username used to lookup information.
     * @return Returns the API response object of UserInfo.
     */
    public CompletableFuture<ApiResponse<UserInfo>> getUserInfoFromUsername(String username)
    {
        return getFromEndpoint("/player/username/" + username);
    }

    /*
    /// <summary>
    /// Get an ApiResponse of a UserInfo object from uuid.
    /// </summary>
    /// <param name="uuid">The dashed uuid used to lookup information.</param>
    /// <param name="debug">Boolean to print debug text in console.</param>
    /// <returns>Returns the API response object of UserInfo.</returns>
    public async Task<ApiResponse<UserInfo>> GetUserInfoFromUuid(String uuid)
    {
        return await GetFromEndpoint<UserInfo>("/player/uuid/" + uuid, debug);
    }*/

    /**
     * Get an API response from a provided endpoint.
     * @param endpoint The endpoint to query data from.
     * @param <R> IApiObject derived type to parse the data into.
     * @return Returns an API response object of the provided type.
     */
    private <R extends IApiObject> CompletableFuture<ApiResponse<R>> getFromEndpoint(String endpoint)
    {
        Map<String, String> headers = new HashMap<>();
        headers.put(HttpHeaders.USER_AGENT, "xin4j/1.0.0");
        headers.put("xincraft-api", ApiKey);

        String json = HttpUtils.getJson(BaseUrl + endpoint, headers);

        Type type = new TypeToken<ApiResponse<R>>(){}.getType();
        return new Gson().fromJson(json, type);
    }
}
