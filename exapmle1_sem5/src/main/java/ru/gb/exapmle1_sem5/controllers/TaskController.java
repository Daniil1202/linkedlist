package ru.gb.exapmle1_sem5.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.exapmle1_sem5.model.Task;
import ru.gb.exapmle1_sem5.model.TaskStatus;
import ru.gb.exapmle1_sem5.services.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {

    private final TaskService service;

    @GetMapping("/tasks")  //вывод html формы
    public List<Task> getAllTasks(){
        return service.getAllTasks();
    }

    @PostMapping("/tasks") // обработка формы
    public String createTask(@RequestBody Task task){
        service.addTask(task);
        return "new" + task;

    }
    @GetMapping("/status/{status}")
    public List<Task> getTaskByStatus(@PathVariable("status")String status){
        return service.getTaskByStatus(TaskStatus.valueOf(status));
    }

    @PutMapping("/update/{id}") //обработка на обновление статуса
    public String updateTaskStatus(@PathVariable("id") Long id, @RequestBody TaskStatus taskStatus){
        service.updateStatus(id, taskStatus);
        return "Статус по id :" + id + "обновлен на " + taskStatus;
    }
    @DeleteMapping("/delete/{id}")//обработка на удаление задачи
    public String deleteTask(@PathVariable("id")Long id){
        service.deleteTask(id);
        return "Задача по id" + id + "успешно удалена";
    }


}
