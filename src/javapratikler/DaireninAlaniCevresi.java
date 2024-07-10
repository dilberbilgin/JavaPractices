package javapratikler;

import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        double r; //yaricap
        double a; //merkez aci

        Scanner scan = new Scanner(System.in);
        System.out.println("Yaricap giriniz: ");
        r = scan.nextDouble();

        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        a = scan.nextDouble();

        double pi = 3.14;
        double alan = pi*r*r;
        double cevre = 2*pi*r;
        double  dilimAlan = (pi * (r*r) * a) / 360;

        System.out.println(alan);
        System.out.println(cevre);
        System.out.println(dilimAlan);
    }
}
