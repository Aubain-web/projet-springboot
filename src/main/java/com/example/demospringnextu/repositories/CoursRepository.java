package com.example.demospringnextu.repositories;

import com.example.demospringnextu.models.Cours;
import com.example.demospringnextu.models.StudentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Integer> {
    List<Cours> findAllByStudentGroup(StudentGroup studentGroup);
}
