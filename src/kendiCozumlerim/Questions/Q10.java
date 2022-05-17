package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q10 {
    //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
    //isim-soyisim : M***** B*******
    //kart no : **** **** **** 1234

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("adınızı giriniz");
        System.out.println("soyadınızı giriniz");
        System.out.println("kart numaranızı giriniz");

        String name = scan.nextLine();
        String surname = scan.nextLine();
        String cardNumber = scan.nextLine();

        char nameFirstWord = name.toUpperCase().charAt(0);
        char surnameFirstWord = surname.toUpperCase().charAt(0);
        String firstCardNumber = cardNumber.substring(0, 4);

        String lastName = name.substring(1).replaceAll("\\S", "*");
        String lastSurname = surname.substring(1).replaceAll("\\S", "*");
        String lastCardNumber = cardNumber.substring(5).replaceAll("\\S", "*");

        System.out.println(nameFirstWord + lastName + "\n" + surnameFirstWord + lastSurname +
                "\n" + firstCardNumber + lastCardNumber);


        scan.close();
    }


}
