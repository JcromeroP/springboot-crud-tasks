package com.proyecto.task.app.taskApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.task.app.taskApp.models.Task;
import org.springframework.stereotype.Service;

import com.proyecto.task.app.taskApp.Repositories.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task with id " + id + " no found"));
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task taskDetails) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task with id " + id + " no found."));
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.isCompleted());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task with id " + id + " no found."));

        taskRepository.delete(task);
    }

}
