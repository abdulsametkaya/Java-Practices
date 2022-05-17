package _08_While_DoWhile;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = scan.nextInt();
        numbers[1] = scan.nextInt();
        numbers[2] = scan.nextInt();
        numbers[3] = scan.nextInt();
        numbers[4] = scan.nextInt();
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println(numbers[4]);


    }
}


