package com.ToDoList.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private boolean ready;
    private String category;
    private String user;
    private String creation_date;
    private String update_date;
    // Задание – Категория – многие ко многим
    @ManyToOne
    @JoinColumn(name="user", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    private User last_name;

}
