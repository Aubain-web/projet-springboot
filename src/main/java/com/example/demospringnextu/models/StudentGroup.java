package com.example.demospringnextu.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
        property = "studentGroupId")
public class StudentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentGroupId;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "studentGroup")
    @JsonManagedReference(value = "studentGroup")
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name = "schoolId")
    private School school;


    @JsonIgnore
    @OneToMany(mappedBy = "studentGroup")
    @JsonManagedReference(value = "studentGroup")
    private List<Cours> cours;


}