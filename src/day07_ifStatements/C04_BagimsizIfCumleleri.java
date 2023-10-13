package day07_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        //Kullanicidan bir tam sayi alin ,sayi 3 ile bolunuyorsa "uc ile bolunebilen sayi"
        //5 ile bolunebiliyorsa "bes ile bolunebilen sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        if(girilenSayi % 3 ==0 ){
            System.out.println("uc ile bolunebilen sayi");
        }

        if(girilenSayi % 5 ==0){

            System.out.println("Bes ile bolunebilen sayi");
        }
    }
}
