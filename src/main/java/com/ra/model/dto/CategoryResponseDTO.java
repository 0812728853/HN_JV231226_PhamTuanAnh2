package com.ra.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CategoryResponseDTO {
    private Long id;
    private String categoryName;
    private Boolean categoryStatus;
    public CategoryResponseDTO(Category category){
        this.id = category.getId();
        this.categoryName = category.getCategoryName();
        this.categoryStatus = category.getCategoryStatus();
    }
}