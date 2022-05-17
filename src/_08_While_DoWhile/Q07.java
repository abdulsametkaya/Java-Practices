package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
      /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.

       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tuşa basınız : ");
        String basilanTus = scanner.next().toLowerCase();
        while(!basilanTus.equals("x")){
            System.out.println("Program Çalışıyor...");
            System.out.println("Lütfen bir tuşa basınız : ");
            basilanTus= scanner.next().toLowerCase();
        }
        System.out.println("Program SONLANDI");


    }
}
