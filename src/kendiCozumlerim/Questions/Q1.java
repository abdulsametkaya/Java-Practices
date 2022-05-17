package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q1 {
    //Soru1:Kullanicidan haftanin kacinci gunu olduğunu sorun ve gunismini yazdirin
    //Soru2:Kullanicidan kacinci ayoldugunu sorun ve ay ismini yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("haftanın kaçıncı günü?");

        int day = scan.nextInt();

        switch (day) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Sali");
            case 3 -> System.out.println("Carsamba");
            case 4 -> System.out.println("Persembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("Gecerli sayi giriniz");
        }

        scan.close();
    }

}
