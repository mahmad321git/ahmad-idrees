package com.petstore.utils;

import com.petstore.models.Pet;
import com.petstore.models.Pet.Category;
import com.petstore.models.Pet.Tag;
import java.util.Collections;

public class TestDataGenerator {
    
    public static Pet createTestPet() {
        Pet pet = new Pet();
        pet.setId(System.currentTimeMillis());
        pet.setName("Buddy");
        pet.setStatus("available");
        
        Category category = new Category();
        category.setId(1L);
        category.setName("Dogs");
        pet.setCategory(category);
        
        Tag tag = new Tag();
        tag.setId(1L);
        tag.setName("friendly");
        pet.setTags(Collections.singletonList(tag));
        
        return pet;
    }
}