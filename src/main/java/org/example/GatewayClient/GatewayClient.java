package org.example.GatewayClient;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GatewayClient {

    public static Response createTokenLogin() {
        String dadosLogin = "{\"username\": \"donero\", \"password\": \"ewedon\"}";
        return given()
                .baseUri("https://fakestoreapi.com")
                .body(dadosLogin)
                .when()
                .post("/auth/login");
    }

}
