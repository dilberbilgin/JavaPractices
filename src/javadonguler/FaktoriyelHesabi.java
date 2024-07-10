package javadonguler;

import java.util.Scanner;

public class FaktoriyelHesabi {;
    public static void main(String[] args) {
        // n1 = 1 * 2 *3 *4* ... * n

        int n;
        int total = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir deger giriniz: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            total *=i;
        }
        System.out.println(n + "!" + "=" + total);
    }
}
