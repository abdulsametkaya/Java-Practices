package _08_While_DoWhile;

public class Q11 {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {

        int num = 15;
        /*for (int i = 0; i < num; i++) {
            if (i * i == num) {
                System.out.println("bu sayı tam kare cunku " + i + " * " + i + " = " + num);
            }
        }*/
        boolean bl = false;
        int i = 1;
        while (i <= num) {
            if (i * i == num) {
                bl = true;
                break;
            }
            i++;
        }

        if (bl) {
            System.out.println("bu sayı tam kare cunku " + i + " * " + i + " = " + num);
        } else System.out.println("tam kare değil");


    }
}
