package com.petstore.api;

import com.petstore.models.Pet;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class PetAPI {
    private static final String BASE_URL = System.getProperty("base.url", "https://petstore.swagger.io/v2");
    
    public static Response createPet(Pet pet) {
        return given()
            .baseUri(BASE_URL)
            .contentType("application/json")
            .body(pet)
            .post("/pet");
    }

    public static Response getPet(Long petId) {
        return given()
            .baseUri(BASE_URL)
            .get("/pet/" + petId);
    }
    
    // Add update/delete methods similarly
}