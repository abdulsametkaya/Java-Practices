package _16_LinkedList;

import java.util.*;

public class Ex04 {

    public static void main(String[] args) {
		
			/*  TASK:
			 		Node'larin değereleri; "haluk" "ipek" "harun" "irem" olan bir LinkedList olusturun
			 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
			    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
			 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin
			 */

        Queue<String> linkedList = new LinkedList<>();

        linkedList.add("haluk");
        linkedList.add("ipek");
        linkedList.add("harun");
        linkedList.add("irem");

        Scanner scan = new Scanner(System.in);
        System.out.println("name");
        String name = scan.nextLine();

        linkedList.removeIf(name::equalsIgnoreCase);

        System.out.println(linkedList);

    }
}

