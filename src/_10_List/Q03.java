package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
        System.out.println(kareBulma(list));

    }

    private static int kareBulma(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i) * list.get(i);
        }
        return sum;
    }
}
