package az.developia.spring_project_14aprel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getBooksPage() {
        return "books"; 
    }
}