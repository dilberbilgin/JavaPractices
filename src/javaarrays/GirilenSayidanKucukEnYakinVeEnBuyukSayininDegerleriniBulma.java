package javaarrays;

import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayidanKucukEnYakinVeEnBuyukSayininDegerleriniBulma {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list); // diziyi kucukten buyuge dogru sirala
        System.out.println(Arrays.toString(list));//siralanmis diziyi yazdir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi  giriniz: " );
        int number = scan.nextInt();

        int closestSmaller = list[0]; // dizinin en kucuk elemani ile baslatiliyor
        int closestLarger = list[list.length-1]; // dizinin en buyuk elemani ile baslatiliyor

        // girilen sayinin dizide bulunup bulunmadigini takip etmek icin boolean degerler atandi. baslangicta false
        boolean foundSmaller = false;
        boolean foundLarger = false;

        for (int i : list){
            if (i<number && (i>closestSmaller || !foundSmaller)){ // i girilen sayiodan kucukse ve i en yakin kucuk sayidan buyukse veya sayi dizi icindeyse
                closestSmaller = i;
                foundSmaller = true;
            }
            if (i>number && (i>closestLarger || !foundLarger)) {// i girilen sayidan buyukse ve i en yakin kucuk sayidan buyukse veya sayi dizi icindeyse
                closestLarger = i;
                foundLarger = true;
            }
        }
        if (!foundSmaller){
            System.out.println("Girilen sayidan kucuk bir deger olmalidir");
        } else {
            System.out.println("Girilen sayiya en yakin kucuk sayi: " + closestSmaller);
        }

        if (!foundLarger){
            System.out.println("Girilen sayidan buyuk bir deger olmalidir");
        } else {
            System.out.println("Girilen sayiya yakin en buyuk sayi : " + closestLarger);
        }

    }

}
