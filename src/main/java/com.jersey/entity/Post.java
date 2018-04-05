package com.jersey.entity;

import java.io.Serializable;

public class Post implements Serializable {



    private long id;
    private String content;

    public Post(long id, String content) {
        this.id =id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
