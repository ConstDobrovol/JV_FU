package com.ToDoList.services;

import java.util.List;

import com.ToDoList.models.Task;
import com.ToDoList.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Integer id){
        return taskRepository.findById(id).get();
    }

    public void save(Task task){
        taskRepository.save(task);
    }

    public void delete(Integer id){
        taskRepository.deleteById(id);
    }
}
