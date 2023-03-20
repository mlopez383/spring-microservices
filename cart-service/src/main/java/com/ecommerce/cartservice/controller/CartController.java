package com.ecommerce.cartservice.controller;

import com.ecommerce.cartservice.dto.ResponseDto;
import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.service.CartService;
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
@RequestMapping("api/carts")
@AllArgsConstructor
public class CartController {
  private CartService cartService;

  @PostMapping
  public ResponseEntity<Cart> saveUser(@RequestBody Cart cart){
    Cart savedCart = cartService.saveCart(cart);
    return new ResponseEntity<>(savedCart, HttpStatus.CREATED);
  }

  @GetMapping("{id}")
  public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long cartId){
    ResponseDto responseDto = cartService.getCart(cartId);
    return ResponseEntity.ok(responseDto);
  }
}
