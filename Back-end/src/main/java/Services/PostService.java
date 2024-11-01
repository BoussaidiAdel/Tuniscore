package Services;

import Models.Post;
import Repos.PostRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRep postRepo;

    // Create a new post
    public Post createPost(Post post) {
        return postRepo.save(post);
    }

    // Get all posts
    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    // Get a post by ID
    public Optional<Post> getPostById(String StringId) {
        Integer id = Integer.parseInt(StringId);
        return postRepo.findById(id);
    }
    public List<Post> getLatestPosts(int limit) {
        return postRepo.findTopByOrderByPublishedAtDesc(limit);
    }

    // Update a post
    public Post updatePost(String StringId, Post updatedPost) {
        Integer id = Integer.parseInt(StringId);
        Optional<Post> existingPostOpt = postRepo.findById(id);

        if (existingPostOpt.isPresent()) {
            Post existingPost = existingPostOpt.get();

            // Update fields
            existingPost.setAuthor(updatedPost.getAuthor());
            existingPost.setTitle(updatedPost.getTitle());
            existingPost.setDescription(updatedPost.getDescription());
            existingPost.setUrl(updatedPost.getUrl());
            existingPost.setUrlToImage(updatedPost.getUrlToImage());
            existingPost.setPublishedAt(updatedPost.getPublishedAt());
            existingPost.setContent(updatedPost.getContent());

            return postRepo.save(existingPost);
        } else {
            return null; // Or throw an exception
        }
    }

    // Delete a post by ID
    public boolean deletePost(String StringId) {
        Integer id = Integer.parseInt(StringId);
        Optional<Post> existingPostOpt = postRepo.findById(id);

        if (existingPostOpt.isPresent()) {
            postRepo.deleteById(id);
            return true;
        } else {
            return false; // Or throw an exception
        }
    }
}
