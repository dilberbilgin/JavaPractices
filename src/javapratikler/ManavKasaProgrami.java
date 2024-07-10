package javapratikler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican;
        Scanner sc = new Scanner(System.in);
        System.out.println("Armut Kac kilo" );
        armut = sc.nextDouble();

        System.out.println("Elma Kac kilo" );
        elma = sc.nextDouble();

        System.out.println("Domates Kac kilo" );
        domates = sc.nextDouble();

        System.out.println("Muz Kac kilo" );
        muz = sc.nextDouble();

        System.out.println("Patlican Kac kilo" );
        patlican = sc.nextDouble();

        double totalArmut, totalElma, totalDomates, totalMuz, totalPatlican;
        double  aKg = 2.14 , eKg= 3.67, dKg = 1.11, mKg = 0.95, pKg = 5.00;

        totalArmut = armut * aKg;
        totalElma = elma * eKg;
        totalDomates = domates * dKg;
        totalMuz = muz * mKg;
        totalPatlican = patlican * pKg;

        double total = totalArmut + totalElma + totalDomates + totalMuz + totalPatlican;
        System.out.println("Toplam Tutar : " + total);
    }
}
