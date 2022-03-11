package com.example.demo.domain;

public class Test {

    private final String name;

    private Test(String name) {
        this.name = name;
    }

    public static Test create(String name) {
        return new Test(name);
    }


    public String getName() {
        return name;
    }

    

    
}
