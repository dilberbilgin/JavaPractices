package javapratikler;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        double km;
        double perKm = 2.20;
        double tutar = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Km giriniz: ");
        km = input.nextDouble();

        tutar += (perKm * km);

        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println(tutar);




    }
}
