package com.campuslands.todolist.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.todolist.persistence.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
