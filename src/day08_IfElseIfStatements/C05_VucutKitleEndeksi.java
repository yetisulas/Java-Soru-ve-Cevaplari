package day08_IfElseIfStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {

    public static void main(String[] args) {

        // kullanicidan kilosunu(kg) ve boyunu(cm)isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy*boy)
        // vucut kitle endeksi 30'dan buyukse obez
        // vucut kitle endeksi 25-30 arasi ise kilolu
        // 20-25 arasi ise normal, 20'den kucukse zayif yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("boyunuzu giriniz");
        double boy= scanner.nextDouble();

        double vke = kilo*10000 /(boy*boy);

        System.out.println(vke);

        if(vke >= 30){
            System.out.println("obez");
        }else if (vke >= 25){
            System.out.println("Kilolu");
        }else if (vke >= 20){
            System.out.println("Normal");

        }else{

            System.out.println("zayifsin");
        }

    }
}
