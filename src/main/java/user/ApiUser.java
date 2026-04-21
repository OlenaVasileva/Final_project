package user;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.openqa.selenium.devtools.v108.tracing.model.StreamFormat;
import random.TestConstants;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ApiUser {
    public ApiUser() {
        RestAssured.baseURI = TestConstants.BASE_URL;
    }

    public Response createNewUserStep(User user) {
        return given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("/api/signup");
    }

}
