package com.example.demospringnextu.services;

import com.example.demospringnextu.models.Cours;
import com.example.demospringnextu.models.StudentGroup;
import com.example.demospringnextu.repositories.StudentGroupRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Data
@RequiredArgsConstructor
@Service
@Transactional
public class StudentGroupService {

    private final StudentGroupRepository studentGroupRepository;

    public StudentGroup getStudentGroup(Integer studentGroupId) {
        return studentGroupRepository.findById(studentGroupId).orElse(null);
    }

    public List<Cours> getCoursForStudentGroup(Integer studentGroupId) {
        StudentGroup studentGroup = studentGroupRepository.findByStudentGroupId(studentGroupId);
        return null;
    }

    public List<Cours> getCoursesForStudentGroup(Integer studentGroupId) {
        StudentGroup studentGroup = studentGroupRepository.findById(studentGroupId).orElse(null);

        if (studentGroup != null) {
            return studentGroup.getCours();
        } else {
            return Collections.emptyList();
        }
    }





}
