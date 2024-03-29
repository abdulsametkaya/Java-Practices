package _07_ForLoop;

import java.util.Scanner;

public class Q11 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
    public static void main(String[] args) {

        int num = 20;
        mukemmelSayi(num);


    }

    private static void mukemmelSayi(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num%i == 0){
                sum += i;
            }
        }
        if (sum==num){
            System.out.println("sayi mukemmel");
        }else {
            System.out.println("mukemmel degil");
        }

    }


}
