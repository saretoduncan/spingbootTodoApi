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
    private Boolean completeTodoItem;

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

}
