package org.example.requestspecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.example.GatewayClient.GatewayClient;
import org.example.environment.PropertyLoader;

public class CommonRequestBuilder {



    public static RequestSpecification getFakeStoreSpec(){
        PropertyLoader propertyLoader = new PropertyLoader();
        return new RequestSpecBuilder()
                .setBaseUri(propertyLoader.getUrl())
                .setContentType("application/json;charset=utf-8")
                .addHeader("Authorization", GatewayClient.createTokenLogin().toString())
                .build();
    }

}
