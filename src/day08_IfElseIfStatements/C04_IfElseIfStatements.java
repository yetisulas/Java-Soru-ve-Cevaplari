package day08_IfElseIfStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {

    public static void main(String[] args) {

        // Kullaicidan bir tam sayi isteyin
        //sayi 3'e bolunuyorsa 3'un kati
        //sayi 5'e bolunuyorsa 5'in kati
        //sayi hem 3'e hemde 5'e bolunuyorsa super sayi yazirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scanner.nextInt();

        if (sayi % 3 ==0 && sayi % 5 == 0){

            System.out.println("super sayi");

        }else if(sayi % 3 == 0){
            System.out.println("3'un kati");
        }else if (sayi % 5 == 0){
            System.out.println("5'in kati");
        }
    }
}
