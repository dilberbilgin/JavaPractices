package javadonguler;

import java.util.Scanner;

public class BirSayininBasamakSayilariToplami {
    public static void main(String[] args) {

        int number;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        number = scan.nextInt();

        int basValue; // basamak degeri
        int result =0; // basamak degerleri toplami
        int tempNumber = number;

// basamak degerlerini ve toplamlarini hesapla
        while (tempNumber != 0){
            basValue = tempNumber%10; // basamagin degeri
            result += basValue; // toplama ekle
            tempNumber /= 10; // sonraki basamaga gec
            System.out.println(tempNumber);

        }

        System.out.println("Sayinin basamaklari toplami: " + result);

    }
}
