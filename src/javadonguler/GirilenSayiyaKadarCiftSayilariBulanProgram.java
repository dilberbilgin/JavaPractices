package javadonguler;

import java.util.Scanner;

public class GirilenSayiyaKadarCiftSayilariBulanProgram {
    public static void main(String[] args) {
        int sayi;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = sc.nextInt();

        for(int i = 1; i<=sayi; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
