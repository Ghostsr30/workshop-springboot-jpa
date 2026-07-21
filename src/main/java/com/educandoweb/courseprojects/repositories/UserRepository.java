package com.educandoweb.courseprojects.repositories;

import com.educandoweb.courseprojects.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
