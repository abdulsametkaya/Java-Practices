package projects.Projects_01;

import java.util.Scanner;

public class perfectSquare {


    /*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        Note: Do not use any built-in library function such as sqrt.

        Example 1:
        Input: 16
        Output: true
        Note: this number is perfect square because 4*4 is 16

        Example 2:
        Input: 25
        Output: true
        Note: this number is perfect square because 5*5 is 25


        Example 3:
        Input: 14
        Output: false

     */

    /*
    Pozitif bir int  num verildiğinde, return edildiği zaman num tamkare ise true veren değilse false veren bir foksiyon yazın.

 Not: sqrt gibi MATH class method  kullanmayın.

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

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir tam sayi giriniz : ");
        int input = scanner.nextInt();

        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

        boolean bl = square(input);
        System.out.println(bl);

        scanner.close();
    }

    private static boolean square(int input) {
        boolean bl = false;

        for (int i = 0; i < input; i++) {
            if (i * i == input) {
                bl = true;
                break;
            }
        }
        return bl;
    }

}
