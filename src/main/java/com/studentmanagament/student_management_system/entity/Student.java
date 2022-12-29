package com.studentmanagament.student_management_system.entity;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    @NotBlank(message = "please add department name")
    private String studentName;
    private String studentDepartment;
    private Long studentMobileNo;
    
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDepartment="
                + studentDepartment + ", studentMobileNo=" + studentMobileNo + "]";
    }
    public Student() {
    }
    public Student(Long studentId, String studentName, String studentDepartment, Long studentMobileNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
        this.studentMobileNo = studentMobileNo;
    }
    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentDepartment() {
        return studentDepartment;
    }
    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
    public Long getStudentMobileNo() {
        return studentMobileNo;
    }
    public void setStudentMobileNo(Long studentMobileNo) {
        this.studentMobileNo = studentMobileNo;
    }


}
