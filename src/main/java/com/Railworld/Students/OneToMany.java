package com.Railworld.Students;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToMany {
    public static void main(String[] args) {
        SpringApplication.run(OneToMany.class, args);
        System.out.println("One To Many Mapping");
    }
}
