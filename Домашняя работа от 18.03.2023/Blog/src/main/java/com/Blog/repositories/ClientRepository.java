package com.Blog.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blog.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    
    List<Client> findByFirstName(String firstName);
}
