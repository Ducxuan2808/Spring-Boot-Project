package com.project.shopapp.services;

import com.project.shopapp.dtos.OrderDTO;
import com.project.shopapp.exceptions.DataNotFoundException;
import com.project.shopapp.models.Order;

import java.util.List;

public interface IOrderService {
    Order createOrder (OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(long id) ;
    List<Order> findByUserId(Long userId);
}
