package com.example.springbasic.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student (
                        "Ahmad",
                        "Baryal",
                        LocalDate.now(),
                        "contact@mail.com",
                        35

                ),
                new Student (
                        "Mahmood",
                        "Amiri",
                        LocalDate.now(),
                        "admin@mail.com",
                        26

                )

        );
    }
}
