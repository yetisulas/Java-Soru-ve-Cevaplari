package day07_ifStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
        Bagimsiz if cumleleri isminden de anlasilacagi uzere kodun kalani ile
        ilgilenmez sadece boolean sarta odaklanir sartin sonucu true ise if body'si
        calisir boolean sonucu false ise if body'si devreye girmez

        YANII birden fazla bagimsiz if cumlesi olan bir kod calistiginda kac tane
        if body'sinin calisacagi verilen degerlere baglidir
        tum if body'leri calisabilir,bazilari calisabilir ya da hicbiri calismayabilir
         */
        int a =-201 ;
        int b = 104 ;

         if (a>0){ // false
             System.out.println("a sayisi pozitif");
         }

         if (a+b>100){ // false

             System.out.println("sayilarin toplami 100'den buyuk");
             }

         if (b % 3 == 0){

             System.out.println("b 3 ile tam bolunen bir tam sayidir");
         }

         if (b<100){
             System.out.println("b 100 den kucuk bir tam sayidir");
         }
         }
    }

