package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi
	     iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen
	 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 3 sayı giriniz:");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("kenar uzunluğu negatif olamaz");
        } else if (num1 + num2 > num3 && num1 + num3 > num2 && num3 + num2 > num1) {
            if (num1 == num2 && num1 == num3) {
                System.out.println("eşkenar üçgendir");
            } else {
                System.out.println("çeşitkenar üçgendir");
            }
        } else {
            System.out.println("üçgen değildir");
        }


        scan.close();
    }

}
