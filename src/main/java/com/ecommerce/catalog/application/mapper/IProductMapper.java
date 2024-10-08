package com.ecommerce.catalog.application.mapper;

import com.ecommerce.catalog.application.dto.CreateProductDto;
import com.ecommerce.catalog.domain.model.Product;

public interface IProductMapper {
  Product toModel(CreateProductDto createProductDto, String id);

  // User MapEstruct
  CreateProductDto toDto(Product product);
}
