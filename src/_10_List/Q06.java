package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        List<Integer> list2 = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j<list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }

            }
            if (count<1){
                list2.add(list.get(i));
            }
            count = 0;
        }
        System.out.println(list2);


    }

}
