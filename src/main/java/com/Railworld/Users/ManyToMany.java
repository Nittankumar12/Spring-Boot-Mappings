package com.Railworld.Users;

//import com.Railworld.Students.OneToMany;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToMany {
    public static void main(String[] args) {
        SpringApplication.run(ManyToMany.class, args);
        System.out.println("Many To Many Mapping");
    }
}
