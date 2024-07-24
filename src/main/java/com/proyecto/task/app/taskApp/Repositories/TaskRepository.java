package com.proyecto.task.app.taskApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.task.app.taskApp.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
