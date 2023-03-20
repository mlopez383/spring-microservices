package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
@AllArgsConstructor
public class ProductController {
  private ProductService productService;

  @PostMapping
  public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
    Product savedProduct = productService.saveProduct(product);
    return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
  }

  @GetMapping("{id}")
  public ResponseEntity<Product> getProductById(@PathVariable("id") Long productId) {
    Product product = productService.getProductById(productId);
    return ResponseEntity.ok(product);
  }
}
