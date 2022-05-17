package _07_ForLoop;

public class Q03 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */
        String str = "Bugün hava oldukca güzel";
       /* int sayac = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') {
                sayac++;
            }

        }
        System.out.println(sayac);*/

        int i = 0;
        int sayac = 0;

        while (str.charAt(i) != 'c') {

            if (str.charAt(i) == 'a') {
                sayac++;
            }
            i++;
        }
        System.out.println(sayac);



    }
}
