package whileloop;

public class OnIkiden67eKadarSayilarinToplaminiVerenKoduYaziniz {
    public static void main(String[] args) {

        //Example 3: 12 den 67 e kadar sayilarin toplamini veren kodu yaziniz.

        int i =12;

        int toplam =0;

        while (i<68) {

            toplam = toplam + i;

            i++;
 //           System.out.println(toplam);// eger icine yazarsaniz nasil o sonucu aldigini gorursunuz.
                                       // eger direk sonucu almak isterseniz disina yaziniz.
        }
        System.out.print(toplam);//2212

    }
}
