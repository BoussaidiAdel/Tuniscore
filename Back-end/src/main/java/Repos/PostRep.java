package Repos;

import Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRep extends MongoRepository<Post,Integer> {

    @Query(sort = "{ 'publishedAt' : -1 }")
    List<Post> findTopByOrderByPublishedAtDesc(int limit);
}
