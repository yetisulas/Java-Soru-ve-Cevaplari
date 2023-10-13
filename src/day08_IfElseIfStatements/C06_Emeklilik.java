package day08_IfElseIfStatements;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {

        //kullanicidan cinsiyetini ve yasini alin,
        // kadin 60 yas ve uzeri ,erkek 65 yas ve uzeri "emekli olabilirsin
        //veya "emekli olmak icin .....yil daha calisman gerekir"yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen  cinsiyetinizi giriniz E: Erkek K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        if(cinsiyet =='E' && yas>=65 ){
            System.out.println("Erkek emekli olabilir");

        }else if (cinsiyet =='E' && yas<= 65){
            System.out.println("Erkek emekli olamaz " + (65-yas)+" yil kadar daha calisman gerekir");

        }else if (cinsiyet == 'K' && yas>=60 ){
            System.out.println("Kadin emekli olabilir");

        }else if(cinsiyet == 'k'&& yas<=60){
            System.out.println("Kadin emekli olamaz "+ (60-yas)+ "  yil daha calisman gerekir");
        }
    }
}
