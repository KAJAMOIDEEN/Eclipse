package com.example.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.StudentNotFoundException;
import com.example.model.ErrorResponse;
import com.example.model.Student;
import com.example.services.StudentService;
import com.example.services.StudentServiceImpl;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

//@Controller
//@ResponseBody //uses HTTP Message converters to convert the return value to HTTP response body
@RestController
@Slf4j
public class StudentController {

	@Autowired
	StudentServiceImpl studentService;

	private final Logger logger = (Logger) LoggerFactory.getLogger(StudentController.class);

	@PostMapping("/addStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		logger.info("List of students");
		logger.warn("students listed...");
		logger.error("error getting");
		logger.trace("tracing student info..");
		logger.debug("debugging student list");
		Student response = studentService.addStudent(student);
		return new ResponseEntity<Student>(response, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/studentsList",method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudents() {

		List<Student> response = studentService.getStudentList();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getStudentsById/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        
		//try {
		Student response = studentService.getStudentById(id)
				.orElseThrow(()-> new StudentNotFoundException("Student not found by id:"+id));
		return ResponseEntity.ok(response);
//		}
//		catch(StudentNotFoundException e) {
//			ErrorResponse errorResponse = new  ErrorResponse(LocalDateTime.now(),"Id not found Error","Id is not found");
//			return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
//		}
	}

	// http://localhost:8080/student/ram/kumar
	// @PathVariable annotation
	@GetMapping("student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student();
	}

	@GetMapping("/students/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student();
	} 
	
	/*
	 * @ExceptionHandler(StudentNotFoundException.class) public ResponseEntity<?>
	 * handleStudentNotFoundException(StudentNotFoundException exception){
	 * ErrorResponse errorResponse = new
	 * ErrorResponse(LocalDateTime.now(),"Id not found Error","Id is not found");
	 * return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	 * }
	 */

}
