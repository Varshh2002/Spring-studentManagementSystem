package com.studentmanagament.student_management_system.controller;

import java.util.List;

//import org.apache.catalina.startup.RealmRuleSet;
//import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagament.student_management_system.entity.Student;
import com.studentmanagament.student_management_system.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
    @Autowired
   private  StudentService service;

    //insert data into a database
    @PostMapping("/students")
    public Student saveStudent(@Valid @RequestBody Student s){
         return service.saveStudent(s);

    }
     
    //get all the student details
    @GetMapping("/students")
    public List<Student> fetchStudentList(){
     return service.fetchStudentList();
    }

    //get the student details by id
    @GetMapping("/students/{id}")
    public Student fetchStudentById(@PathVariable("id") Long studentid){
         return service.fetchStudentById(studentid);
    }

    //delete the student data
    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentdid){
        service.deleteStudentById(studentdid);   
        return "student details deleted succesfully";
    }

    //update the student details
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable("id") Long studentid,@RequestBody Student s){
       return service.updateStudent(studentid,s);
    }
       
    //update student details by name
    @GetMapping("/students/name/{name}")
    public Student fetchStudentByName(@PathVariable("name") String studentName){
       return service.fetchStudentByName(studentName);
    }
}
