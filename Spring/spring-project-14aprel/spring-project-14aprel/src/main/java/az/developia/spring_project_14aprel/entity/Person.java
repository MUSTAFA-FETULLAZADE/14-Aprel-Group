package az.developia.spring_project_14aprel.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private int id;
    private String name;
    private int age;
    private double salary;


    public Person() {
        this.id = 1;
        this.name = "Ali Mammadov";
        this.age = 25;
        this.salary = 1500.50;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}