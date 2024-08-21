package com.campuslands.todolist.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.todolist.persistence.entity.Task;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskService {
    @Autowired
    private TaskService taskService;

    @Transactional
    public void addTask(Task task) {
        taskService.addTask(task);
    }

    @Transactional
    public void deleteTask(Long id) {
        taskService.deleteTask(id);
    }

    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    public Optional<Task> geStatusById(Long id) {
        return taskService.geStatusById(id);
    }
}
