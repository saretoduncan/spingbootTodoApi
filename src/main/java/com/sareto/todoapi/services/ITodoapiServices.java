package com.sareto.todoapi.services;

import com.sareto.todoapi.models.TodoModels;

import java.util.List;
import java.util.Optional;

public interface ITodoapiServices {
    List<TodoModels>AllTodoApi();
    TodoModels addTodoItem(TodoModels todoModels);
    Optional<TodoModels> getTodoItemById(Long id) throws  IllegalAccessException;
    TodoModels updateTodoItems(Long id, TodoModels todoModels);
    void deleteTodoItems(Long id);
}
