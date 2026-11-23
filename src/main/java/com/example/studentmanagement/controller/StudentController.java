
package com.example.studentmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/api/students")
    public List<Map<String, Object>> getStudents() {

        return List.of(
            Map.of("id", 1, "name", "Rahul Patel", "course", "BCA"),
            Map.of("id", 2, "name", "Priya Shah", "course", "MCA"),
            Map.of("id", 3, "name", "Amit Joshi", "course", "BSc IT")
        );
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Student Management System API!";
    }
}
