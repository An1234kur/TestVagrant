package utility;

import api.StatusCode;
import org.testng.Assert;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 11:59 AM
 */

//Status code handler
public class StatusCodeHandler {
    public static void assertStatusCode(int actualStatusCode, StatusCode expectedStatusCode) {
        Assert.assertEquals(actualStatusCode, expectedStatusCode.code);
    }
}
