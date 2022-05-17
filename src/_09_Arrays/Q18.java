package _09_Arrays;

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        String str = "Javacilar cook afilli";

        //bizden istenen array'in eleman sayısını bilmemiz gerekiyor. yoksa array i oluşturamayız bunun için
        //sadece uniq harf ve işaretleri bırakan bir kod yazıyoruz. onun sayısı istediğimiz sayıdır.

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str2.contains(str.substring(i, i + 1)))) {
                str2 += str.charAt(i);
            }
        }

        //array i oluşturduk. string içerisinde hangi harfin kaç defa tekrar ettiğini bulmamız lazım
        //charları birbiriyle karşılaştırdıktan sonra da siliyoruz.
        int count = 1;
        int temp = 0;
        int i = 0;
        String[] arr = new String[str2.length()];
        while (!str.isEmpty()) {
            for (int j = 1; j < str.length(); j++) {
                if (str.substring(i, i + 1).equalsIgnoreCase(str.substring(j, j + 1))) {
                    count++;
                }
            }
            arr[temp] = str.charAt(i) + "=" + (count);
            count = 1;
            str = str.replaceAll(str.substring(i, i + 1), "");
            temp++;

        }
        System.out.println(Arrays.toString(arr));
    }
}
    

