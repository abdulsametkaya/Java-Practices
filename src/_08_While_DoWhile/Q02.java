package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        String str = "java cok heyecanli";
        int i = 0;
        while (i <= str.length() - 1) {
            if (str.indexOf(str.charAt(i)) % 2 != 0) {
                System.out.print(str.charAt(i) + " ");
            }
            i++;
        }

    }

}
