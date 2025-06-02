package com.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.model.Student;

public interface StudentService {

	Student addStudent(Student student);

	List<Student> getStudentList();

	Optional<Student> getStudentById(Long id);

	void deleteStudentById(Long id);

}
