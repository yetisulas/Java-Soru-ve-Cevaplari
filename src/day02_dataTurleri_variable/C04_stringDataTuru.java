package day02_dataTurleri_variable;

public class C04_stringDataTuru {

    public static void main(String[] args) {


        int sayi = 20;

        System.out.println(sayi);//20

        String isim = "Berk Yilmaz";

        System.out.println(isim.toUpperCase()); // BERK YILMAZ

        System.out.println(isim.toLowerCase()); //berk yilmaz

        System.out.println(isim);

        String str1 = " Java";
        String str2 = "Candir";
        System.out.println(str1 + str2);

        // iki tane String + isareti ile toplanmaya calisilir ise

        // Java o iki String'i birlestirir
        //JavaCandir

        String str3 = "30";
        String str4 = "40";


        //verilen isim ve soy ismi
        //Girilen ali uzunkavak database'e kaydedildi
        //seklinde yazdirin

        String adi = "Ramazan";
        String soyadi = "Tatar";

        System.out.println("Girilen "+ adi + " " + soyadi +" " + "database'e kaydedildi");

       //" " arasindaki bosluklar konsola yazdirilan metne yansir
       // ancak kodlar arasinda birakilan bosluklar metne yansimaz

    }
}