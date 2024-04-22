package ru.gb.exapmle1_sem5.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tasks")
public class Task {

    @Id   // идентификатор
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)  //описание
    private String description;

    @Column(nullable = false)   //статус
    private TaskStatus taskStatus;

    @Column(name = "CREATE_DATE",nullable = false)   //дата создания
    private LocalDateTime localDateTime;

    @PrePersist
    public void setLocalDateTime(){
        this.localDateTime = localDateTime.now();
    }


}
