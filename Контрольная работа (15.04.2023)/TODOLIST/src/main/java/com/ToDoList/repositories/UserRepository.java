package com.ToDoList.repositories;
import java.util.List;

import com.ToDoList.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    List<User> findByFirstName(String firstName);
}
