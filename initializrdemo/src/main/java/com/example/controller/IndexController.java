package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.dataobject.GitHubDo;
import com.example.provider.GitHubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    private GitHubDo gitHubDo;
    @Value("${github.client_id}")
    private String client_id;

    @Value("${github.client_secret}")
    private String client_secret;

    @GetMapping("/yhw")
    public String login() {
        return "index";
    }

    @GetMapping("/callback")
    public String callBack(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        GitHubProvider gitHubProvider = new GitHubProvider();
        gitHubDo.setState(state);
        gitHubDo.setCode(code);
        gitHubDo.setClient_id(client_id);
        gitHubDo.setClient_secret(client_secret);
        gitHubDo.setRedirect_uri("http://localhost:10086/callback");
        String returnMsg = gitHubProvider.accessToken(gitHubDo);
        System.out.println(returnMsg);
        String returnAccess = returnMsg.split("&")[0];

        System.out.println(returnAccess);
        String accessToken = returnAccess.split("=")[1];
        System.out.println(accessToken);
        String vs = gitHubProvider.getAccessTokenInfo(accessToken);
        System.out.println(vs);
        return "index";
    }
}
