package com.example.demospringnextu.services;

import com.example.demospringnextu.models.Teacher;
import com.example.demospringnextu.repositories.TeacherRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Data
@RequiredArgsConstructor
@Service
@Transactional
public class TeacherService {

    private final TeacherRepository teacherRepository;

  /*  public List<Teacher> getTeacherByTeacherId(Integer teacherId){
        return teacherRepository.findByTeacherId(teacherId);
    }*/

   /* public Optional<Teacher> getTeacherById(Integer id) {
        return teacherRepository.findById(teacherId);
    }*/



    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }


    public Teacher getTeacher(Integer teacherId) {
        return teacherRepository.findById(teacherId).orElse(null);
    }

    public List<Teacher> getTeachersByLastname(String searchString) {
        return teacherRepository.findByLastnameContaining(searchString);
    }
}
