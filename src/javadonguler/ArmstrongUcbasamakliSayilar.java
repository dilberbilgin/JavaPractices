package javadonguler;

import java.util.Scanner;

public class ArmstrongUcbasamakliSayilar {
    public static void main(String[] args) {

// Scanner yok 3 basamakli sayilar arasindan bulunacak.

        for (int number = 100; number < 1000; number++) { // 3 basamakli sayilar icin dongu
            int basNumber = 3; // basamak numarasi belli olmasaydi bunu da ayrica bilacaktik sayinin 10 abolumunden kalan dongusu ile
            int tempNumber = number;
            int result = 0;
            int basValue;
            int basPow;

            // sayiyi tempNumbera atayip basamak degerleri ve kuvvetlerini hesapla
            while (tempNumber != 0){
                basValue = tempNumber%10; //basamagin degeri-mod alma ile.
                basPow = 1;
                for (int i = 1; i<=basNumber; i++) {
                    basPow *= basValue; // basamak degerinin basNumber'inci kuvveti
                }
                result += basPow; // sonuca eklenir.
                tempNumber /= 10; // sonraki basamaga gecilir.
            }

            //Armstrong sayi kontrolu
            if (result == number) {
                System.out.println(number + "armstrong");
            }

        }
    }
}


