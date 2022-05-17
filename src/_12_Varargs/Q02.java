package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        topla(5,2,3,4,5,7,9);

    }

    public static void topla(int carpilacakSayi, int... toplanacakSayilar) {

        int sum = 0;
        for (int each : toplanacakSayilar){
            sum += each;
        }
        System.out.println(sum*carpilacakSayi);

    }
}
