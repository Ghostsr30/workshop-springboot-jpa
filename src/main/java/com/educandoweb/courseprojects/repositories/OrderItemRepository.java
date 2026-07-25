package com.educandoweb.courseprojects.repositories;

import com.educandoweb.courseprojects.entities.OrderItem;
import com.educandoweb.courseprojects.entities.User;
import com.educandoweb.courseprojects.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
