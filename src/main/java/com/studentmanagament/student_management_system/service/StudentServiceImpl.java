package com.studentmanagament.student_management_system.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagament.student_management_system.entity.Student;
import com.studentmanagament.student_management_system.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository rep;

    @Override
    public Student saveStudent(Student s) {
         return rep.save(s);
    }

    @Override
    public List<Student> fetchStudentList() {
        return rep.findAll();
    }

    @Override
    public Student fetchStudentById(Long studentid) {
        
        return rep.findById(studentid).get();
    }

    @Override
    public void deleteStudentById(Long studentdid) {
        rep.deleteById(studentdid);
        }

    @Override
    public Student updateStudent(Long studentid, Student s) {
        Student studentDB=rep.findById(studentid).get();

        if(Objects.nonNull(s.getStudentName())&&!"".equalsIgnoreCase(s.getStudentName())){
            studentDB.setStudentName(s.getStudentName());
        }

        if(Objects.nonNull(s.getStudentDepartment())&&!"".equalsIgnoreCase(s.getStudentDepartment())){
            studentDB.setStudentDepartment(s.getStudentDepartment());
        }

        
            studentDB.setStudentMobileNo(s.getStudentMobileNo());
        
        
        return rep.save(studentDB);
    }

    @Override
    public Student fetchStudentByName(String studentName) {
        
        return rep.findByStudentName(studentName);
    }
    
}
