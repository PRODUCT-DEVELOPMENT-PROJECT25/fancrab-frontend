package com.example.fancrabbackened.repository;

import com.example.fancrabbackened.modal.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
