package az.developia.spring_project_14aprel.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype") 
public class Home {
    public int id;
    public String address;
    public String color;


    public Home() {
        this.id = 1;
        this.address = "Bakı şəhəri";
        this.color = "Ağ";
        System.out.println("Home obyekti yaradıldı (Constructor işə düşdü).");
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }


    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public String toString() {
        return "Home [id=" + id + ", address=" + address + ", color=" + color + "]";
    }
}