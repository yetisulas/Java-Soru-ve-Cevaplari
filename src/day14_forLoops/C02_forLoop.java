package day14_forLoops;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {


        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen baslangic degeri icin pozitif bir sayi giriniz");
        int baslangic=scanner.nextInt();

        System.out.println("lutfen bitis degeri icin pozitif bir sayi giriniz");
        int bitis=scanner.nextInt();

        if (bitis<baslangic){

            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");

              }else{

            int toplam=0;

            for (int i = baslangic; i <= bitis ; i++) {

                toplam += i;
            }

                System.out.println("sinirlar arasindaki tam sayilarin degeri :" + toplam);

            }
        }




    }

