package javadonguler;

import java.util.Scanner;

public class GirilenSayidanKucukIkininKuvvetleriniBulanProgram {
    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        number = sc.nextInt();

        for (int i = 1; i<=number; i*=2 ){
            System.out.println(i);
        }
    }
}
