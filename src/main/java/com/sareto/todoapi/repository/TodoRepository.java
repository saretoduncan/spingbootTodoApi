package com.sareto.todoapi.repository;

import com.sareto.todoapi.models.TodoModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoModels, Long> {
}
