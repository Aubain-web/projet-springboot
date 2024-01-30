package com.example.demospringnextu.controllers;


import com.example.demospringnextu.models.Student;
import com.example.demospringnextu.models.Teacher;
import com.example.demospringnextu.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();

        return ResponseEntity.ok(teachers);
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable("id") Integer id) {
        return teacherService.getTeacher(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Teacher>> getTeachersByLastname(@RequestParam String searchString) {
        List<Teacher> teachers = teacherService.getTeachersByLastname(searchString);

        return ResponseEntity.ok(teachers);
    }

}