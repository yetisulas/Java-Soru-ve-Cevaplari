package day04_dataCasting_wrapperClass;

public class C005_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(3)); //a

        int sayi = 20;

        /*

       Java primitive data turleri icin hazir metod olusturamaz

       ANCAK
       primitive data turleri icin hazir metodlar kullanilabilecek Wrapper class lar olusturmustur

       int ==> Integer
       char ==> Character

       short ==> Short
       double ==> Double

       Wrapper classlar primitive data turleri ile hic promlemsiz atama yapabilir


         */
        int sayi2 = 5;

        Integer sayi3 = sayi2;
        int sayi4 = sayi3;

        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);

        //short sayi5 = (short)sayi3; Wrapper Classlar arasinda casting yapilmaz

        System.out.println(Short.MIN_VALUE);

        // icinde sadece sayisal ifadeler bulunan bir String verildiginde
        // matematiksel islem yapmamiz gerekirse
        // Integer.parseInt() ile int e cevirebiliriz

        String str1 = "22";
        String str2 = "33";
        //bu degerleri toplayip yazdirin

        System.out.println(str1+str2); //2233

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); //55

        char ch1 = '7';

        System.out.println(Character.isDigit(ch1)); //true

        System.out.println(Character.isLetter(ch1)); //false

        System.out.println(Character.isWhitespace(ch1)); //false




    }
}
