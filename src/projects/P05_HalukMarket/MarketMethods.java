package projects.P05_HalukMarket;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MarketMethods {

    Scanner scan = new Scanner(System.in);
    private double domates = 2.1;
    private double patates = 3.2;
    private double biber = 1.5;
    private double sogan = 2.3;
    private double havuc = 3.1;
    private double elma = 1.2;
    private double muz = 1.9;
    private double cilek = 6.1;
    private double uzum = 2.7;
    private double limon = 0.5;
    private double kavun = 4.3;
    double toplam = 0;

    public void urunList() {

        System.out.println("\t\t\t\t\tNo \t   Ürün \t\t  Fiyat\n" +
                "\t\t\t\t   ====\t =======\t \t=========\n" +
                "\t\t\t\t\t0\t Domates   \t \t 2.10 TL\n" +
                "\t\t\t\t\t1\t Patates   \t \t 3.20 TL\n" +
                "\t\t\t\t\t2\t Biber     \t \t 1.50 TL\n" +
                "\t\t\t\t\t3\t Soğan      \t 2.30 TL\n" +
                "\t\t\t\t\t4\t Havuç     \t   \t 3.10 TL\n" +
                "\t\t\t\t\t5\t Elma      \t   \t 1.20 TL\n" +
                "\t\t\t\t\t6\t Muz     \t \t 1.90 TL\n" +
                "\t\t\t\t\t7\t Çilek \t \t\t 6.10 TL\n" +
                "\t\t\t\t\t8\t Kavun      \t 4.30 TL\n" +
                "\t\t\t\t\t9\t Üzüm      \t \t 2.70 TL\n" +
                "\t\t\t\t\t10\t Limon     \t \t 0.50 TL");

        System.out.println("LUTFEN URUN KODUNU YAZARAK URUNU SECIN");
        int urun = scan.nextInt();
        System.out.println("KAC KILOGRAM ISTERSINIZ");
        double kilogram = scan.nextDouble();


        switch (urun) {
            case 0:
                toplam += (domates * kilogram);
                break;
            case 1:
                toplam += (patates * kilogram);
                break;
            case 2:
                toplam += (biber * kilogram);
                break;
            case 3:
                toplam += (sogan * kilogram);
                break;
            case 4:
                toplam += (havuc * kilogram);
                break;
            case 5:
                toplam += (elma * kilogram);
                break;
            case 6:
                toplam += (muz * kilogram);
                break;
            case 7:
                toplam += (cilek * kilogram);
                break;
            case 8:
                toplam += (kavun * kilogram);
                break;
            case 9:
                toplam += (uzum * kilogram);
                break;
            case 10:
                toplam += (limon * kilogram);
                break;
            default:
                System.out.println("GECERLI SECIM YAPINIZ");
        }


        System.out.println("YENI URUN EKLEMEK ISTER MISINIZ E/H");
        scan.nextLine();
        String cevap = scan.nextLine();

        if (cevap.equalsIgnoreCase("e")) {
            urunList();
        } else {
            odeme(toplam);
        }


    }

    public void odeme(double toplam) {
        LocalDateTime dt = LocalDateTime.now();

        System.out.println("----------------FATURA----------------");
        System.out.println(dt);
        System.out.println("ODEMENIZ GEREKEN TOPLAM UCRET = " + toplam + " TL");

    }


}
