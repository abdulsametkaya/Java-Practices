package _07_ForLoop;

public class Q19 {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j + i >= 5+1) {
                    System.out.print("*" + " ");
                } else System.out.print(" ");
            }
            System.out.println(" ");
        }


    }
}

