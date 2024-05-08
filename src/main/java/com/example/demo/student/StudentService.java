package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
       // return List.of(new Student(1L,"Jayda","Jayda@studen.com", LocalDate.of(1998, Month.FEBRUARY,27),26));
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
