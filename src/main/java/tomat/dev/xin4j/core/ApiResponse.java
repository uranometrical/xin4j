package tomat.dev.xin4j.core;

public class ApiResponse<T> {
    public T Response;
    public Boolean Successful = false;
    public String Error = "";

    public ApiResponse(Boolean successful, T data, String error) {
        Successful = successful;
        if (successful && data != null) {
            Response = data;
        }
        Error = error;
    }
}
