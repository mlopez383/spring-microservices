package com.ecommerce.productservice.service;

import com.ecommerce.productservice.entity.Product;

public interface ProductService {
  Product saveProduct(Product product);
  Product getProductById(Long productId);
}
