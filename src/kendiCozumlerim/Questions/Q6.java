package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q6 {
    //Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa
    // tum cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
    // iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("cumle giriniz");
        String str = scan.nextLine();

        if (str.contains("buyuk")){
            System.out.println(str.toUpperCase());
        }else if(str.contains("kucuk")){
            System.out.println(str.toLowerCase());
        }

        scan.close();
    }

}

