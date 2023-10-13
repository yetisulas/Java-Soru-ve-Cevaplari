package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Soru 3-Kullanicidan ismini,soyismini,ve yasini alip,asagidaki formatta yazdirin
        //Isminiz : John
        //Syisminiz: Doe
        //Yasiniz : 44
        //Kaydiniz basariyla alinmistir

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz");

        String girilenIsim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi gininiz");

        String girilenSoyisim = scanner.nextLine();
        System.out.println("Lutfen yasinizi gininiz");

        int girilenYas = scanner.nextInt();

        System.out.println("Isminiz : " +girilenIsim);
        System.out.println("SoyIsminiz :" + girilenSoyisim);
        System.out.println("yasiniz :" +girilenYas);
        System.out.println("Kaydiniz basari ile yapilmistir");

        //sout icerisindeki bir stringin yazdirilmasina
        //alt satirdan devam edilmesini isterseniz
        //String in alt satira gecmesini istediginiz kismina \n yazin

        System.out.println("Isminiz : " +girilenIsim +
                "\nSoyIsminiz :" + girilenSoyisim +
                "\nyasiniz :" +girilenYas +
                "\nKaydiniz basari ile yapilmistir" );

            }
}
