package com.exam.cs2019032.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class StudentController {
    @Autowired private StudentService service;
    @GetMapping("/students")
    public String showStudentList(Model model){
        List<Student> listStudents = service.listAll();
        model.addAttribute("listStudents",listStudents);
        return "students";
    }
    @GetMapping("/studentForm")
    public String addStudentMarks(Model model){
        model.addAttribute("student",new Student());
        return "studentForm";
    }
    @PostMapping("/save")
    public String saveStudent(Student student){
        student.calculateFinalMarks();
        service.save(student);
        return "redirect:/students";
    }
}
