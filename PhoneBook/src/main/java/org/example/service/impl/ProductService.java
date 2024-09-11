package org.example.service.impl;

import lombok.AllArgsConstructor;
import org.example.mapper.ProductMapper;
import org.example.models.product.ProductItemDTO;
import org.example.repo.ProductImageRepository;
import org.example.repo.ProductRepository;
import org.example.service.IProductService;
import org.example.storage.StorageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;
    private final ProductImageRepository productImageRepository;
    private final StorageService storageService;
    private final ProductMapper productMapper;

    @Override
    public List<ProductItemDTO> get() {
        var list = new ArrayList<ProductItemDTO>();
        var data = productRepository.findAll();
        for (var product : data) {
            ProductItemDTO productItemDTO = productMapper.ProductItemDTOByProduct(product);

            var items = new ArrayList<String>();
            for (var img : product.getProductImages()) {
                items.add(img.getName());
            }
            productItemDTO.setFiles(items);
            list.add(productItemDTO);
        }
        return list;
    }
}