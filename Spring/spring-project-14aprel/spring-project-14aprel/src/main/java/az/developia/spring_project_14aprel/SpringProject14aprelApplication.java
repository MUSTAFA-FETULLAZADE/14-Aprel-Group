package az.developia.spring_project_14aprel;

import az.developia.spring_project_14aprel.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProject14aprelApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringProject14aprelApplication.class, args);


        Employee employee = context.getBean(Employee.class);


        System.out.println("====================================");
        System.out.println("EV İŞİ - İşçi və Kompüter Məlumatları:");
        System.out.println(employee);
        System.out.println("====================================");
    }
}