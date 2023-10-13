package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {

    public static void main(String[] args) {

        /*
        char data turu ozel bir data turudur
        her ne kadar char data turu

       '' icerisinde sayi,harf,ozel karakter alsada ascii tablosundaki sayi
       degerlerini kullanabilir
       ayni sekilde char data turundeki bir variable i matematksel
       islemde kullanirsaniz o zaman ascii tablosundaki degeri ile
       isleme girer

         */

        char ch1 = 'A';

        int sayi1 = ch1;

        System.out.println("ch1 :" + ch1);
        System.out.println("sayi1 :" + sayi1);

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";
        System.out.println(str1+str2+str3);

        char ch2 = 'a';
        char ch3='b';
        System.out.println(ch2+ch3);

        // verilen bir sayinin ascii tablosundaki char karsiligini yazdirin

        int karakter = 97 ;
        char asciDegeri = (char)karakter;

        System.out.println("Verilen sayinin ascii tablosundaki karsiligi : "+ asciDegeri);


    }
}
