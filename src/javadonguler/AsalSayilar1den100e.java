package javadonguler;

public class AsalSayilar1den100e {
    public static void main(String[] args) {

        // asal sayi 1'e ve kendisine bolunebilen sayilardir.

        // 2'den başlayarak her sayıyı kontrol eder.
        for (int i = 2; i <= 100; i++){
            int sayac = 0 ;
            // 2'den başlayarak o sayıya kadar olan sayılarla bölen sayısını kontrol eder.
            for (int j = 2; j <=100; j++){
                if (i%j == 0){
                    sayac++;
                }
            }
            // Bölen sayısı 2 ise asaldır ve ekrana yazdırılır.
            if (sayac == 1){
                System.out.print(i + " asaldir");
            }

        }
    }
}
