package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        int ceil = (int) Math.ceil(41 / (double) 20);
        System.out.println(ceil);

//        SpringApplication.run(DemoApplication.class, args);
    }

}
