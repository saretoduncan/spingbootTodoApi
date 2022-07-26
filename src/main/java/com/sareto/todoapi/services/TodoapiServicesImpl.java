package com.sareto.todoapi.services;

import com.sareto.todoapi.models.TodoModels;
import com.sareto.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoapiServicesImpl implements ITodoapiServices {
    @Autowired
    private final TodoRepository todoRepository;

    public TodoapiServicesImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @Override
    public List<TodoModels> AllTodoApi() {
        return todoRepository.findAll();
    }

    @Override
    public TodoModels addTodoItem(TodoModels todoItem) {
       return todoRepository.save(todoItem);
    }

    @Override
    public Optional<TodoModels> getTodoItemById(Long id) throws IllegalAccessException {
        Optional<TodoModels> todoModel= todoRepository.findById(id);
        if(todoModel.isEmpty()){
            throw new IllegalAccessException("todo item doesn't exit");
        }
        return todoModel;
    }

    @Override
    public TodoModels updateTodoItems(Long id, TodoModels todoModels) {
        return null;
    }

    @Override
    public void deleteTodoItems(Long id) {

    }
}
