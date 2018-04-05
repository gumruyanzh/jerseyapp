package com.jersey.resource;


import com.jersey.entity.Post;
import com.jersey.service.PostService;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/posts")
public class PostResource {


    private PostService postService = new PostService();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPosts(){
        List<Post> posts = postService.getPosts();
        GenericEntity<List<Post>> entity = new GenericEntity<List<Post>>(posts) {};
        return Response.ok(entity).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPost(@PathParam("id") Long id){
        Post post = postService.getPostById(id);
        return Response.ok(post).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPost(Post post){
        Post createdPost = postService.createPost(post);
        return Response.status(Response.Status.CREATED).entity(createdPost).build();
    }
}
