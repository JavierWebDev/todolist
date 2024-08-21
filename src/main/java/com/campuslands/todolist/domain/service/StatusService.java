package com.campuslands.todolist.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.todolist.domain.repository.StatusRepository;
import com.campuslands.todolist.persistence.entity.Status;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;

    @Transactional
    public void createStatus(Status status) {
        statusRepository.save(status);
    }

    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    public Optional<Status> geStatusById(Long id) {
        return statusRepository.findById(id);
    }

}
