package javadonguler;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Eleman sayisi giriniz: ");
        int n = sc.nextInt();

        // ilk iki sayi zaten 0 ve 1 bu sekilde belirtebiliriz.
        int s1 = 0;
        int s2 = 1;
        int total;

        System.out.print(n + " elemanli sayinin Fibonacci serisi: ");

        for (int i = 0; i <= n; i++){
            System.out.print( s1 + " ");
            total = s1 + s2; // bu toplam sonraki sayi olur.
            s1 = s2;  // ilk sayi ikinci sayi olur
            s2 = total; // ikinci sayi toplam olmus olur. ve dongu bu sekilde devam eder.
        }






    }
}
