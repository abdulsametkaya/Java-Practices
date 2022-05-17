package _10_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.
        */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,12,17,19,20));
        ArrayList<Integer> tekSayi = tekSayiList(list);
        System.out.println(tekSayi);

    }

    private static ArrayList<Integer> tekSayiList(ArrayList<Integer> list) {
        ArrayList<Integer> tekSayiList = new ArrayList<>();
        for (int i = 0;i<list.size(); i++){
            if (list.get(i)%2 !=0){
                tekSayiList.add(list.get(i));
            }
        }
        return tekSayiList;
    }


}
