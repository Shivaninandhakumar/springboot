package com.example.whatsappdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.whatsappdemo.model.Student;
import com.example.whatsappdemo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studsServices;
	@GetMapping(value="/landin")
	public List<Student> getAllStudents()
	{
		List<Student>studsList = studsServices.getAllStudents();
		return studsList;
	}
	
	@PostMapping(value="/saveStudent")
	public Student saveStudent(@RequestBody Student s)
	{
		return studsServices.saveStudent(s);
	}
	@PostMapping(value="/updateStudent")
	public Student updateStudent(@RequestBody Student s)
	{
		return studsServices.saveStudent(s);
	}
	@DeleteMapping(value="deleteStudent/(rno)")
	public void deleteStudent(@PathVariable ("rno") int regno)
	{
		studsServices.deleteStudent(regno);
	}
	@GetMapping(value="/getStudent/(rno)")
	public Student getStudent(@PathVariable("rno") int regno)
	{
		return studsServices.getStudent(regno);
	}

}
