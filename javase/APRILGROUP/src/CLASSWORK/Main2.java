package CLASSWORK;

import java.util.ArrayList;
import java.util.List;


@FunctionalInterface
interface MaxFinder {
    int find(List<Student> list, int index, int currentMax);
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mustafa", 95));
        students.add(new Student("Zaur", 45));
        students.add(new Student("Ali", 70));
        students.add(new Student("Leyla", 30));
        students.add(new Student("Murad", 85));

       
        MaxFinder maxFinder = new MaxFinder() {
            @Override
            public int find(List<Student> list, int index, int currentMax) {
             
                if (index == list.size()) {
                    return currentMax;
                }
                
             
                int score = list.get(index).score;
                int newMax = (score > currentMax) ? score : currentMax;
                
              
                return find(list, index + 1, newMax);
            }
        };

        
        int result = maxFinder.find(students, 0, 0);

        System.out.println("Ən yüksək bal: " + result);
    }
}