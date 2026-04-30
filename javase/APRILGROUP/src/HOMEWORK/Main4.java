package HOMEWORK;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Main4 {
    public static void main(String[] args) {
      
        List<Product> products = new ArrayList<>();
        products.add(new Product("Monitor", 120));
        products.add(new Product("Klaviatura", 45));
        products.add(new Product("Noutbuk", 1500));
        products.add(new Product("Telefon", 800));
        products.add(new Product("Siçan", 25));


        Optional<String> result = products.stream()
                .filter(p -> p.getPrice() > 60)          
                .map(Product::getName)                       
                .sorted()                                   
                .reduce((name1, name2) -> name1 + " " + name2); 

       
        result.ifPresent(System.out::println);
    }
}