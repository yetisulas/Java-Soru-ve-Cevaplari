package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {

    public static void main(String[] args) {

        //kullanicidan bir char isteyin
        //girilen char dan sonraki 3 karekteri yazdirin
        // Orn : input : a output : b,c,d

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen ascii tablosundan bir karekter giriniz");

        char girilenKrk = scanner.next().charAt(0);
        // scanner.nextchar() method u olmadigindan
        //once .next() ile String olarak alip, sonra o String in ilk karekterini alalim

        System.out.println("Girilen karekter :" + girilenKrk);
        System.out.println("Girilen kaakterden sonraki 3 karekter :" +
                (char)(girilenKrk+1)+ " ," +
                (char) (girilenKrk+2)+ " ," +
                (char)(girilenKrk+3));

    }
}
