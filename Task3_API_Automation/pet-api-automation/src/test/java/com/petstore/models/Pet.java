package com.petstore.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pet {
    private Long id;
    private String name;
    private String status;
    
    @JsonProperty("category")
    private Category category;
    
    @Data
    public static class Category {
        private Long id;
        private String name;
    }
}