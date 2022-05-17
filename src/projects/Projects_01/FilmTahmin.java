package projects.Projects_01;

import java.util.*;

public class FilmTahmin {

    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE",
            "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int devam = 0;
        while (devam == 0) {

            System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");
            System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");

            int tahmin = scan.nextInt();
            scan.nextLine();

            filmTahmin(tahmin);

            System.out.println("OYUN BITTI TEKRAR OYNAMAK ICIN 0'A BITIRMEK ICIN 1'E BASINIZ");
            devam = scan.nextInt();
        }
    }

    private static void filmTahmin(int tahmin) {

        boolean kazanc = false;
        int tahminHakki;
        int tahminSayisi = 0;
        String[] arr = new String[film.get(tahmin - 1).length()];

        Arrays.fill(arr, "_");
        tahminHakki = 2 * (film.get(tahmin - 1).length());

        System.out.println("SECTIGINIZ FILM " + film.get(tahmin - 1).length() + " HARFLI");
        System.out.println("BASLANGICTAKI TAHMIN HAKKINIZ : " + tahminHakki);
        String result;

        while (tahminHakki > 0) {
            System.out.println("SECTIGINIZ FILMIN ADI NEDIR?");
            result = scan.nextLine();

            if (result.equalsIgnoreCase(film.get(tahmin - 1))) {
                System.out.println("DOGRU CEVAP! TEBRİKLER... " + "SECTIGINIZ FILM " + result +
                        "TOPLAM " + ++tahminSayisi + " DEFA TAHMİN SONUCU BULUNDUNUZ");
                kazanc = true;
                break;
            } else {
                tahminHakki--;
                tahminSayisi++;
                System.out.println("BILEMEDINIZ!" + " KALAN TAHMIN HAKKINIZ : " + tahminHakki);

                for (int i = 0; i < result.length(); i++) {
                    if (film.get(tahmin - 1).substring(i, i + 1).equalsIgnoreCase(result.substring(i, i + 1))) {
                        arr[i] = result.toUpperCase().substring(i, i + 1);
                    }
                }
                System.out.println("DOGRU TAHMIN ETTIGINIZ HARFLER SU SEKİLDEDİR" + Arrays.toString(arr));
            }

        }

        if (kazanc) {
            System.out.println("BU ISTE BIR NUMARASIN");
        } else {
            System.out.println("HICBIR TAHMININIZDE DOGRU SONUCA ULASAMADINIZ \nDOGRU CEVAP = " + film.get(tahmin - 1));
        }


    }
}
