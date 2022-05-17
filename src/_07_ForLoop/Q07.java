package _07_ForLoop;

import java.util.Scanner;

public class Q07 {


     /*  TASK :
            Matrisin boyutunu kullanıcıdan okuyup.
            Sadece diyagonu (köşegeni) 1 olan ve
            diğer elemanları 0 olan bir kare matrisi ekrana bastırın.

           Ekran Çıktısı
            Bir sayı giriniz: 7
            1000000
            0100000
            0010000
            0001000
            0000100
            0000010
            0000001

            Bir sayi giriniz: 5
            10000
            01000
            00100
            00010
            00001
       */

    public static void main(String[] args) {

        int num1 = 5;
        for (int i = 0; i <= num1; i++) {
            for (int j = 0; j <= num1; j++) {
                if (i != j) {
                    System.out.print("0");
                } else System.out.print("1");

            }
            System.out.println(" ");
        }


    }
}
