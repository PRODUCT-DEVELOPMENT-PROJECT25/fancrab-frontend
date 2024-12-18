package com.example.fancrab_backened.service;

import com.example.fancrab_backened.exception.CartItemException;
import com.example.fancrab_backened.exception.UserException;
import com.example.fancrab_backened.modal.Cart;
import com.example.fancrab_backened.modal.CartItem;
import com.example.fancrab_backened.modal.Product;

public interface CartItemService {
    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;

    public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);

    public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;

    public CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
