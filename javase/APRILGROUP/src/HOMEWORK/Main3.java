package HOMEWORK;

import java.util.ArrayList;
import java.util.List;


interface Observer {
    void update(String message);
}

class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Şagird " + name + " yeni elan aldı: " + message);
    }
}

class School {
    private List<Observer> students = new ArrayList<>();

   
    public void addStudent(Observer student) {
        students.add(student);
    }

    public void removeStudent(Observer student) {
        students.remove(student);
    }

   
    public void announce(String message) {
        System.out.println("\nMəktəb rəhbərliyi elan verir: " + message);
        for (Observer student : students) {
            student.update(message);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        School school = new School();

     
        Student s1 = new Student("Əli");
        Student s2 = new Student("Leyla");
        Student s3 = new Student("Mustafa");

      
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

     
        school.announce("Sabah məktəb saat 09:00-da başlayacaq.");

     
        school.removeStudent(s2);

   
        school.announce("Gələn həftə riyaziyyatdan imtahan olacaq.");
    }
}
