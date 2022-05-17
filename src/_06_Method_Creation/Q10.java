package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {
    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true
        Örnek 2:
        Girdi: 0
        Çıktı: false
     */
    public static void main(String[] args) {
        int num1 = 81;
        System.out.println(usMethodu(num1));

    }

    private static boolean usMethodu(int num1) {
        boolean ucUssu = false;
        while (num1 % 3 == 0) {
            num1 /= 3;
        }
        if (num1 == 1) {
            ucUssu = true;
        }

       return ucUssu;
        
    }


}
