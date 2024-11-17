package com.example.fancrab_backened.service;

import com.example.fancrab_backened.exception.ProductException;
import com.example.fancrab_backened.modal.Cart;
import com.example.fancrab_backened.modal.CartItem;
import com.example.fancrab_backened.modal.User;
import com.example.fancrab_backened.request.AddItemRequest;


public interface CartService {
    public Cart createCart(User user);

    public CartItem addCartItem(Long userId, AddItemRequest req) throws ProductException;

    public Cart findUserCart(Long userId);


}
