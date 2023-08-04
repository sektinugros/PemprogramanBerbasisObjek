package w07_Inheritance;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
      double  a = 100, b = 25, hasil = 0;
    
    Scanner input = new Scanner(System.in);
        System.out.println("nilai a = 100 dan Nilai b = 25");
          System.out.println("=========================");
        System.out.println("pilih pilihan anda: ");
          System.out.println("--------------------------");
        System.out.println("1 . menampilkan Hasil dari a + b :");
        System.out.println("2 . menampilkan hasil dari a - b :");

          System.out.println("=========================");
        System.out.print ("masukkan pilihan anda : ");
        
         String pilihan = input.nextLine();
        
switch (pilihan) {
case "1" -> {
    System.out.print ("Anda memilih untuk menampilkan Hasil dari a + b | ");
    hasil = a + b;
    System.out.println(" dan Hasil dari Perhitungan tersebut adalah : " + hasil);
            }
case "2" -> {
    System.out.print ("Anda memilih untuk menampilkan Hasil dari a - b | ");
    hasil = a - b;
    System.out.println("Dan Hasil dari Perhitungan tersebut adalah : " + hasil);
            }
default -> System.out.println("Maaf Pilihan Anda Salah !");            
         }
    }
}
