package com.petstore.api;

import com.petstore.models.Pet;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PetApiClient {
    
    private static final String BASE_URL = ConfigLoader.getProperty("base.url");
    
    public static Response createPet(Pet pet) {
        return given()
            .contentType("application/json")
            .body(pet)
            .post(BASE_URL + "/pet");
    }

    public static Response getPet(Long petId) {
        return given()
            .get(BASE_URL + "/pet/" + petId);
    }

    public static Response updatePet(Pet pet) {
        return given()
            .contentType("application/json")
            .body(pet)
            .put(BASE_URL + "/pet");
    }

    public static Response deletePet(Long petId) {
        return given()
            .delete(BASE_URL + "/pet/" + petId);
    }
}