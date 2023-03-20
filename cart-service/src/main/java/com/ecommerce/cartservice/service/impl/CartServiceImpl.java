package com.ecommerce.cartservice.service.impl;

import com.ecommerce.cartservice.dto.CartDto;
import com.ecommerce.cartservice.dto.ProductDto;
import com.ecommerce.cartservice.dto.ResponseDto;
import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.repository.CartRepository;
import com.ecommerce.cartservice.service.APIClient;
import com.ecommerce.cartservice.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CartServiceImpl implements CartService {

  private CartRepository cartRepository;
  private APIClient apiClient;

  @Override
  public Cart saveCart(Cart cart) {
    return cartRepository.save(cart);
  }

  @Override
  public ResponseDto getCart(Long cartId) {

    ResponseDto responseDto = new ResponseDto();
    Cart cart = cartRepository.findById(cartId).get();
    CartDto cartDto = mapToCart(cart);

    ProductDto productDto = apiClient.getProductById(cart.getProductId());
    responseDto.setCart(cartDto);
    responseDto.setProduct(productDto);

    return responseDto;
  }

  private CartDto mapToCart(Cart cart) {
    CartDto cartDto = new CartDto();
    cartDto.setId(cart.getId());
    cartDto.setQuantity(cart.getQuantity());
    return cartDto;
  }

}
