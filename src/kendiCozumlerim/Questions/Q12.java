package kendiCozumlerim.Questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

        File file = new File("/Users/abdulsametkaya/Desktop/deneme.txt");

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
