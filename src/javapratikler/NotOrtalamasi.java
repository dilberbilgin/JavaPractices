package javapratikler;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //degiskenleri olustur.
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);
        //Kullanicidan degerleri al
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.println("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam/6.0;
        System.out.println("Sonuc: " + ortalama);

//        String sonuc  = ortalama >=60 ? "Dersi gectiniz" : "Dersten kaldiniz!";
//        System.out.println(sonuc);

        if ( ortalama <= 55) {
            System.out.println("Sinifta kaldiniz!");
        } else {
            System.out.println("Tebrikler, sinifi gectiniz!");
        }

        System.out.println("Ortalamaniz :" + ortalama);

    }
}
