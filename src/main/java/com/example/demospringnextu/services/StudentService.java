package com.example.demospringnextu.services;

import com.example.demospringnextu.models.Cours;
import com.example.demospringnextu.models.Student;
import com.example.demospringnextu.models.StudentGroup;
import com.example.demospringnextu.repositories.StudentRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Service
@Transactional
public class StudentService {

    private final StudentRepository studentRepository;

    public Student getStudent(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public List<Student> getStudentWithNameContaining(String search) {
        return studentRepository.findAllByNameContains(search);
    }


    public List<Student> getStudentWithAgeLessThan(Integer age) {
        return studentRepository.findAllByAgeLessThan(age);
    }

    public List<Student> getStudentWithMailDomain(String mailDomain) {
        return studentRepository.findAllByMailEndsWith(mailDomain);
    }

   /* public List<Student> getStudentByStudentGroupId(Integer studentGroupId) {
        final StudentGroup studentGroup = StudentGroup.builder().studentGroupId(studentGroupId).build();
        return studentRepository.findAllByStudentGroup(studentGroup);
    }*/





}
