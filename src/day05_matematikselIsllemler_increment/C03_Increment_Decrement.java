package day05_matematikselIsllemler_increment;

public class C03_Increment_Decrement {

    public static void main(String[] args) {


        int sayi = 10 ;

        //sayi variable'nin degerini 2 katinin 5 fazlasi yapin

        sayi = sayi * 2 + 5;

        System.out.println(sayi);
         //2.yontemle yaparsak
        sayi = 10;
        sayi *= 2;
        sayi += 5;
        System.out.println(sayi);

        sayi = 10 ;

        sayi *= 3;

        sayi -= 3;

        sayi /= 3;

        System.out.println(sayi);

        int a = 10 ;

        //a'nin degerini yeni olusturdugumuz b'ye atayip , sonra a'nin degerini bir artirin
        // a ve b' yi yazdirin

       int b = a;

         a++;

        System.out.println("a : " + a + "b :" + b);


        a = 10 ;

        //a'nin degerini bir artirin sonra a'nin degerini b'ye atayin

        a++;

        b = a ;

        System.out.println("a : " + a + "b :" + b);



    }

    public static class day01_MatematikselIslemler {

        public static void main(String[] args) {
            int a =27;

            int b = 4;
         // Java iki tam sayiyi bolerseniz sonucu tam sayi olarak verir

            System.out.println(a / b);// 27/6 = 6.75 ==> 6

            System.out.println(32 / 5); //32/5 = 6.4 ==> 6

             double c = 27 ;
        // Eger bolunen sayi veya bolen sayidan double olan varsa sonucu double olarak verir

            System.out.println(27 / 4); // 27/4 = 6.75

            // a'yi b'ye bolup sonucu ondalikli olarak yazdirin

            double sonuc1 = a/b ;

            System.out.println("sonuc :"+ sonuc1 );  // 6.0

            double sonuc2 = (double)a/b ;

            System.out.println("sonuc2" + sonuc2); //6.0

            double sonuc3 = (double)a/b ;
            System.out.println("sonuc :" + sonuc3); //6.75

            System.out.println(2567 / 10); // 256.6 ==> 256
            System.out.println(2567 % 10); // 7

            System.out.println(256/10); // 25.6 ==> 25
            System.out.println(256%10); // 6

            System.out.println(25/10); // 2.5 ==> 2
            System.out.println(25%10); // 5

            System.out.println(2/10);  // 0.2 ==> 0
            System.out.println(2%10);  //2




            }

        }
}
