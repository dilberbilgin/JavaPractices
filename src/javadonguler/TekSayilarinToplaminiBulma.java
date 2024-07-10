package javadonguler;

import java.util.Scanner;

public class TekSayilarinToplaminiBulma {
    public static void main(String[] args) {
        int number;
        int total = 0;

        Scanner sc =new Scanner(System.in);

        do {
            System.out.println("Bir sayi giriniz: ");
            number = sc.nextInt();
            if(number % 2 == 1) {
                total += number;
            }
        } while (number > 0);
        System.out.println(total);

    }
}
