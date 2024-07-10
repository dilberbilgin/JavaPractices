package javapratikler;

import java.util.Scanner;

public class KDVTutari {
    public static void main(String[] args) {
        double tutar, kdvOran;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucret giriniz: " );
        tutar = scan.nextDouble();

        if (tutar > 0 && tutar <= 1000) {
            kdvOran = 0.18;
        } else {
            kdvOran = 0.08;
        }
        double kdvTutar = tutar*kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdvli Tutar: " + tutar +" + "+ kdvOran +" = "+kdvliTutar );







    }
}
