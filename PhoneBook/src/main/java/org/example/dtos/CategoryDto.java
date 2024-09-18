package org.example.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class CategoryDto {
    private Long id;
    private String name;
    private String image;
    private String description;
    private Date creationTime;
}
