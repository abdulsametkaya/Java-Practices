package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scanner = new Scanner(System.in);
        int pin;

        do {
            System.out.println("pini giriniz: ");
            pin = scanner.nextInt();
        } while (pin != 12345);

        System.out.println("girdiğiniz pin doğru");


    }
}

