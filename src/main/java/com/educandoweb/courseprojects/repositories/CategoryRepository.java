package com.educandoweb.courseprojects.repositories;

import com.educandoweb.courseprojects.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
