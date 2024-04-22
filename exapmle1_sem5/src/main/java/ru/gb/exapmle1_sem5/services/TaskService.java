package ru.gb.exapmle1_sem5.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.exapmle1_sem5.model.Task;
import ru.gb.exapmle1_sem5.model.TaskStatus;
import ru.gb.exapmle1_sem5.repository.TaskRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> getAllTasks() {  //получение списка всех задач
        return taskRepository.findAll();
    }

    public void addTask(Task task) {  //создание новой задачи
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {   //удаление задачи по id
        if (taskRepository.existsById(id)) taskRepository.deleteById(id);
    }

    public List<Task> getTaskByStatus(TaskStatus status) { //получение списка задач по статусу
        return taskRepository.findAll().stream().filter(task ->
                task.getTaskStatus() == status).collect(Collectors.toList());
    }

    public void updateStatus(Long id, TaskStatus status) {//обновление статуса задачи
        taskRepository.findById(id).ifPresent(task -> {
            task.setTaskStatus(status);
            taskRepository.save(task);
        });
    }


}
