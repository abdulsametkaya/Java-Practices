package tasks;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        int num = 128;

        boolean sonuc=powersofTwo(num);
        System.out.println("isPowerOfTwo:"+sonuc);


    }

    private static boolean powersofTwo(int num) {

        boolean isPowerOfTwo = false;
        while(num>2) {
            if(num%2!=0) break;
            else num=num/2;
        }
        if(num==0) ;
        else if(num%2==0) isPowerOfTwo=true;
        return isPowerOfTwo;
    }
}

