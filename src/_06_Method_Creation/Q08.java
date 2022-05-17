package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
    /*
      TASK :
      Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
      String parametreli return type li reverseWord isminde bir method create ediniz

       Test Data :
      İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
      Output : versin açıklığı zihin arkadaşlara Javacı Allah
       */
    public static void main(String[] args) {
        String str = "Allah Javacı arkadaşlara zihin açıklığı versin";
        tersCevir(str);
    }

    private static void tersCevir(String str) {
        String tersCumle = "";
        int kelimeSayisi = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                kelimeSayisi ++;
            }
        }
        for(int i = 0; i<kelimeSayisi; i++) {
            tersCumle += str.substring(str.lastIndexOf(" "));
            str += str.replace(str.substring(str.lastIndexOf(" ")), "");
        }
        System.out.println(tersCumle);


    }


}
