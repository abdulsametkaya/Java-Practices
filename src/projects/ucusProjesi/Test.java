package projects.ucusProjesi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("GIDECEGINIZ SEHRI YAZINIZ");
        String gidilenSehir = scan.next();

        while (!(gidilenSehir.equalsIgnoreCase("b")) && !(gidilenSehir.equalsIgnoreCase("c"))) {
                System.out.println("HATALI SEHIR SECTINIZ LUTFEN TEKRAR DENEYINIZ");
                gidilenSehir = scan.next();
        }

        System.out.println("KAC YASINDASINIZ");
        int yas = scan.nextInt();

        System.out.println("GIDIS DONUS MU? E/H");
        String isGidisDonus = scan.next();

        boolean gidisDonus = isGidisDonus.equalsIgnoreCase("e");

        if (gidilenSehir.equalsIgnoreCase("b")) {
            Ucus yolcu1 = new BSehri(gidisDonus, yas);
            System.out.println(yolcu1.toplamFiyat());
        } else if (gidilenSehir.equalsIgnoreCase("c")) {
            Ucus yolcu1 = new CSehri(gidisDonus, yas);
            System.out.println(yolcu1.toplamFiyat());
        }


    }
}
