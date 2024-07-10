package javadonguler;

import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    /* N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
    sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

    Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
    Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();

        int basNumber = 0; //basamak sayisi
        int tempNumber=number; // gecici sayi
        int basValue; //basamak degeri
        int result = 0; // sonuc
        int basPow; // her bir uslu sayi

        // dongunun kac kez dondugunu bulursak basamak sayisini bulmus oluruz.
        while ( tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
            System.out.println("Gecici sayi: " + tempNumber);
        }
        System.out.println(" Basamak sayisi: " + basNumber);

        // Basamak degerlerini bulmamiz gerekiyor. cunku basamak sayisi ile basamak degeri carpilacak ve bunlar toplanacak.
        tempNumber = number; // ilk while dongusunden sonra number 0 olana kadar dedigimiz icin bir daha kullanamiyoruz. o sebeple number degerini kaybetmemek icin gecici bir number atadikl. tempnumber
        while(tempNumber != 0) {
            basValue = tempNumber % 10; // basama[in degerini bu sekilde buluruz. sayinin 10 a bolumunden kalan son rakamidir.
            System.out.println("Basamak degeri: " + basValue);
            basPow =1; // her bir uslu sayinin carpimi icin baslangic deger 1
            for (int i = 1; i<= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow; // sonuca her bir basamak sayisi*basamak degeri carpimini ekliyoruz
            tempNumber /= 10;
        }
        if (result == number) {
            System.out.println(number + " sayisi bir armstrong sayisidir.");
        } else{
            System.out.println(number + "sayisi bir armstrong sayi degildir");
        }









    }
}
