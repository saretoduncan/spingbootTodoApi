package com.sareto.todoapi.controller;

import com.sareto.todoapi.models.TodoModels;
import com.sareto.todoapi.services.ITodoapiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/todo")
public class TodoController {
    @Autowired
    private final ITodoapiServices todoapiServices;

    public TodoController(ITodoapiServices todoapiServices) {
        this.todoapiServices = todoapiServices;
    }
    @PostMapping
    public TodoModels AddTodos(@RequestBody TodoModels todoItem){
        return todoapiServices.addTodoItem(todoItem);
    }
}
