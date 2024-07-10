package javadonguler;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int n,k;

        Scanner input = new Scanner(System.in);
        System.out.println("n degerini giriniz : ");
        n = input.nextInt();
        System.out.println("ust k degerini giriniz: ");
        k = input.nextInt();

        // 3^4 = 3*3*3*3

        int total = 1;
        int i = 1;
        while(i <= k) {
            System.out.println(i);
            total *= n;
            i++;
        }
    }
}
