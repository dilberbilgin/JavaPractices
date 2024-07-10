package javadonguler;

import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
     /*
     Bir sayının kendisi hariç pozitif tam sayı
     çarpanları (kalansız bölen sayıların) toplamı
     kendisine eşit olan sayıya mükemmel sayı denir.
     */


        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int number = sc.nextInt();

        int toplam =0;

        for (int i =1; i<number; i++){
            if (number%i==0){
                toplam += i;
            }

        }
        if (toplam == number) {
            System.out.println(number + " sayisi mukemmel bir sayidir");
        } else {
            System.out.println(number + " sayisi mukemmel bir sayi degildir.");
        }
    }
}
