package com.petstore.tests;

import com.petstore.api.PetApiClient;
import com.petstore.models.Pet;
import com.petstore.utils.TestDataGenerator;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import static org.hamcrest.Matchers.*;

class PetApiTests {
    
    private Pet testPet;
    private Long petId;

    @BeforeEach
    void setUp() {
        testPet = TestDataGenerator.createTestPet();
        petId = testPet.getId();
    }

    @Test
    @DisplayName("Complete CRUD lifecycle for a Pet")
    void testPetLifecycle() {
        // Create
        Response createResponse = PetApiClient.createPet(testPet);
        createResponse.then()
            .statusCode(200)
            .body("id", equalTo(petId))
            .body("name", equalTo(testPet.getName()));

        // Read
        PetApiClient.getPet(petId)
            .then()
            .statusCode(200)
            .body("status", equalTo(testPet.getStatus()));

        // Update
        testPet.setStatus("sold");
        PetApiClient.updatePet(testPet)
            .then()
            .statusCode(200)
            .body("status", equalTo("sold"));

        // Delete
        PetApiClient.deletePet(petId)
            .then()
            .statusCode(200);

        // Verify deletion
        PetApiClient.getPet(petId)
            .then()
            .statusCode(404);
    }
}