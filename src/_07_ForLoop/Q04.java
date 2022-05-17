package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            num = scan.nextInt();
            if (num > 5 && num < 10) {
            } else sum += num;
        }
        System.out.println(sum);


        scan.close();
    }

}
