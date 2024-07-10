package javapratikler;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Boyunuzu  giriniz (m): ");
        boy = sc.nextDouble();
        System.out.println("Kilonuzu giriniz(kg): ");
        kilo = sc.nextDouble();

        double vucutKitleIndeksi = kilo/(boy*boy);
        System.out.println(vucutKitleIndeksi);

    }
}
