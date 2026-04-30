package HOMEWORK;


interface RunStrategy {
 void run();
}


class FastRun implements RunStrategy {
 @Override
 public void run() {
     System.out.println("Personaj çox sürətlə qaçır! (Sürət: 20 km/saat)");
 }
}

class SlowRun implements RunStrategy {
 @Override
 public void run() {
     System.out.println("Personaj yavaş-yavaş qaçır. (Sürət: 5 km/saat)");
 }
}


class GameCharacter {
 private RunStrategy runStrategy;

 
 public GameCharacter(RunStrategy runStrategy) {
     this.runStrategy = runStrategy;
 }


 public void setRunStrategy(RunStrategy runStrategy) {
     this.runStrategy = runStrategy;
 }

 public void performRun() {
     runStrategy.run();
 }
}


public class Main2 {
 public static void main(String[] args) {
 
     GameCharacter player = new GameCharacter(new FastRun());
     
     System.out.print("Başlanğıc: ");
     player.performRun();

 
     System.out.println("\n--- Enerji tükəndi, yavaş qaçışa keçilir ---");
     player.setRunStrategy(new SlowRun());
     player.performRun();

   
     System.out.println("\n--- Güc bərpa olundu, yenidən sürətli qaçış ---");
     player.setRunStrategy(new FastRun());
     player.performRun();
 }
}

