package com.example.controllers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exception.StudentNotFoundException;
import com.example.model.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
  
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<?> handleStudentNotFoundException(StudentNotFoundException exception){
		ErrorResponse errorResponse = new  ErrorResponse(LocalDateTime.now(),exception.getMessage(),"Id is not found");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}

}
