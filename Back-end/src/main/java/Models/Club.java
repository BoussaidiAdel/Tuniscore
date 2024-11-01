package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "clubs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Club {

    private String area;
    private String name;
    private String shortName;
    private String tla;
    private String crest;
    private String address;
    private String website;
    private int founded;
    private String clubColors;
    private String venue;
    private Person coach;
    private int marketValue;
    private List<SquadMembre> squad;

}
