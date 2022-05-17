package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayı giriniz: ");
        int num1 = scan.nextInt();

        System.out.println(num1>=0 ? (num1<10? "Rakam":"pozitif sayı"):("negatif sayı"));

    }
}
