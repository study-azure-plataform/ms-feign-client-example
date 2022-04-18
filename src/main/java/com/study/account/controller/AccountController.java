package com.study.account.controller;

import com.study.account.feign.JSONPlaceHolderClient;
import com.study.account.model.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/account", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {

    private final JSONPlaceHolderClient client;

    @GetMapping
    public List<Post> gelAll(){

        log.info("### Indo buscar lista de Posts no <<JSONPlaceHolder>> | Demonstration");
        List<Post> posts = client.getPosts();
        log.info("### Retorna lista encontrada no <<JSONPlaceHolder>> | Demonstration");
        return posts;
    }

}
