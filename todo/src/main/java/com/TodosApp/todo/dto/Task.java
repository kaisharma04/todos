package com.TodosApp.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Task {
     int id;
     String taskMessage;
     Date date;
     String status;

     public Task(Task task){
          this.id = task.id;
          this.taskMessage = task.taskMessage;
          this.date = new Date();
          this.status = task.status;
     }
}
