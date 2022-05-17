package _10_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
        ArrayList<String> list2 = new ArrayList<>();

        String str = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j != i) {
                    str += list.get(0) + "+";
                } else {
                    str += list.get(0);
                }
                list.remove(0);
            }
            list2.add(str);
            str = "";
        }
        System.out.println(list2);

    }

}

