package com.example.demospringnextu.controllers;

import com.example.demospringnextu.models.Cours;
import com.example.demospringnextu.models.StudentGroup;
import com.example.demospringnextu.services.StudentGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("student_groups")
public class StudentGroupController {

    private final StudentGroupService studentGroupService;

    @GetMapping("/{id}")
    public StudentGroup getStudentGroup(@PathVariable("id") Integer id) {
        return studentGroupService.getStudentGroup(id);
    }

    @GetMapping("/{studentGroupId}/cours")
    public ResponseEntity<List<Cours>> getCoursForStudentGroup(@PathVariable Integer studentGroupId) {
        List<Cours> cours = studentGroupService.getCoursForStudentGroup(studentGroupId);

        return ResponseEntity.ok(cours);
    }


}
