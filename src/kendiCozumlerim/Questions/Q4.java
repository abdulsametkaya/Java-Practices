package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q4 {
    //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
    // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
    //-Girilen kelime cumlede kullanilmamis.
    //-Girilen kelime cumlede 1 kere kullanilmis.
    //-Girilen kelime cumlede 1’den fazla kullanilmis.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("bir seyler gir");

        String str = scan.nextLine().toLowerCase();

        System.out.println("bir harf giriniz");

        String ch = scan.next().toLowerCase();

        int num1 = str.indexOf(ch);
        int num2 = str.indexOf(ch, num1 + 1);

        if (!str.contains(ch)) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (num2 == -1) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }

        scan.close();

    }

}
