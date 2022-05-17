package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q9 {
    //Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
    //“Sifre basari ile tanimlandi”, sartlari saglamazsa
    //“Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
    //Ilk harf buyuk harf olmali
    //Son harf kucuk harf olmali
    //Sifre bosluk icermemeli
    //Sifre uzunlugu en az 8 karakter olmali

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("bir şifre giriniz");
        String password = scan.nextLine();

        char firstWord = password.charAt(0);
        char lastWord = password.charAt(password.length() - 1);

        if (('A' <= firstWord && firstWord <= 'Z')
                && ('a' <= lastWord && lastWord <= 'z')
                && (!(password.contains(" ")))
                && (password.length()>=8)) {

            System.out.println("Sifre basari ile tanimlandi");
        }else{
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }

        scan.close();
    }


}
