package com.phuc.taco_cloud.data;

import com.phuc.taco_cloud.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
