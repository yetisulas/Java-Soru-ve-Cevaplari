package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //dikdortgenin alanini yazdiriniz

        Scanner scaner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin iki kenarini giriniz");

        double kenar1 = scaner.nextDouble();
        double kenar2 = scaner.nextDouble();

        System.out.println("dikdortgenin alani :" + kenar2*kenar1);
    }
}
