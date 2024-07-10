package javaarrays;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansiKacKezTekrar {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);

        int number = arr[0];
        int count = 1;

        System.out.println("Dizi: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number) {
                count++; //Eğer mevcut eleman önceki elemanla aynıysa, sayacı arttırır.
            } else {
                System.out.println(number + " sayisi " + count + " kere tekrar edildi.");
                number = arr[i];
                count = 1; // Eğer Mevcut Eleman Önceki Eleman ile Farklıysa count değişkeni 1'e ayarlanır çünkü yeni eleman sayılmaya başlandığında, bu elemanın ilk kez göründüğünü belirtir.
            }
        }
        System.out.println(number + " sayisi" + count +  " kere tekrar edildi");
    }
}
