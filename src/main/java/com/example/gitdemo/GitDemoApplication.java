package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hot-fix");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
