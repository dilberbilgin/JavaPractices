package javaarrays;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin Boyutu: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarini giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + " . Elemani: ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Siralama: " + Arrays.toString(arr));
    }
}
