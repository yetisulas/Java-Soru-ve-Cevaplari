package day08_IfElseIfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {

    public static void main(String[] args) {

        // Kullaicidan bir tam sayi isteyin
        //sayi 3'e bolunuyorsa 3'un kati
        //sayi 5'e bolunuyorsa 5'in kati
        //sayi hem 3'e hemde 5'e bolunuyorsa super sayi
        //sayi ikisinide bolunmuyorsa yaramaz sayi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        if(girilenSayi % 3 == 0 && girilenSayi % 5 == 0) System.out.println("super sayi");
        else if(girilenSayi % 5 == 0) System.out.println("besın kati");
        else if(girilenSayi % 3 == 0) System.out.println("ucun kati");
        else System.out.println("yaramaz sayi");


    }
}
