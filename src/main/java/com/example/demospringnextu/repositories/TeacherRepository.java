package com.example.demospringnextu.repositories;


import com.example.demospringnextu.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    //List<Teacher> findByTeacherId(Integer teacherId);
    List<Teacher> findByLastnameContaining(String searchString);
}
