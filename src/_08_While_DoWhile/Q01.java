package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */

        int num = 153, temp = 0, sum = 0;

        while (num > 0) {
            temp = num % 10;
            sum += temp * temp * temp;
            num /= 10;
        }
        System.out.println(sum);


    }

}
