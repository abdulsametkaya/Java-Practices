package _09_Arrays;

import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
         */
        String str = "Congratulations";
        String[] arr = str.split("");
        int count = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("o") || arr[i].equalsIgnoreCase("a") ||
                    arr[i].equalsIgnoreCase("u")) {
                arr[i] = "i";
            }
            if (arr.length % 2 == 0) {
                arr[i] = arr[count];
                count--;
            } else {
                arr[i] = arr[count];
                count--;
                arr[arr.length - 1] = "C";
            }

        }

        System.out.println(Arrays.toString(arr));


    }

}
