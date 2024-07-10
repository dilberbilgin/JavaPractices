package javadonguler;

import java.util.Scanner;

public class MinMaxDegeriBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac sayi gireceksiniz n: ");
        int n = input.nextInt();

        int number;
        int min = 0;
        int max = 0;

        for (int i = 1; i <= n; i++){
            System.out.println(i + ". sayiyi giriniz: ");
            number = input.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("En kucuk sayi : " + min);
        System.out.println("En buyuk sayi : " + max);
    }
}
