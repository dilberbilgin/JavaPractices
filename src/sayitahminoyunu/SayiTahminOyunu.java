package sayitahminoyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        // ilk once 1-100 arasinda rastgele bir sayi gelmesi icin random sinifi
        Random rand = new Random();
        int number = rand.nextInt(100);

        // kullanicidan giris almak icin Scanner sinifi
        Scanner input = new Scanner(System.in);

        // gerekli degiskenleri tanimlamak gerekiyor.
        //5 hakki olacak
        //dogru tahmin yaparsa oyunu kazanacak, yapmazsa kaybedecek.

        int right = 0; //kullanicinin kalan haklari
        int selected; // kullanicinin sectigi sayi
        int[] wrong = new int[5]; // kullanicinin hatali tahminleri hak sayisi kadar boyutlu bir dizi
        boolean isWin = false; // Oyunun kazanilip kazanilmadigini kontrol eder
        boolean isWrong = false; // Kullanicinin hatali giris yapip yapmadigini takip eder.

        // sonra tahmin donguleri baslar. dogru tahmin ederse donguden cikacagiz.

        System.out.println("Rastgele cikan sayi: " + number);

        while(right < 5) {
            System.out.print("Lutfen tahmininizi giriniz: ");
            selected = input.nextInt();

            //Tahmin gecersizse
            if (selected < 0 || selected > 99 ){
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz");
                if (isWrong) {
                    right++;
                    System.out.println("Cok fazla hatali giris yaptiniz.Kalan hak" + (5-right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatali giriste hakkinizdan dusulecektir.");
                }
                continue;
            }

            //Dogru Tahmin Kontrolu
            if (selected == number) {
                System.out.println("Tebrikler, dogru tahmin! Tahmin ettiginiz sayi: " + number);
                isWin = true;
                break;
            }else {
                //Yanlis Tahmin Kontrolu
                System.out.println("Hatali bir sayi girdiniz!");
                if (selected > number) {
                    System.out.println(selected + " sayisi gizli sayidan buyuktur");
                } else {
                    System.out.println(selected + " sayisi gizli sayidan kucuktur");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkiniz: " + (5-right));
            }
        }
        if (!isWin) {

            System.out.println("Kaybettiniz!");
        } if (!isWrong) {
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
    }
}
