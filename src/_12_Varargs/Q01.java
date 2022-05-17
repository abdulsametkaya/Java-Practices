package _12_Varargs;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

       stringConcat("m","e","r","v","e");

       intConcat(1,2,3,4,5);


    }

    private static void intConcat(int... a) {
        int concat = 0;
        for (int i : a) {
            concat += i;
        }
        System.out.println(concat);
    }

    public static void stringConcat(String... str){
        String str2 = "";
        for (String each : str){
            str2 += each;
        }

        System.out.println(str2);
    }



}

