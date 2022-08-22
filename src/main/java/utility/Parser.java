package utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Team;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 11:59 AM
 */

// Parse the Json response
public class Parser {
    private static Parser configLoader;

    //Initializing the Parser object
    public static Parser getInstance() {
        if (configLoader == null) {
            configLoader = new Parser();
        }
        return configLoader;
    }

    //Deserializing json response to pojo
    public Team getTeam(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        Team team;
        try {
            team = mapper.readValue(jsonString, Team.class);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return team;
    }
}
