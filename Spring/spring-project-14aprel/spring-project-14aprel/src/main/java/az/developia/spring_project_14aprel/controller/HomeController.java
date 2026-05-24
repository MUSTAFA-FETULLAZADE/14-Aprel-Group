package az.developia.spring_project_14aprel.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/hello")
    public String sayHello() {
     
        logger.info("Hello endpoint-i çağırıldı!");
        
        return "Salam! Log faylına baxmağı unutmayın.";
    }
}