package tomat.dev.xin4j.core;

import com.google.gson.annotations.SerializedName;

/**
 * Used for every response from the API.
 * @param <T> The API object deriving from IApiObject
 */
public class ApiResponse<T> implements IApiObject {
    @SerializedName("success")
    public Boolean success;

    @SerializedName("data")
    public T data;

    @SerializedName("cause")
    public String cause;
}
