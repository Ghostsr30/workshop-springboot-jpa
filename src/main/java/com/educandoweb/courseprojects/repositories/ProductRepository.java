package com.educandoweb.courseprojects.repositories;

import com.educandoweb.courseprojects.entities.Category;
import com.educandoweb.courseprojects.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
