package whileloop;

public class SizeVerilenBirTamSayininRakamlariToplaminiEkranaYazdiranKoduYaziniz {
    public static void main(String[] args) {

        //Example 4: Size verilen bir tam sayinin rakamlari toplamini ekrana yazdiran kodu yaziniz.

        int i =385;

        int sum = 0;

        while (i>0) {

            sum = sum + i%10;

            i = i/10;

        }
        System.out.println(sum);

    }
}
