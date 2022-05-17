package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    /* TASK :
     kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
     ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
     java code create ediniz.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç sayi olsun = ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("elemanlari giriniz = ");

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Olusturdugunuz array = " + Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1] - arr[0]);

        scan.close();
    }

}
