package az.developia.spring_project_14aprel.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    @Autowired
    @Qualifier(value="computer")
    private Computer computer; 


    public Employee() {
        this.id = 101;
        this.name = "Mustafa";
        this.age = 14;
        this.salary = 17000.0;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public Computer getComputer() { return computer; }
    public void setComputer(Computer computer) { this.computer = computer; }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + 
               ", salary=" + salary + "]\nİşçinin kompüteri: " + computer;
    }
}
