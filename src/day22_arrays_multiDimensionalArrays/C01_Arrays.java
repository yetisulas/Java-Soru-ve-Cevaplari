package day22_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {
        String[] isimler={"Ayse","Yusuf","Bugra","Abdullah","Nergiz","Gulay","Ramazan"};

        //verilen bir araydeki uzunlugu tek sayi olan
        //isimleri yan yana aralarinada bir bosluk birakarak yazdirin
        //en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin

        int sayac=0;
        int kelimeUzunlugu=0;

        for (int i = 0; i < isimler.length; i++) {

            kelimeUzunlugu=isimler[i].length();

            if(kelimeUzunlugu % 2 != 0 ){

                System.out.print(isimler[i] + " ");
                sayac++;
            }

        }

        System.out.println("\nTplam " + sayac + " adet isim yazdirildi");
    }
}
