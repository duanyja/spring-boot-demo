package com.example.demo.bean;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private  long id;
    private String name;
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
