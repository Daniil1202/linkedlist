package ru.gb.exapmle1_sem5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.exapmle1_sem5.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
