package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id; // MongoDB uses String for ObjectId by default

    @Field("username") // Optional: specify the field name in the MongoDB document
    private String username;

    @Field("email")
    private String email;

    private String password;

    @Field("verified")
    private boolean verified;

}
