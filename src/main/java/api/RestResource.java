package api;

import io.restassured.response.Response;

import static api.SpecBuilder.requestSpec;
import static api.SpecBuilder.responseSpec;
import static io.restassured.RestAssured.given;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 11:51 AM
 */

// API Methods
public class RestResource {
    public static Response get() {
        return given().spec(requestSpec()).
                when().get().
                then().spec(responseSpec()).
                extract().
                response();
    }
}
