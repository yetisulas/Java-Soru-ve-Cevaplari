package day05_matematikselIsllemler_increment;

public class C04_Preincrement_Postincrement {

    public static void main(String[] args) {

        //Javada bir onceki class'da yaptigimiz gibi
        //artirma ve atama ,artirma ve yazdirma beraber olabilir

        int a = 20 ;

        int b = 10 ;

        System.out.println(b = 2* a);

        System.out.println(a = b-5 );

        a = 10 ;

        //once a'nin degerini b'ye atayain ,sonrada a'yi artirin

        b = a++;

        System.out.println("a :"+ a +"b :"+ b);
        b = ++a;
        System.out.println("a :"+ a +"b :"+ b);

        /*

        Bu kullanim sadece a++ a--a icin gecerlidir
        burada ++ veya --'yi mi yoksa sonra mi kullanacagimiza
        bizden istenen duruma gore karar veririz

        artirma once ise ++a
        artirma sonra ise a++

         */
      a = 20;
        System.out.println(a++);

        System.out.println(a);

        a = 20 ;

        System.out.println(--a);

        System.out.println(a);
    }
}
