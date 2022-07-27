package com.sareto.todoapi.models;

import javax.persistence.*;

@Entity
@Table(name="todo")
public class TodoModels {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "todoItem")
    private String todoItem;
    @Column(name = "completeTodoItem")
    private Boolean completeTodoItem=false;

    public TodoModels() {
    }//empty constructor

    public TodoModels(String todoItem, Boolean completeTodoItem) {
        this.todoItem = todoItem;
        this.completeTodoItem = completeTodoItem;
    }//main constructor

    @Override
    public String toString() {
        return "TodoModels{" +
                "id=" + id +
                ", todoItem='" + todoItem + '\'' +
                ", completeTodoItem=" + completeTodoItem +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getTodoItem() {
        return todoItem;
    }

    public Boolean getCompleteTodoItem() {
        return completeTodoItem;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTodoItem(String todoItem) {
        this.todoItem = todoItem;
    }

    public void setCompleteTodoItem(Boolean completeTodoItem) {
        this.completeTodoItem = completeTodoItem;
    }
}
