package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "persons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String nationality;
    private String dateOfBirth;
}



