package az.developia.spring_project_14aprel.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.entity.RAM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public RAM ramBean() {
        return new RAM(16, "DDR5");
    }

    @Bean
    public Computer computerBean(RAM ram) {
        Computer comp = new Computer();
        comp.setRam(ram); 
        return comp;
    }
    @Bean
    public Employee employeeBean(@Qualifier(value = "computerBean") Computer computer) {
        Employee emp = new Employee();
        emp.setComputer(computer); 
        return emp;
    }
}