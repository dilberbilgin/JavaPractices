package javapratikler;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil, artikYil;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir yil giriniz: ");
        yil = sc.nextInt();

        artikYil = yil%400;

        if(artikYil != 0) {
            System.out.println(yil + " artik yil degildir!");
        } else{
            System.out.println(yil + "bir artik yildir.");
        }

    }
}
