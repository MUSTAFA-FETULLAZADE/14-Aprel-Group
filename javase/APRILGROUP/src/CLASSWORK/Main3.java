package CLASSWORK;


@FunctionalInterface
interface Square {

 int calculate(int x);
}

public class Main3 {
 public static void main(String[] args) {


     Square s = (x) -> x * x;

     int number = 5;
     int result = s.calculate(number);


     System.out.println(number + " ədədinin kvadratı: " + result);
 }
}
