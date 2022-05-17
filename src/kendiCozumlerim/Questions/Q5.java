package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q5 {
    //Soru1)Kullanicidanemailadresinigirmesiniisteyin,
    // mail@gmail.comicermiyorsa“lutfengmailadresigiriniz”,@gmail.comilebitiyorsa“Emailadresinizkaydedildi“,
    // @gmail.comilebitmiyorsalutfenyazimikontoledinyazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("mail adresi giriniz");
        String str = scan.nextLine();

        if (str.lastIndexOf("@gmail.com") == str.length()-10){
            System.out.println("Email adresiniz kaydedildi");
        }else if(str.contains("@gmail.com")){
            System.out.println("lutfen yazimi kontol edin");
        }else{
            System.out.println("lutfengmailadresigiriniz");
        }


     scan.close();
    }
}
