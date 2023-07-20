package com.demo.sample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private long id;
    private String name;
    private String description;
    private long price;
}
