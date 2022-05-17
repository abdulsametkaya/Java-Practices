package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir şifre giriniz : ");
        String sifre = scanner.nextLine();
        if(     (!sifre.contains("\\s")) &&
                (sifre.charAt(0)<='Z' && sifre.charAt(0)>='A') &&
                ( sifre.charAt(sifre.length()-1)<='z' &&  sifre.charAt(sifre.length()-1)>='a') &&
                ( sifre.length()<=8 )
        ){
            System.out.println("Şifreniz BAŞARI İLE TANIMLANDI ! ");
        }else {
            System.out.println("İşlem başarısız. Lütfen yeni bir şifre girin... ");
        }


    }
}
