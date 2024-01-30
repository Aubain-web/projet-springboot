package com.example.demospringnextu.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "coursId")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer coursId;

    private String name;

    private String duree;

    @ManyToOne
    private StudentGroup studentGroup;



}

