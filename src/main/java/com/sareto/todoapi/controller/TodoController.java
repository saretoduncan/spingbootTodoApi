package com.sareto.todoapi.controller;

import com.sareto.todoapi.models.TodoModels;
import com.sareto.todoapi.services.ITodoapiServices;
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
    @PostMapping
    public TodoModels AddTodos(@RequestBody TodoModels todoItem){
        return todoapiServices.addTodoItem(todoItem);
    }
    @GetMapping
    public List<TodoModels> AllTodos(){
        return todoapiServices.AllTodo();
    }
    @GetMapping("{id}")
    public Optional<TodoModels> getTodoItemById(@PathVariable("id") Long id) throws  IllegalAccessException{
        return todoapiServices.getTodoItemById(id);
    }
    @PatchMapping("{id}")
    public TodoModels editTodoItem(@PathVariable("id") Long id, @RequestBody TodoModels todoItem){
        return todoapiServices.updateTodoItems(id, todoItem);
    }
    @DeleteMapping("{id}")
    public String deleteTodoItem(@PathVariable("id") Long id){
        todoapiServices.deleteTodoItems(id);
        return "todo item deleted successfully";
    }

}
