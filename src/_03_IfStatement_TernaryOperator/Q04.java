package _03_IfStatement_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("""
                IT alanini bilginizi yazınız
                qa ==> Quality Analyst
                dev ==> Developerba ==> Busines Analyst
                pm ==> Project Manager""");

        String str = scan.next().toLowerCase();

        switch (str) {
            case "qa" -> System.out.println("Quality Analyst");
            case "dev" -> System.out.println("Developer");
            case "pm" -> System.out.println("Project Manager");
            default -> System.out.println("geçerli değer giriniz");
        }
        scan.close();
    }

}
