package projects.P08_HastaneOtomasyon;
public class HastaneRunner {
    private static Hastane hastane = new Hastane();

    public static void main(String[] args) {
        
        String hastaDurumu = "Migren";
        String unvan  = doktorUnvan(hastaDurumu); //kardiyolog
        
        hastane.setDoktor(doktorBul(unvan));
        
        System.out.println("Doktor ismi: "+hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: "+hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: "+hastane.getDoktor().getUnvan());


        hastane.setHasta(hastaBul(hastaDurumu));

        System.out.println("Hasta id: "+hastane.getHasta().getHastaID());
        System.out.println("Hasta ismi: "+hastane.getHasta().getIsim());
        System.out.println("Hasta soy isim: "+hastane.getHasta().getSoyIsim());

        System.out.println("Hastanın rahatsızlığı: " + hastaDurumuBul(hastaDurumu).getActuelDurum());

        if (hastaDurumuBul(hastaDurumu).isAciliyet()){
            System.out.println("hastanın durumu acil");
        }else System.out.println("hastanın durumunun aciliyeti bulunmuyor");


    }
    
    
    public static String doktorUnvan(String aktuelDurum) {

        if(aktuelDurum.equals("Allerji")) {
            return hastane.unvanlar[0];
        }else if(aktuelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];
        }else if(aktuelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];
        }else if(aktuelDurum.equals("Soguk alginligi")) {
            return hastane.unvanlar[3];
        }else if(aktuelDurum.equals("Migren")) {
            return hastane.unvanlar[4];
        }else if (aktuelDurum.equals("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }

        return "yanlis durum";

    }
    public static Doktor doktorBul(String unvan){ 
        
        Doktor doktor = new Doktor();
        
        for(int i = 0; i < hastane.unvanlar.length; i++ ){
            
            if(unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }

        }
        return doktor;
        
    }

    public static Durum hastaDurumuBul(String aktuelDurum){

        Durum hastaDurumu= new Durum();
        hastaDurumu.setActuelDurum(aktuelDurum);

        switch(aktuelDurum){
            case "Allerji":
            case "Bas agrisi":
            case "Diabet":
            case "Soguk alginligi":
                hastaDurumu.setAciliyet(false);
                break;
            case "Migren":
            case "Kalp hastaliklari":
                hastaDurumu.setAciliyet(true);
                break;
            default:
                System.out.println("Gecerli bir durum degil");
        }
        return hastaDurumu;

    }

    public static Hasta hastaBul(String actualCase){

        Hasta hasta= new Hasta();

        for(int i = 0; i < hastane.hastaIDleri.length; i++ ){

            if(actualCase.equals(hastane.durumlar[i])) {
                hasta.setHastaID(hastane.hastaIDleri[i]);
                hasta.setIsim(hastane.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
                hasta.setHastaDurumu(hastaDurumuBul(actualCase));
            }

        }

        return hasta;
    }

}
