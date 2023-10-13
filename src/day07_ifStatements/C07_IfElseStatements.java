package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {
        //kullanicidan notunu isteyin 50 ve uzeri ise sinifi gectin
        //degilse malesef kaldin yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if(not>=50 ) System.out.println("Sinifi gectin");
        if (not< 50) System.out.println("Malesef kaldin");

        /*
        Eger bir sart icin sadece 2 durum soz konusu ise
        iki durumu ayri ayri kontrol etmek yerine
        tek bir kontrol ile de yapabiliriz
        bagimsiz if cumlelerinde ya if body'si ya else body'si calisir
        IKISININ BIRDEN calismasi mumkun olmadigi gibi
        IKISININDE CALISMAMASI mumkun degildir

        */


     if(not>=50){
         System.out.println("Sinifi gectin");
     }else{

         System.out.println("Malesef kaldin");
     }
    }
}
