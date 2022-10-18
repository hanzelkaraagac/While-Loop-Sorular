package whileloop;

import java.util.Scanner;

public class KullanicidanAldiginizBirSayininCarpimTablosunuEkranaYazdiriniz {
    public static void main(String[] args) {

        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz.
        //           3 ==> 3x1=3  3x2=6   3x3=9           3x10=30


        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int carpimTablosu = input.nextInt();

        int i =1;

        while (i<11) {

            System.out.println(carpimTablosu + " x " + i + " = " + carpimTablosu*i);

            i++;
        }

    }
}
