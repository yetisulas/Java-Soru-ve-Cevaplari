package day08_IfElseIfStatements;

import java.util.Scanner;

public class C03_IfElseIfStatement {

    public static void main(String[] args) {
        // kullanicidan bir not girmesini isteyin ve harf olarak basari notunu yazdirin
        // ogrencinin notu 85 ve ustu ise AA
        //(85 ve ustu degilse)65 ve ustu ise BB;
        //(65 ve ustu degilse)50 ve ustu ise CC;
        //Griye kalanlar DD;

          /*
        bir if -else if - else.....statements else ile bitmek zorunda degildir
        else ile biten kodlar her durum icin mutlaka bir sonuc veririrler
        else ile bitmezse tum durumlari kapsamaz
        yani bazi degerler icin sonuc uretmeyebilir
            */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if(not >= 85){

            System.out.println("AA");
        }else if (not >= 65){

            System.out.println("BB");

        }else if ( not >= 50){

            System.out.println("CC");

        }else{
            System.out.println("DD");
        }










     }
}
