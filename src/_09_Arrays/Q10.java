package _09_Arrays;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
         */
        String str1 = "GayetBasarılı";
        String str2 = "CoookBasarılı";

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        arr1 = arr2;

        System.out.println(Arrays.toString(arr1));




    }

}
