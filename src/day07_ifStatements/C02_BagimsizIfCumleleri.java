package day07_ifStatements;

public class C02_BagimsizIfCumleleri {

    public static void main(String[] args) {
     /*
     Dikkat Edilecekler
     1- Eger boolean sarttan sonra {} kullanilmazsa
     Java if body'si olarak ilk ; 'e kadar olan yeri alir
     digerleri if body'sinin disinda kalir
     2- If cumlesinde {} kullanmaz ve boolean sartin sonuna ; yazarsaniz
     if cumlesi hic bir islem yapmaz cunku body'si yoktur
     OZETLE If body'si tek satirdan olusuyorsa {} kullanmasanizda olur
     ancak if body'si birden fazla satirdan olusuyorsa MUTLAKA If kullanmalisiniz

      */
        int a = 35;
        int b = 30;

        if (a<b){

            System.out.println("a b den kucuk 1");
            System.out.println("a b den kucuk 2");
            System.out.println("a b den kucuk 3");
        }

         if (a % 2 == 0)

             System.out.println("a 2 ile tam bolunuyor 1");//ilk ; e kadar olan kisim if body'sidir
             System.out.println("a 2 ile tam bolunuyor 2");//sonraki satirlarin if ile alakasi yoktur
             System.out.println("a 2 ile tam bolunuyor 3");
    }
}
