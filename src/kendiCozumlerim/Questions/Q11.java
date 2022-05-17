package kendiCozumlerim.Questions;

import java.io.*;
import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {


        try {
            PrintWriter pw = new PrintWriter("/Users/abdulsametkaya/Desktop/deneme.txt");

            pw.println("Merhaba Java Nasilsin");

            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("/Users/abdulsametkaya/Desktop/deneme.txt");

        try {
            Scanner scan = new Scanner(file);

            System.out.println(scan.nextLine());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




/*
        int[] arr = new int[4];

        arr[0]=1;
        arr[2]=1;
        arr[3]=2;
        arr[1]=3;

        System.out.println(arr[3]);

        try {
            System.out.println(arr[4]);
        }catch (Exception e) {
            System.out.println(e);

        }
        for (int each:arr){
            System.out.println(each);
        }


*/

    }
}
