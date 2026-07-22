package com.educandoweb.courseprojects.repositories;

import com.educandoweb.courseprojects.entities.Order;
import com.educandoweb.courseprojects.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
