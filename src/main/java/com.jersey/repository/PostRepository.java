package com.jersey.repository;

import com.jersey.entity.Post;

import java.util.HashMap;
import java.util.Map;

public class PostRepository {

    private static Map<Long, Post> postsMap = new HashMap<Long, Post>();


    public static Map<Long, Post> getPosts(){
        return postsMap;
    }
}
