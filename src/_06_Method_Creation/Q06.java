package _06_Method_Creation;

public class Q06 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {

        String metin = "aabbccccecddddaaa";
        aynikarakterbirkezyazdir(metin);
    }

    public static void aynikarakterbirkezyazdir(String str) {
        String yenimetin = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                yenimetin = str.substring(i, i + 1);
            } else {
                if (yenimetin.contains(str.substring(i, i + 1))) {

                } else yenimetin += str.substring(i, i + 1);
            }
        }
        System.out.println(yenimetin);

    }


}
