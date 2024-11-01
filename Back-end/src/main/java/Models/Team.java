package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    private int id;
    private String name;
    private String shortName;
    private String tla;
    private String crest;
    private String formation;
    private int leagueRank;
    private List<SquadMembre> lineup;
    private List<SquadMembre> bench;
    private Person coach;
}
