package whileloop;

public class KullanicidanIkiTamsayiAlipBuSayilariVeAralarindakiTümTamsayilariYazdiranBirKodOlusturun {
    public static void main(String[] args) {

          /*
        Kullanicidan iki tamsayi alip ve bu sayilari ve aralarindaki tüm tamsayilari yazdiran bir kod olusturun.
         */

        //1.yol
        int baslangic = 40;
        int bitis = 60;
        // 40       // 60
        for (int i = baslangic; i <= bitis; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2.yol
        int i=baslangic;

        while (i<=bitis) {
            System.out.print(i + " ");
            i++;

        }
    }
}