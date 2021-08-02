package com.example.api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthTokenInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();

        Request request = originalRequest.newBuilder()
                .header("Authorization", "AuthToken").build();

        Response res = chain.proceed(request);
        if (res.code() == 401) {
            String newToken = "";//fetch from some other source
            if (newToken != null) {
                Request newRequest =  chain.request().newBuilder()
                        .addHeader("Authorization", newToken)
                        .build();
                return chain.proceed(newRequest);
            }
        }
        return res;
    }
}
