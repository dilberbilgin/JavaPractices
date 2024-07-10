package javapratikler;

import java.util.Scanner;

public class UcakBiletiHesaplayanProgram {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double perKm=0.10;
        double ucret;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: ");
        mesafe = sc.nextInt();

        System.out.println("Yolculuk tipini seciniz :\n1-Tek yon\n2-Cift yon" );
        yolculukTipi = sc.nextInt();

        System.out.println("Yasinizi giriniz");
        yas = sc.nextInt();

        ucret = mesafe * perKm;
        
        if (yas<=0 || mesafe <=0 || (yolculukTipi != 1 && yolculukTipi !=2)){
            System.out.println("Hatali veri girdiniz!");
        } else {
            if (yas < 12) {
                ucret *= 0.50;
            } else if (yas>12 && yas< 24) {
                ucret *= 0.90;
            } else if (yas>65) {
                ucret *= 0.70;
            }
            if (yolculukTipi == 2) {
                ucret *= 0.80 *2;
            }
        }
        System.out.println("Toplam bilet tutari " + ucret + "TL");

    }
}
