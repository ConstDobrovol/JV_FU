package com.ToDoList.models;

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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthday;
    private String creation_date;
    private String update_date;
    //Пользователь – Задание – один ко многим
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Task> tasks;
}
