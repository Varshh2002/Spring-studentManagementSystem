package com.studentmanagament.student_management_system.service;

import java.util.List;

import com.studentmanagament.student_management_system.entity.Student;

public interface StudentService {

    Student saveStudent(Student s);

    List<Student> fetchStudentList();

    Student fetchStudentById(Long studentid);

    void deleteStudentById(Long studentdid);

    Student updateStudent(Long studentid, Student s);

    Student fetchStudentByName(String studentName);
    
}
