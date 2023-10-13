package day04_dataCasting_wrapperClass;

public class C01_DataCasting {

    public static void main(String[] args) {

        /*
        char;boolean ve string i diger data turlerine cast edemeyiz
        sayisal data iceren primitive data turlerini
        birbirine cast edebiliriz

        1- daha kucuk data turundeki degeri daha genis data turundeki variable atama yaparsak
        Java Auto Widening (otomatik) olarak bu islemi yapar
        2- daha genis kamsamli data turundeki degeri daha dar kapsamli variable a atama yaparsak
        Java bunu otomatik olarak yapmaz
        biz sorumlulugu uzerimize alarak bu casting i yaptirabliriz
        sorumlulugu almak icin
        degerin onune bir parantez acarak
        cast etmek istedigimiz data turunu yazabiliriz

        daralma yapildiginda (Explicit Narrowing) yapildiginda
        data kayiplari olabilecegi gibi
        data baskalasabilir de

         */

        String str = "Java Candir";

        //int sayi1 = str ;
        //char chr1 = str ;
        //boolean bl1 = str;

        String s1 = str;

        //boolean bl2 = 10;
        //boolean bl2 ='s';

        int sayi2 = 'k';
        double dbl1 = sayi2;

        int sayi3 = 10 ;
        double dbl2 =4.5;
        short sh1 = 3;
        byte by1 = 7;


        sayi3 = (int)dbl2 ;
        sayi3 = sh1;
        sayi3 = by1;

         dbl2  = sayi3;
         dbl2 =sh1;
         dbl2 = by1 ;

         by1 =(byte) dbl2;
         by1 = (byte)sh1;
         by1 = (byte)sayi3;

         sh1 =(short) dbl2;
          sh1= (short) sayi3;
           sh1 = by1;


    }
}
