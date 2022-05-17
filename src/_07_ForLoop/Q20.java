package _07_ForLoop;

import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {

        int num1 = 40;
        int num2 = 28;

        int ebob = 1;
        String ekok = "";
        for (int i = 1; i < num1; i++) {
            if (num1%i == 0 && num2%i == 0) {
                ebob *= i;
            }
        }
        ekok ="" + ((num1 * num2) / ebob);
        System.out.println("EBOB = " + ebob );
        System.out.println("EKOK = " + ekok );


    }
}
