package dev.anurag.productservice.services;

import dev.anurag.productservice.dtos.GenericProductDto;

public interface ProductService {
    public GenericProductDto getProductById(Long id);

    public GenericProductDto createProduct(GenericProductDto genericProductDto);
}
