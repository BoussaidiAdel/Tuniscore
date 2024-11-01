package Repos;

import Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
    // Add custom query methods if needed, e.g., find by email
    User findByEmail(String email);
}