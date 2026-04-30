package HOMEWORK;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentDataSystem {
    public static void main(String[] args) {
     
        String folderName = "student_data";
        String fileName = folderName + "/info.txt";

        File folder = new File(folderName);
        File file = new File(fileName);

        try {
   
            if (!folder.exists()) {
                if (folder.mkdir()) {
                    System.out.println("Qovluq yaradıldı: " + folderName);
                }
            }

         
            if (file.createNewFile()) {
                System.out.println("Fayl yaradıldı: " + file.getName());
            }


            FileWriter writer = new FileWriter(fileName);
            writer.write("Ad: Murad\n");
            writer.write("Soyad: Əliyev\n");
            writer.write("Yaş: 14\n");
            writer.close();
            System.out.println("Məlumatlar fayla uğurla yazıldı.");

          
            System.out.println("\n--- Fayldakı Məlumatlar ---");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
            System.out.println("---------------------------\n");

      
//            if (file.delete()) {
//                System.out.println("Fayl silindi.");
//            }
//
//            if (folder.delete()) {
//                System.out.println("Qovluq silindi.");
//            } else {
//                System.out.println("Qovluq silinmədi (daxili boş olmaya bilər).");
//            }

        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}