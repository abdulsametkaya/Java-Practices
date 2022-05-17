package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q7 {
    //Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("adınızı giriniz");
        String name = scan.nextLine();
        System.out.println("soyadınızı giriniz");
        String surname = scan.nextLine();

        if (name.length() < surname.length()) {
            System.out.println(surname);
        } else {
            System.out.println(name);
        }

        scan.close();
    }
}
