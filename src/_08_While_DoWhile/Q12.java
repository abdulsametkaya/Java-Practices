package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        int num = 44;
        int i = 0;
        while (i < num) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }


    }
}
