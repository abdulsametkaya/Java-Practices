package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        String str = "java";

        System.out.println("" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0));

        for (int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }




    }
}
