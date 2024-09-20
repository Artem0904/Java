package org.example.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class CategoryDto {
    private Long id;
    private String name;
    private String image;
    private String description;
    private Date creationTime;
}
