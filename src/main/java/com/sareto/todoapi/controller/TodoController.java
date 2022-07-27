package com.sareto.todoapi.controller;

import com.sareto.todoapi.models.TodoModels;
import com.sareto.todoapi.services.ITodoapiServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @Autowired
    private final ITodoapiServices todoapiServices;

    public TodoController(ITodoapiServices todoapiServices) {
        this.todoapiServices = todoapiServices;
    }
    @Operation(summary = "Add todo item")
    @PostMapping
    public TodoModels AddTodos(@RequestBody TodoModels todoItem){
        return todoapiServices.addTodoItem(todoItem);
    }
    @Operation(summary = "Get all Todo items")
    @GetMapping
    public List<TodoModels> AllTodos(){
        return todoapiServices.AllTodo();
    }
    @Operation(summary = "Get a todoItem by its id")
    @GetMapping("{id}")
    public Optional<TodoModels> getTodoItemById(@PathVariable("id") Long id) throws  IllegalAccessException{
        return todoapiServices.getTodoItemById(id);
    }
    @Operation(summary = "update todo item by its id")
    @PatchMapping("{id}")
    public TodoModels editTodoItem(@PathVariable("id") Long id, @RequestBody TodoModels todoItem){
        return todoapiServices.updateTodoItems(id, todoItem);
    }
    @Operation(summary = "Delete todo item by its id")
    @DeleteMapping("{id}")
    public String deleteTodoItem(@PathVariable("id") Long id){
        todoapiServices.deleteTodoItems(id);
        return "todo item deleted successfully";
    }

}
