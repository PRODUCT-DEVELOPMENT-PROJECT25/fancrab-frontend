package com.example.fancrabbackened.service;



import com.example.fancrabbackened.exception.OrderException;
import com.example.fancrabbackened.modal.Address;
import com.example.fancrabbackened.modal.Order;
import com.example.fancrabbackened.modal.User;

import java.util.List;

public interface OrderService {
    public Order createOrder(User user, Address shippingAdress);

    public Order findOrderById(Long orderId) throws OrderException;

    public List<Order> usersOrderHistory(Long userId);

    public Order placedOrder(Long orderId) throws OrderException;

    public Order confirmedOrder(Long orderId)throws OrderException;

    public Order shippedOrder(Long orderId) throws OrderException;

    public Order deliveredOrder(Long orderId) throws OrderException;

    public Order cancledOrder(Long orderId) throws OrderException;

    public List<Order>getAllOrders();

    public void deleteOrder(Long orderId) throws OrderException;

}
