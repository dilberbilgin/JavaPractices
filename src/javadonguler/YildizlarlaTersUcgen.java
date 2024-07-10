package javadonguler;

import java.util.Scanner;

public class YildizlarlaTersUcgen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen ucgen satir sayisini giriniz: ");
        int number = scan.nextInt();

        for (int i = number; i>=1; i--){
//            for (int k = 1; k<=(number-i); k++){
//                System.out.print(" ");
//            }
            //Her satırda yıldız sayısı (2 * i - 1) olarak azalır.
            for (int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
