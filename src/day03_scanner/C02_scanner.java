package day03_scanner;

import java.util.Scanner;

public class C02_scanner {

    public static void main(String[] args) {
     //kullanicidan bir tam sayi alip karesini yazdirin

        //Scanner ile kullanicidan bilgiyi 3 adimda alabiliriz
        //1.adim: scanner objesi olusturmak

        Scanner scaner = new Scanner(System.in);

        //2.adim: kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen bir tamsayi giriniz");

        //3.adim :istediginiz datanin turune uygun bir variable olusturun
        // ve scanner objesini kullanarak uygun methotla
        //kullanicinin girdigi degeri alin

        int girilenSayi = scaner.nextInt();

        //artik kullanicinin girdigi sayi kod ortamimiza kaydedildi
        //bu variablei istediginiz sekilde kullanabiliriz

        System.out.println("Girilen sayinin karesi:" + girilenSayi*girilenSayi);

    }
}
