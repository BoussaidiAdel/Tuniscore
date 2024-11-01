package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "SquadMembres")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SquadMembre extends Person {

    private String position;
    private int shirtNumber;
    private double marketValue;
}
