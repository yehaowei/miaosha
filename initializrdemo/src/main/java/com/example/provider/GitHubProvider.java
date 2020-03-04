package com.example.provider;

import com.alibaba.fastjson.JSON;
import com.example.dataobject.GitHubDo;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GitHubProvider {
    MediaType mediaType = MediaType.get("application/json; charset=utf-8");

    //post
    public String accessToken(GitHubDo gitHubDo) {
         MediaType mediaType = MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(gitHubDo));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String test=response.body().string();
            System.out.println(test);
            return test;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    //post
    public String getAccessTokenInfo(String accessToken) {
        OkHttpClient client = new OkHttpClient();
        System.out.println("https://api.github.com/user?access_token="+accessToken);
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token="+accessToken)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String test=response.body().string();
            System.out.println(test);
            return test;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
