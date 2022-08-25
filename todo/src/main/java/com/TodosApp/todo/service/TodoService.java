package com.TodosApp.todo.service;


import com.TodosApp.todo.dto.Task;
import com.TodosApp.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Task> getAllTasks() {
        return todoRepository.getAllTasks();
    }

    public Task createTask(Task task) {
        return todoRepository.createTasks(task);
    }

    public Task getTaskById(int id) {
        return todoRepository.getTaskById(id);
    }

    public Task updateTask(Task task) {
        return todoRepository.updateTaskById(task);
    }


    public void deleteTaskById(int id) {
      todoRepository.deleteTaskById(id);
    }
}
