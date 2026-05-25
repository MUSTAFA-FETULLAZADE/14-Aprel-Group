//package az.developia.spring_project_14aprel.controller;
//
//import az.developia.spring_project_14aprel.model.Student;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class StudentController {
//
//    private static final List<Student> studentList = new ArrayList<>();
//    private static long idCounter = 1;
//
//
//    static {
//        studentList.add(new Student(idCounter++, "Əli", "Əliyev", "ali@gmail.com"));
//        studentList.add(new Student(idCounter++, "Aysel", "Məmmədova", "aysel@gmail.com"));
//    }
//
//
//    @GetMapping("/students")
//    public String showStudentPage(Model model) {
//        model.addAttribute("students", studentList); 
//        model.addAttribute("newStudent", new Student()); 
//        return "student-register"; 
//    }
//
//
//    @PostMapping("/add-student")
//    public String registerStudent(@ModelAttribute("newStudent") Student student) {
//        student.setId(idCounter++); 
//        studentList.add(student);   
//        return "redirect:/students"; 
//    }
//}