package com.Blog.services;

import java.util.List;

import com.Blog.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blog.models.Client;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClienService {
    @Autowired
    private ClientRepository userRepository;

    public List<Client> getAllUsers(){
        return userRepository.findAll();
    }

    public List<Client> getUserByFirstName(String firstName){
        return userRepository.findByFirstName(firstName);
    }

    public void saveUser(Client user){
        userRepository.save(user);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }

    public Client getUserById(Integer id){ return userRepository.findById(id).get();
    }
}
