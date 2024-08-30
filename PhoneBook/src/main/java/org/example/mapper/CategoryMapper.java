package org.example.mapper;

import org.example.entities.CategoryEntity;
import org.example.models.category.CategoryCreateDTO;
import org.mapstruct.Mapping;

public interface CategoryMapper {
    @Mapping(target = "image", ignore = true)
    CategoryEntity categoryEntityByCategoryCreateDTO(CategoryCreateDTO category);
}