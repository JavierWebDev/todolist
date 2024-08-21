package com.campuslands.todolist.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.todolist.persistence.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{

}
