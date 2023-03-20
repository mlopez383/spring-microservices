package com.ecommerce.cartservice.service;

import com.ecommerce.cartservice.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PRODUCT-SERVICE", url = "http://localhost:8090")
public interface APIClient {

  @GetMapping(value = "/api/products/{id}")
  ProductDto getProductById(@PathVariable("id") Long productId);
}
