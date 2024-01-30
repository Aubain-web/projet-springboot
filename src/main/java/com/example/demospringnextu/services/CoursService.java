package com.example.demospringnextu.services;


import com.example.demospringnextu.repositories.CoursRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Data
@RequiredArgsConstructor
@Service
@Transactional
public class CoursService  {

    private final CoursRepository coursRepository;
}
