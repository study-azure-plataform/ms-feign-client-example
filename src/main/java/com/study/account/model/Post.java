package com.study.account.model;

import lombok.Value;

@Value
public class Post {

    private int userId;
    private int id;
    private String title;
    private String body;

}
