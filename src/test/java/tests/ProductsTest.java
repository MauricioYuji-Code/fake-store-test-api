package tests;

import static io.restassured.RestAssured.given;
import org.example.requestspecification.CommonRequestBuilder;
import org.junit.jupiter.api.Test;

public class ProductsTest {

    private String path = "/products";

    private String getPayloadProduct(String id) {
        return """
                {
                  "id": "%s",
                  "title": "Test",
                  "price": 100,
                  "description": "Test",
                  "category": "Test",
                  "image": "test.jpg",
                  "rating": {
                    "rate": 5,
                    "count": 120
                  }
                }
                """.formatted(id);
    }

    @Test
    void addProduct() {
        given()
                .spec(CommonRequestBuilder.getFakeStoreSpec())
                .body(getPayloadProduct("21"))
                .when()
                .post(path)
                .then()
                .statusCode(200);
    }

    @Test
    void delProduct() {
        given()
                .spec(CommonRequestBuilder.getFakeStoreSpec())
                .when()
                .delete(path + "/21")
                .then()
                .statusCode(200);
    }
}
