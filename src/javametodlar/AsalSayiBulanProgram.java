package javametodlar;

import java.util.Scanner;

public class AsalSayiBulanProgram {

    // Yardımcı fonksiyon: n sayısını k'ya kadar olan sayılarla bölünebilir mi kontrol eder
    static boolean isPrimeHelper(int n, int k){
        // Eğer k, n'ye eşitse ve n sadece kendisine bölünebildiyse, asal bir sayıdır
        if (k == n) {
            return true;
        }
        // Eğer n, k'ya tam bölünüyorsa, n asal değildir
        if (n % k == 0) {
            return false;
        }
        // k'yı bir arttırarak rekürsif kontrol yap
        return isPrimeHelper(n,k+1);
    }
    static boolean isPrime(int n){
        // 2'den küçük sayılar asal değildir
        if (n < 2) {
            return false;
        }
        // 2'den n'ye kadar olan sayılarla bölünebilir mi kontrol etmek için yardımcı fonksiyon çağırılır
        return isPrimeHelper(n,2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = sc.nextInt();

        if (isPrime(n)){
            System.out.println(n+ " asal bir sayidir");
        } else {
            System.out.println(n+ " asal bir sayi degildir");
        }
    }
}
