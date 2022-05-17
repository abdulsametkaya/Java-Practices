package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q3 {
    //Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("bir seyler gir");

        String str = scan.nextLine().toLowerCase();

        System.out.println("bir harf giriniz");

        String ch = scan.next().toLowerCase();

        if (str.contains(ch)){
            System.out.println("var");
        }else {
            System.out.println("yok");
        }







    }


}
