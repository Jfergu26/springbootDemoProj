package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jayda = new Student( "Jayda", "Jayda@studen.com", LocalDate.of(1998, Month.FEBRUARY, 27), 26);
            Student jill = new Student( "Jill", "Jill@studen.com", LocalDate.of(1990, Month.FEBRUARY, 1), 35);

            repository.saveAll(List.of(jayda,jill));
        };
    }
}
