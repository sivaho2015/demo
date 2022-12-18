package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.aspectj.weaver.loadtime.Agent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2000, 1, 15)
            );

            Student anne = new Student(
                "Anne",
                "anne.chen@gmail.com",
                LocalDate.of(2003, 5, 5)
            );

            repository.saveAll(List.of(mariam, anne));
        };
    }
}
