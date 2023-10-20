package com.example.cunsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class CunsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CunsumerApplication.class, args);
    }

}
