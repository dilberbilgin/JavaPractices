package javadonguler;

import java.util.Scanner;

public class YildizlarIleElmas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak sayisi giriniz: ");
        int n = scan.nextInt();


        for (int i = 1; i<= (n/2); i++){
             for (int k=1; k<=(n/2 -i); k++){ //bosluklar icin
                 System.out.print(" ");
             }
            for (int j =1; j<=(2*i -1); j++){ //yildizlar icin
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n/2-1; i>=1; i--){ //bosluklar icin
            for (int k=1; k<=(n/2 -i); k++){
                System.out.print(" ");
            }
            for (int j =1; j<=(2*i -1); j++){ //yildizlar icin
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
