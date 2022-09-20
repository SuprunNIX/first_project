package RestApi;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestAPI extends Specification {


    @Test
    public void firstPostRequest() {
        Specification.installSpecification(Specification.requestSpec("api.mathjs.org/v4/?expr=5+(7-9)"), Specification.responseSpec200());
        String[] action = {"2*(7-3)", "10/(3+2)", "5+7", "3-10", "4^2"};

        for(int i = 0; i < action.length; i++) {
            int expected;
            if (action[i].contains("^")) {
                expected = (int) Math.pow(4, 2);
                given()
                .body("{\n" +
                        "    \"expr\": [\n" +
                        "        \"" + action[i] + "\"\n" +
                        "    ],\n" +
                        "    \"precision\": 14\n" +
                        "}")
                        .when()
                        .header("User-Agent", "Learning RestAssured")
                        .contentType(ContentType.JSON)
                        .post("http://api.mathjs.org/v4/")
                        .then()
                        .log().all()
                        .body(equalTo("{\"result\":[\""+ expected + "\"],\"error\":null}"))
                        .assertThat().statusCode(200);

            } else {
                if (action[i] == "2*(7-3)") {
                    expected = 2*(7-3);
                    given()
                            .when()
                            .header("User-Agent", "Learning RestAssured")
                            .contentType(ContentType.JSON)
                            .get("http://api.mathjs.org/v4/?expr=" + action[i])
                            .then()
                            .log().all()
                            .body(equalTo("" + expected + ""))
                            .assertThat().statusCode(200);
                } else if (action[i] == "10/(3+2)") {
                    expected = 10/(3+2);
                    given()
                            .when()
                            .header("User-Agent", "Learning RestAssured")
                            .contentType(ContentType.JSON)
                            .get("http://api.mathjs.org/v4/?expr=" + action[i])
                            .then()
                            .log().all()
                            .body(equalTo("" + expected + ""))
                            .assertThat().statusCode(200);
                } else if (action[i] == "5+7") {
                    expected = 5+7;
                    given()
                            .when()
                            .header("User-Agent", "Learning RestAssured")
                            .contentType(ContentType.JSON)
                            .get("http://api.mathjs.org/v4/?expr=" + action[i])
                            .then()
                            .log().all()
                            .body(equalTo("" + expected + ""))
                            .assertThat().statusCode(200);
                } else if (action[i] == "3-10") {
                    expected = 3-10;
                    given()
                            .when()
                            .header("User-Agent", "Learning RestAssured")
                            .contentType(ContentType.JSON)
                            .get("http://api.mathjs.org/v4/?expr=" + action[i])
                            .then()
                            .log().all()
                            .body(equalTo("" + expected + ""))
                            .assertThat().statusCode(200);
                }
            }
        }
    }
}
