package _09_Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        String str = "";

        for (int j : arr) {
            sum += j;
        }
        int avarage = sum / arr.length;
        for (int i : arr) {
            if (i > avarage) {
                str += i + " ";
            }
        }
        System.out.println("ortalama = " + avarage);
        System.out.println("ortalamanin üstündeki sayilar = " + str);


    }

}


