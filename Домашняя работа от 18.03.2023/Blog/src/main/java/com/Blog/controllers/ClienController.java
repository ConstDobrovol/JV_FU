package com.Blog.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import com.Blog.services.PostService;
import com.Blog.services.ClienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Blog.models.Client;
import com.Blog.models.Post;

@RestController
@RequestMapping("/user")
public class ClienController {
    @Autowired
    private ClienService userService;
    @Autowired
    private PostService postService;

    @PostMapping("/{id}/task/")
    public void addTask(@PathVariable Integer id, @RequestBody Post post){
        Client user = userService.getUserById(id);
        post.setUser(String.valueOf(user));
        postService.save(post);
    }


    @GetMapping("")
    public List<Client> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> get(@PathVariable Integer id){
        try{
            Client user = userService.getUserById(id);
            return new ResponseEntity<Client>(user, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/name/{name}")
    public List<Client> getByName(@PathVariable String name){
        return userService.getUserByFirstName(name);
    }

    @PostMapping("/")
    public void add(@RequestBody Client user){
        userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Client user, @PathVariable Integer id){
        try{
            Client baseUser = userService.getUserById(id);
            baseUser.updateClient(user);
            userService.saveUser(baseUser);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
