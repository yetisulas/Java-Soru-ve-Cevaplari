package day08_IfElseIfStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {

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

        /*
        Birden fazla degisken varsa iclerinden birini birincil
        degisken olarak alip sadece ona gore bir if - else if - else
        kuralim
         */

        if(cinsiyet == 'E'){
            if (yas<0 || yas>110){

                System.out.println("gecersiz yas girisi");

            }else if (yas >= 65){

                System.out.println("Emekli olabilir");

            }else{
                System.out.println("emekli olmak icin daha "+ (65-yas) + "yil daha calismalisin");
            }


        }else if (cinsiyet == 'K'){

            if(yas< 18 || yas> 80){

                System.out.println("gecersiz yas girisi");

            }else if (yas > 60){
                System.out.println("kadin emekli olabilir");

            }else {
                System.out.println("emekli olmak icin daha" + (60-yas) + "yil calismalisin");
            }


        }else{

            System.out.println("cinsiyet hatali girildi");
        }

    }
}
