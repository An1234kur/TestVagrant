package pojo;

import java.util.List;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 11:57 AM
 */

public class Team {
    private String name;
    private String location;
    private List<Player> player = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }
}
