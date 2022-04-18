package com.study.account.feign;

import com.study.account.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "${client.baseUrl.placeHolder}")
public interface JSONPlaceHolderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Post> getPosts();

}