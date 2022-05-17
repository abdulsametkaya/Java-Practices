package _09_Arrays;

import java.util.Arrays;

public class Q15 {

    public static void main(String[] args) {
		/*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
        int[] arr = {2, 6, 4, 8, 2, 6, 2};

       if (arr[arr.length - 1] == arr[0]){
           System.out.println("ilk ve son eleman eşit");
       }

        int[][] arr2 = {{2, 6, 4, 8, 2, 6, 2},{1,2}};
        System.out.println(Arrays.deepToString(arr2));
    }


}
