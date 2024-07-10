package javadonguler;

import java.util.Scanner;

public class YildizUcgenWhileDongusuIle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Basamak sayisi giriniz : ");
        int n = sc.nextInt();

        int i = 1; // satir sayaci
        while(i <= n) {
            //bosluklar icin
            int k = 1;
            while(k <= (n-i)){
                System.out.print(" " );
                k++;
            }

            //yildizlar icib
            int j = 1;
            while (j <= (2*i)-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
