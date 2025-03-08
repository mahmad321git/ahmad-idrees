package com.petstore.models;

import lombok.Data;
import java.util.List;

@Data
public class Pet {
    private Long id;
    private String name;
    private String status;
    private Category category;
    private List<Tag> tags;
    
    @Data
    public static class Category {
        private Long id;
        private String name;
    }

    @Data
    public static class Tag {
        private Long id;
        private String name;
    }
}