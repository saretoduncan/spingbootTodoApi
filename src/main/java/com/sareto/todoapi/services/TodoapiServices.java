package com.sareto.todoapi.services;

import com.sareto.todoapi.models.TodoModels;

import java.util.List;

public interface TodoapiServices {
    List<TodoModels>AllTodoApi();
    TodoModels addTodoItem(TodoModels todoModels);
    TodoModels getTodoItemById(Long id) throws  IllegalAccessException;
    TodoModels updateTodoItems(Long id, TodoModels todoModels);
    void deleteTodoItems(Long id);
}
