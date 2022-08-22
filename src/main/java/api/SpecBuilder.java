package api;

import constants.Route;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/**
 * @author : Kamal
 * @project : TestVagrant
 * @created : 22/08/2022 - 11:54 AM
 */

// A class to construct request and response specification methods
public class SpecBuilder {
    // Constructing a request specifications
    public static RequestSpecification requestSpec() {
        return new RequestSpecBuilder().
                setBaseUri(Route.BASE_URI).
                setBasePath(Route.BASE_PATH).
                setContentType(ContentType.JSON).
                log(LogDetail.URI).
                build();
    }

    //Building response specification
    public static ResponseSpecification responseSpec() {
        return new ResponseSpecBuilder().
                log(LogDetail.STATUS).
                build();
    }
}
