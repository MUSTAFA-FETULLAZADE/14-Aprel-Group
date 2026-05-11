package az.developia.spring_project_14aprel.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private int id;
    private String name;
    private int age;
    private double salary;

  
    public Person() {
        this.id = 101;
        this.name = "Nicat Aliyev";
        this.age = 28;
        this.salary = 2500.0;
        System.out.println(">>> Person obyekti yaradıldı (Constructor işlədi).");
    }

   
    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

   
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}