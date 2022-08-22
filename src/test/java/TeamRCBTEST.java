import api.RestResource;
import api.StatusCode;
import base.BaseClass;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.Player;
import pojo.Team;
import utility.Parser;

import static utility.StatusCodeHandler.assertStatusCode;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 12:01 PM
 */

//Test Methods
public class TeamRCBTEST extends BaseClass {
    @Test(description = "Test that validates that team has only 4 foreign players")
    public void validateOnlyFourForeignPlayers() {
        Response response = RestResource.get();
        assertStatusCode(response.getStatusCode(), StatusCode.CODE_200);
        Team team = Parser.getInstance().getTeam(response.getBody().asString());

        int foreignPlayerCount = 0;
        for (Player player : team.getPlayer()) {
            if (!player.getCountry().equalsIgnoreCase("India"))
                foreignPlayerCount++;
        }
        System.out.println("Foreign Player Counts are: " + foreignPlayerCount);
        Assert.assertTrue(foreignPlayerCount <= 4, "Wicket keeper is more than expected");
    }

    @Test(description = "Test that validates that there is at least one wicket keeper")
    public void validateOnlyOneWWicketKeeper() {
        Response response = RestResource.get();
        assertStatusCode(response.getStatusCode(), StatusCode.CODE_200);
        Team team = Parser.getInstance().getTeam(response.getBody().asString());

        int wicketKeeperCount = 0;
        for (Player player : team.getPlayer()) {
            if (player.getRole().equalsIgnoreCase("Wicket-keeper"))
                wicketKeeperCount++;
        }
        System.out.println("Wicket Keeper Count is: " + wicketKeeperCount);
        Assert.assertTrue(wicketKeeperCount >= 1, "Foreign players limit is unexpected");
    }
}
