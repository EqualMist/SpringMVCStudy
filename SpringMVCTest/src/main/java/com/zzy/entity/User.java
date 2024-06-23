package com.zzy.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private Integer age;

    public User(int id, String name, String password, Integer age) {
        this.id = id;
        this.username = name;
        this.password = password;
        this.age = age;
    }
}
