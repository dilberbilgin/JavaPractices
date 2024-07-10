package javadonguler;

import java.util.Scanner;

public class HarmonikSayiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();
        double result = 0;

        for (double i=1; i<=n; i++){
            result += 1/i ;
        }
        System.out.println(result);
    }
}
