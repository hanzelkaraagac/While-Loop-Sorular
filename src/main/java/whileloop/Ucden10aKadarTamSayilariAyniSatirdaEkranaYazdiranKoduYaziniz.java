package whileloop;

public class Ucden10aKadarTamSayilariAyniSatirdaEkranaYazdiranKoduYaziniz {
    public static void main(String[] args) {

        //Example 1: 3'den 10'a kadar tam sayilari ayni satirda ekrana yazdiran kodu yaziniz.

        //1.yol
        for (int h = 3; h <11 ; h++) {
            System.out.print(h + " ");
        }

        System.out.println();
        //2.yol

        int i = 3;

        while (i<11) {

            System.out.print(i + " ");

            i++;

        }

        System.out.println();

        //Example 1: 10'dan 3'a kadar tam sayilari ayni satirda ekrana yazdiran kodu yaziniz.

        int c = 10;

        while (c >2) {

            System.out.print(c + " ");

            c--;
        }
        System.out.println();

        //Example 2: 17'den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz.

        int a = 17;

        while (a>3) {

            System.out.print(a + " ");

            a--;
        }
    }
}
