package org.example.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private Date creationTime;
    private double price;
    private double discount;
    private List<ProductImageDto> images;
    private Long categoryId;
    private String categoryName;
}
