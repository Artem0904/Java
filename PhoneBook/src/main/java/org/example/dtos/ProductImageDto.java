package org.example.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductImageDto {
    private Long id;
    private String name;
    private int priority;
    private Date dateCreated;
    private Long productId;
}
