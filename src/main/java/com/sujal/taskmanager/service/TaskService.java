package com.sujal.taskmanager.service;

import com.sujal.taskmanager.entity.Task;
import com.sujal.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Create
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Get all
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get by ID
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    // Update
    public Task updateTask(Long id, Task updatedTask) {

        Task existingTask = taskRepository.findById(id).orElse(null);

        if (existingTask == null) {
            return null;
        }

        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setTimeAllocated(updatedTask.getTimeAllocated());
        existingTask.setStatus(updatedTask.getStatus());

        return taskRepository.save(existingTask);
    }

    // Delete
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}