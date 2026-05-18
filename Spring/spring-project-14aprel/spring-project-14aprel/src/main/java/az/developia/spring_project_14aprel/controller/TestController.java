package az.developia.spring_project_14aprel.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Salam, Spring Boot dünyası!"; 
    }
}