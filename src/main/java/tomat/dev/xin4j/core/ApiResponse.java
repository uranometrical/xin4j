package tomat.dev.xin4j.core;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Used for every response from the API.
 * @param <T> The API object deriving from IApiObject
 */
public class ApiResponse<T> implements IApiObject {
    @JsonProperty("success")
    public Boolean success;

    @JsonProperty("data")
    public T data;

    @JsonProperty("cause")
    public String cause;
}
