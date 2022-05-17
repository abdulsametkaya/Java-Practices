package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

        int num = 153, temp = 0, sum = 0;

        while (num > 0) {
            temp = num % 10;
            sum += temp;
            num /= 10;
        }
        System.out.println(sum);




    }

}
