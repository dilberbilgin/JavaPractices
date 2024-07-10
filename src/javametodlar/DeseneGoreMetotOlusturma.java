package javametodlar;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    public static void desenMethod(int n) {
        System.out.print(n + " "); // n degerini ekrana yazdirdik,
        if (n <= 0){ //// Eğer n 0 veya negatifse, metottan çık.
            return; // Bu return ifadesi, metodu erken sonlandırır.
        } else {
            desenMethod(n-5); // n pozitifse, metodu n-5 değeri ile tekrar çağır.
            System.out.print(n+ " "); // Geri dönüş sırasında n değerini tekrar yazdır.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayisi:");
        int n = sc.nextInt();

        System.out.print("Ciktisi: ");
        desenMethod(n); // desenMethod fonksiyonunu n değeri ile çağır.



    }
}
