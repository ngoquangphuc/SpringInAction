package com.phuc.taco_cloud.data;

import com.phuc.taco_cloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
