package org.example.dtos;

import lombok.*;
import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductImageDto {
    private Long id;
    private String name;
    private int priority;
    private Date dateCreated;
    private Long productId;
}
