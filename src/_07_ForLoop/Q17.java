package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        int num = 6;

        for (int i = 1; i<=num; i++){
            for (int j = 1 ; j<=num; j++){
                if (j>=i){
                    System.out.print(j + " ");
                }else System.out.print(" ");
            }
            System.out.println(" ");
        }


    }
}


