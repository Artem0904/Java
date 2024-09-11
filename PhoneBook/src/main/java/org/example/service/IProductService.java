package org.example.service;

import org.example.models.product.ProductItemDTO;

import java.util.List;

public interface IProductService {
    List<ProductItemDTO> get();
}