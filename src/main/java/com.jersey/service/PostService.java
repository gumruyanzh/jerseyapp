package com.jersey.service;

import com.jersey.entity.Post;
import com.jersey.repository.PostRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostService {

    private Map<Long, Post> posts = PostRepository.getPosts();

    public PostService() {
        Post post1 = new Post(1, "new post 1");
        Post post2 = new Post(2, "new post 2");
        posts.put(1L, post1);
        posts.put(2L, post2);
    }

    public List<Post> getPosts(){
         return new ArrayList<Post>(posts.values());
    }

    public Post getPostById(Long id) {
        return posts.get(id);
    }

    public Post createPost(Post post){
        post.setId(posts.size()+1);
        posts.put(post.getId(), post);
        return post;
    }

    public Post updatePost(Post post){
        if (post.getId() > 0 ){
            posts.put(post.getId(), post);
            return post;
        }
        return null;
    }

    public void deletePost(Long id){
        if (posts.containsKey(id)){
            posts.remove(id);
        }
    }

}
