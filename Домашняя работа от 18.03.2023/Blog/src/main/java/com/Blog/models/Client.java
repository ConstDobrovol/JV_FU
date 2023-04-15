package com.Blog.models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String login;
    private String lastName;
    private String firstName;
    private String midName;
    private String birthday;
    private String create_date;
    private String update_date;

    @JsonIgnore
    //Пользователь – Пост– один ко многим
    @OneToMany(mappedBy = "user")
    private Set<Post> posts;
}
