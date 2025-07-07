package tests;

import org.example.requestspecification.CommonRequestBuilder;
import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;
import static io.restassured.RestAssured.given;

public class CartsTest {

    private String path = "/carts";

    private String getPayloadProduct(String id) {
        return """
                {
                  "id": %s,
                  "userId": 0,
                  "products": [
                    {
                      "id": 0,
                      "title": "string",
                      "price": 0.1,
                      "description": "string",
                      "category": "string",
                      "image": "http://example.com"
                    }
                  ]
                }
                """.formatted(id);
    }

    @Test
    void addCart() {
        given()
                .spec(CommonRequestBuilder.getFakeStoreSpec())
                .body(getPayloadProduct("11"))
                .when()
                .post(path)
                .then()
                .body("id", is(11))
                .body("userId", is(0))
                .statusCode(200);
    }

    @Test
    void updCart() {
        given()
                .spec(CommonRequestBuilder.getFakeStoreSpec())
                .body(getPayloadProduct("11"))
                .when()
                .put(path + "/11")
                .then()
                .statusCode(200);
    }

    @Test
    void delCart() {
        given()
                .spec(CommonRequestBuilder.getFakeStoreSpec())
                .when()
                .put(path + "/11")
                .then()
                .statusCode(200);
    }
}
