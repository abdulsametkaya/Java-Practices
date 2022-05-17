package projects.P06_KahveMakinesi.Kahve_makinesi03;

import projects.P06_KahveMakinesi.Kahve_makinesi02.KahveCesitleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveMakinesi {
    Scanner scan = new Scanner(System.in);
    List<KahveCesitleri> kahveList = new ArrayList<>();

    public void kahveAdd() {
        KahveCesitleri kahve1 = new KahveCesitleri("Turk Kahvesi", "1");
        KahveCesitleri kahve2 = new KahveCesitleri("Filtre Kahve", "2");
        KahveCesitleri kahve3 = new KahveCesitleri("Espresso", "3");
        kahveList.add(kahve1);
        kahveList.add(kahve2);
        kahveList.add(kahve3);
    }

    public void girisEkrani() throws InterruptedException {
        kahveAdd();
        boolean bl;
      do {
          System.out.println("------------------ Starbucks'a Hosgeldiniz ------------------");
          for (KahveCesitleri kahveCesitleri : kahveList) {
              System.out.println(kahveCesitleri.getKahveNumber() + "\t" + kahveCesitleri.getKahveName());
          }
          System.out.println("Lutfen listeden istediğiniz kahveyi numarasına gore seciniz");
          int kahveSecim = scan.nextInt();
          scan.nextLine();

          switch (kahveSecim) {
              case 1:
              case 3:
              case 2:
                  System.out.println(kahveList.get(kahveSecim-1).getKahveName() + " Hazirlaniyor");
                  bl = true;
                  break;
              default:
                  System.out.println("Hatali secim yaptiniz. Secim ekranina yonlendiriliyorsunuz");
                  Thread.sleep(2000);
                  bl = false;
          }
      }while(!bl);
        Thread.sleep(2000);

    }


}
