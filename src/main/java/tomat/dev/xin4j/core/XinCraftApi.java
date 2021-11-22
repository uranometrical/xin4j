package tomat.dev.xin4j.core;

import com.google.gson.Gson;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.message.BasicHeader;
import tomat.dev.xin4j.endpoints.player.UserInfo;

import java.util.ArrayList;
import java.util.List;
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
     * HttpClient used with every request. Headers initialized in ctor.
     */
    private final HttpClient client;

    public XinCraftApi(String apiKey) {
        // Initialise the HttpClient with a UserAgent and api key header.
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader(HttpHeaders.USER_AGENT, "xin4j/1.0.0"));
        headers.add(new BasicHeader("xincraft-api", apiKey));
        client = HttpClients.custom().setDefaultHeaders(headers).build();
    }

    /**
     * Get an ApiResponse of a UserInfo object from username.
     * @param username The username used to lookup information.
     * @param debug Boolean to print debug text in console.
     * @return Returns the API response object of UserInfo.
     */
    public CompletableFuture<ApiResponse<UserInfo>> getUserInfoFromUsername(String username, boolean debug)
    {
        return getFromEndpoint(UserInfo.class + username, debug);
    }

    /**
     * Get an ApiResponse of a UserInfo object from username.
     * @param username The username used to lookup information.
     * @return Returns the API response object of UserInfo.
     */
    public CompletableFuture<ApiResponse<UserInfo>> getUserInfoFromUsername(String username)
    {
        // PLEASE GOD
        return getFromEndpoint(,"/player/username/" + username, false);
    }

    /// <summary>
    /// Get an ApiResponse of a UserInfo object from uuid.
    /// </summary>
    /// <param name="uuid">The dashed uuid used to lookup information.</param>
    /// <param name="debug">Boolean to print debug text in console.</param>
    /// <returns>Returns the API response object of UserInfo.</returns>
    public async Task<ApiResponse<UserInfo>> GetUserInfoFromUuid( uuid, bool debug = false)
    {
        return await GetFromEndpoint<UserInfo>("/player/uuid/" + uuid, debug);
    }

    /**
     * Get an API response from a provided endpoint.
     * @param endpoint The endpoint to query data from.
     * @param debug Boolean to print debug information to console.
     * @param <T> IApiObject derived type to parse the data into.
     * @return Returns an API response object of the provided type.
     */
    private <R extends IApiObject> CompletableFuture<ApiResponse<R>> getFromEndpoint(Class<R> clazz, String endpoint, boolean debug)
    {
        // Create a local variable to ease grabbing the url.
        String url = BaseUrl + endpoint;

        // Check if debug is true.
        if (debug)
        {
            // Print debug information of the url.
            System.out.println("[query] querying " + url);
            // todo: Print debug information of the headers.
        }

        // I AM CRYING AND COPING SO HARD
        // I HATE JAVA SO MUCH PLEASE CAN
        // JAVA NOT EXIST PLEASE GOD HELP
        // I AM LEAVING TOMAT TO DO THIS
        // IM NOT GOING TO SPEND 50 FUCKING
        // HOURS ON THIS DUMB LITTLE SHIT THING
        // DUE TO THIS POORLY CODED LANGUAGE
        // AND SHITTY EVERYTHING-SYSTEM.

        String json = "";

        Gson gson = new Gson();
        return gson.fromJson(json, ApiResponse<R>.class);
    }
}
