package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C01_Emeklilik2inciCozum {

    public static void main(String[] args) {
        //kullanicidan cinsiyetini ve yasini alin,
        // kadin 60 yas ve uzeri ,erkek 65 yas ve uzeri "emekli olabilirsin
        //cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        //veya "emekli olmak icin .....yil daha calisman gerekir"yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen  cinsiyetinizi giriniz E: Erkek K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        if (yas<10 || yas >80){
            System.out.println("Gecersiz yas");
        } else if (yas < 60) { // kimse emekli olamaz
            if (cinsiyet == 'K'){
                System.out.println("Kadin emekli olabilmek icin daha " + (60-yas) + " yil daha calismali");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek icin daha " + (65-yas) + " yil daha calismali");

            }else {
                System.out.println("cinsiyet hatali");
            }

        } else if (yas<65) { // sadece kadinlar emekli olabilir

            if (cinsiyet == 'K'){
                System.out.println("Kadin emekli olabilir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek icin daha " + (65-yas) + " yil daha calismali");
            }else {
                System.out.println("cinsiyet hatali");
            }

        }else{ // herkes emekli olabilir
            if (cinsiyet == 'K' || cinsiyet == 'E'){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("cinsiyet hatali");
            }

        }


    }
}