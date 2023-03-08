package BlogApplication.blog.services;

import BlogApplication.blog.entities.Post;
import BlogApplication.blog.payloads.PostDto;
import BlogApplication.blog.payloads.PostResponse;

import java.util.List;

public interface PostService {

    //create
    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

    //update
    PostDto updatePost(PostDto postDto,Integer postId);

    //delete
    void deletePost(Integer postid);
    //get All Post
    PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);
    //get Single Post
    PostDto getPostById(Integer postId);

    //get all post by category
    List<PostDto>getPostsByCategory(Integer categoryId);

    //get all Posts by users
    List<PostDto>getPostsByUser(Integer userId);

    List<PostDto>searchPosts(String keyword);

}
