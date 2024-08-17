package com.soham.student_management_system.controller;

import com.soham.student_management_system.dto.StudentDto;
import com.soham.student_management_system.service.StudentService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @GetMapping
    public String home() {
        return "redirect:/students";
    }

    @GetMapping("students")
    public String listStudents(Model model) {
        List<StudentDto> students = studentService.getAllStudents();
        model.addAttribute("students", students);

        return "students";
    }

    @GetMapping("students/new")
    public String newStudent(Model model) {
        StudentDto student = new StudentDto();
        model.addAttribute("student", student);

        return "create-student";
    }

    // to handle save student request
    @PostMapping("/students")
    public String saveStudents(@Valid @ModelAttribute("student") StudentDto studentDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("student", studentDto);
            return "create-student";
        }

        studentService.createStudent(studentDto);

        return "redirect:/students";
    }

    @GetMapping("students/{id}/edit")
    public String editStudent(@PathVariable("id") Long studentId, Model model) {
        StudentDto studentDto = studentService.getStudentById(studentId);
        model.addAttribute("student", studentDto);

        return "edit-student";
    }

    @PostMapping("students/{id}")
    public String updateStudent(@PathVariable("id") Long studentId, @Valid @ModelAttribute StudentDto studentDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("student", studentDto);
            return "edit-student";
        }

        studentDto.setId(studentId);
        studentService.updateStudent(studentDto);

        return "redirect:/students";
    }

    @GetMapping("/students/{id}/delete")
    public String deleteStudent(@PathVariable("id") Long studentId) {
        studentService.deleteStudent(studentId);

        return "redirect:/students";
    }


    @GetMapping("/students/{id}/view")
    public String viewStudent(@PathVariable("id") Long studentId, Model model) {
        StudentDto studentDto = studentService.getStudentById(studentId);
        model.addAttribute("student", studentDto);

        return "view-student";
    }
}
