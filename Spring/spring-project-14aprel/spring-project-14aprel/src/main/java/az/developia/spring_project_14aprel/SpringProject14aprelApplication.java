package az.developia.spring_project_14aprel;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import az.developia.spring_project_14aprel.entity.Employee;

@SpringBootApplication
public class SpringProject14aprelApplication {

    public static void main(String[] declaration) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringProject14aprelApplication.class, declaration);
        

        Employee emp = context.getBean("employeeBean", Employee.class);
        

        System.out.println("Employee obyekti uğurla alındı: " + emp);
    }

}