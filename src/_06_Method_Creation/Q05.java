package _06_Method_Creation;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        String str = "The quick brown fox jumps over the lazy dog. ha ha ha ha";
        kelimeSayaci(str);

    }

    private static void kelimeSayaci(String str) {
        int temp = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == ' '){
                temp++;
            }
        }
        System.out.println(temp);
    }
}
