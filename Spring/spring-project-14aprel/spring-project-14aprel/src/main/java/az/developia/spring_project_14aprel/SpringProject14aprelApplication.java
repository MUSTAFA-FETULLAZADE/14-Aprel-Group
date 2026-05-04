package az.developia.spring_project_14aprel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import az.developia.spring_project_14aprel.entity.Book;

@SpringBootApplication
public class SpringProject14aprelApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringProject14aprelApplication.class, args);


        Book bookBean = run.getBean(Book.class);
        

        System.out.println(bookBean);


        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("Bean adı: " + name);
        }

        System.out.println("Hello World!");
    }
}