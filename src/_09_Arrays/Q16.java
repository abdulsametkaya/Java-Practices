package _09_Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        int sum =sumOfDigits(str);
        System.out.println(sum);

        // arraysiz çözüm
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam += Integer.parseInt(str.substring(i,i+1));
            }
        }
        System.out.println(toplam);


    }

    private static int sumOfDigits(String str) {
        int sum = 0;
        str = str.replaceAll("\\D","");
        String[] arr = str.split("");
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }




}

