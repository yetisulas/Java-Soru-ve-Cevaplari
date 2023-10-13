package day02_dataTurleri_variable;

public class C03_primitiveDataTurleri {

    public static void main(String[] args) {

        //1-boolen : mantiksal  degerler olan true ve false kabul eder
        boolean bl1 = true;
        boolean bl2 = false;

        //char '' icinde yazilir ve sadece 1 karakter kabul eder

        char ch1 = 'a';
        char ch2 = '2';
        char ch3 = '/';
        char ch4 = ' ';

        //tam sayi kabul eden variable turleri
        //3-byte, 4-short ,5- integer, 6- long

        //turkiyede sehir nufuslarini tutmak istiyoruz
        //data turu ayni olan variable'larin degerleri ne olursa olsun
        //hafizda kapladiklari alan aynidir
        int nufus = 2834250;

        int nufusHakkkari = 30000;

        //bir sehirdeki noter sayisini tutacagiz

        short noterSayisi = 456;

        float fl1 = 20f;
        float fl2 = 6f;
        float fl3 = fl1 / fl2;

        System.out.println(fl3);

        double db1 = 20;
        double db2 = 6;
        double db3 = db1 / db2;

        System.out.println(db3);


        String str = "Hello World";

        System.out.println(str);
        System.out.println("str");

        //verilen iki sayiyi carpip sonucu yazdirin

        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println(sayi1 * sayi2);

        System.out.println("Verilen iki sayinin  carpimi :" + sayi1 * sayi2);

    }
}