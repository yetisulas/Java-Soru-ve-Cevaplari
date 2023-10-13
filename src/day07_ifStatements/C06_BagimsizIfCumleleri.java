package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri {

    public static void main(String[] args) {
        //kullanicidan pozitif bir tam sayi isteyin
        //sayi 3 veye 5 ile bolunebilyorsa "Guzel Sayi" yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        if(girilenSayi % 3 ==0 || girilenSayi % 5 ==0) System.out.println("Guzel Sayi");

    }
}
