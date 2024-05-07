package vn.tvn.practice.session_7;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class APIUtils {

    private final OkHttpClient httpClient = new OkHttpClient();

    public String get(String url){
        Request request = new Request.Builder()
                .url(url)
                .addHeader("token", "....")  // add request headers
                .addHeader("User-Agent", "OkHttp Bot")
                .build();
        try {
            Response response = httpClient
                    .newCall(request)
                    .execute();
            return response.body().string();
        } catch (IOException e){
            throw new IllegalArgumentException("Error: " + e.getMessage());
        }
    }
}
