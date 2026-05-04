package az.developia.spring_project_14aprel;

import az.developia.spring_project_14aprel.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;


public class Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Application.class, args);

        System.out.println("------------------------------------");


        Person person = context.getBean(Person.class);
        System.out.println("Person məlumatları:");
        System.out.println("ID: " + person.getId());
        System.out.println("Ad: " + person.getName());
        System.out.println("Yaş: " + person.getAge());
        System.out.println("Maaş: " + person.getSalary());

        System.out.println("------------------------------------");


        System.out.println("Spring Context-dəki bütün Bean-lərin siyahısı:");
        String[] allBeans = context.getBeanDefinitionNames();
        Arrays.sort(allBeans); 
        for (String beanName : allBeans) {
            System.out.println(beanName);
        }
    }
}