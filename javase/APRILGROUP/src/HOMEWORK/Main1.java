package HOMEWORK;


interface Vehicle {
 void move();
}


class Car implements Vehicle {
 @Override
 public void move() {
     System.out.println("Maşın sürülür...");
 }
}

class Bike implements Vehicle {
 @Override
 public void move() {
     System.out.println("Motosiklet sürülür...");
 }
}


class VehicleFactory {
 public Vehicle getVehicle(String type) {
     if (type == null) return null;
     
     if (type.equalsIgnoreCase("CAR")) {
         return new Car();
     } else if (type.equalsIgnoreCase("BIKE")) {
         return new Bike();
     }
     return null;
 }
}


public class Main1 {
 public static void main(String[] args) {
     VehicleFactory factory = new VehicleFactory();

  
     Vehicle v1 = factory.getVehicle("car");
     if (v1 != null) v1.move();

     Vehicle v2 = factory.getVehicle("bike");
     if (v2 != null) v2.move();
 }
}
