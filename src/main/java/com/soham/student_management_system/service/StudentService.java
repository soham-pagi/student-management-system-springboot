package com.soham.student_management_system.service;

import com.soham.student_management_system.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
    void createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long studentId);
    void updateStudent(StudentDto studentDto);
    void deleteStudent(Long studentId);
}
