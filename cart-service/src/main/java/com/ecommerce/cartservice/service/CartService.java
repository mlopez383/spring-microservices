package com.ecommerce.cartservice.service;

import com.ecommerce.cartservice.dto.ResponseDto;
import com.ecommerce.cartservice.entity.Cart;

public interface CartService {

  Cart saveCart(Cart cart);

  ResponseDto getCart(Long cartId);
}
