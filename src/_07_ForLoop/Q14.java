package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {
        int num = 6;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i =num; i>=0; i--){
            for(int j =0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }









    }
}
