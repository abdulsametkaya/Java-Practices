package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;
        list.add(2);
        for (int i = 3; i<100;i++){
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    count++;
                }
            }
            if (count ==0){
                list.add(i);
            }
            count = 0;
        }

        System.out.println(list);

    }
}
