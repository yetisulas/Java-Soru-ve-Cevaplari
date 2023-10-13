package day08_IfElseIfStatements;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        //Sou= Kulanicidan  bir karekter girmesini isteyin
        //girilen karekterin buyuk harf olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");

        char girilenKarakter= scanner.next().charAt(0);
     // kullanici ne kadar uzun kelime veya kelimeler girsede ilk harfi alir


        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z' ){

            System.out.println("Girilen karekter buyuk harf");

        }else{

            System.out.println("Girilen karekter buyuk harf degil");
        }
    }

}





