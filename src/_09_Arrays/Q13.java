package _09_Arrays;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
         */
        int[] arr = {-3, 10, -21, 6, 27, 8, -1, 12};
        int count = 0;
        for (int i : arr) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);


    }

}
