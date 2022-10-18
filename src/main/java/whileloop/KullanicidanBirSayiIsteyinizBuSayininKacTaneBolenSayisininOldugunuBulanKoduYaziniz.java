package whileloop;

import java.util.Scanner;

public class KullanicidanBirSayiIsteyinizBuSayininKacTaneBolenSayisininOldugunuBulanKoduYaziniz {
    public static void main(String[] args) {

        /*
            Kullanicidan bir sayi isteyiniz. Bu sayinin kaç tane bolen sayisinin oldugunu bulan kodu yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli sayi giriniz : ");
        int sayi = scan.nextInt();

        int bolen = 1;
        int sayac = 0;

        while (bolen<=sayi){

            if(sayi % bolen == 0){
                System.out.print(bolen + " " );
                sayac++;
            }

            bolen++;

        }
        System.out.println();
        System.out.println(sayi + " sayisini bolen" + " " + sayac + " adet sayi vardir.");

    }
}
