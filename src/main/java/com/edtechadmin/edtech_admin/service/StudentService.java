package com.edtechadmin.edtech_admin.service;


import com.edtechadmin.edtech_admin.entity.Student;

import java.util.List;

public interface StudentService {


    Student loadStudentById(Long studentId);
    List<Student> findStudentsByName(String name);
    Student loadStudentByEmail(String email);
    Student createStudent(String firstName, String lastName, String level, String email, String password);
    Student updateStudent(Student student);
    List<Student> fetchStudents();
    void removeStudent(Long studentId);
}
