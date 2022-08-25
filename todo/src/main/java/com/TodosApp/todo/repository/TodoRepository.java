package com.TodosApp.todo.repository;


import com.TodosApp.todo.dto.Task;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TodoRepository {

    final static Map<Integer, Task> todoTasks = new HashMap();

    TodoRepository() {
        todoTasks.put(1, new Task(1, "study java 8 basics", new Date(), "completed"));
        todoTasks.put(2, new Task(2, "Get ready with SpringBoots basics", new Date(), "InProgress"));
        todoTasks.put(3, new Task(3, "Study Junit basics and Mockito", new Date(), "completed"));
        todoTasks.put(4, new Task(4, "Study RestApis and study spring security", new Date(), "completed"));
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(todoTasks.values());
    }

    public Task createTasks(Task task) {
        return todoTasks.put(task.getId(), task);
    }

    public Task getTaskById(int id) {
        return todoTasks.get(id);
    }

    public Task updateTaskById(Task task) {
        Task task1 = todoTasks.get(task.getId());
        if (!Objects.isNull(task1)) {
            if (Objects.isNull(task.getTaskMessage())) {
                task1.setStatus(task.getStatus());
            } else if (Objects.isNull(task.getStatus())) {
                task1.setTaskMessage(task.getTaskMessage());
            } else {
                task1.setTaskMessage(task.getTaskMessage());
                task1.setStatus(task.getStatus());
            }
        }

        return todoTasks.put(task1.getId(),task1);
    }

    public void deleteTaskById(int id) {
        todoTasks.remove(id);
    }
}
