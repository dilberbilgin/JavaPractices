package javaarrays;

import java.util.Arrays;

public class ArraysMetodlar {
    public static void main(String[] args) {
        int [] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};

        System.out.println(Arrays.toString(dizi));

        Arrays.fill(dizi, 1);
        System.out.println(Arrays.toString(dizi));


        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        Arrays.fill(liste2, 3, 5, 0);

        System.out.println(Arrays.toString(liste2));

        Arrays.sort(liste2);
        System.out.println(Arrays.toString(liste2));

        int index = Arrays.binarySearch(liste2, -22);
        System.out.println(" -22'nin indexi = " + index );

        int[] copyArray = Arrays.copyOf(liste2, 4);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste2, 2,7);
        System.out.println(Arrays.toString(copyOfRangeArray));



        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = {1,2,10};

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));


    }

}
