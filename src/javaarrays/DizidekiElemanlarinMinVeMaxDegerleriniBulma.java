package javaarrays;

import java.util.Arrays;

public class DizidekiElemanlarinMinVeMaxDegerleriniBulma {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

//        Arrays.sort(list);
//        System.out.println(list[0]);
//        System.out.println(list[list.length-1]);

        int min = list[0];
        int max = list[0];

        for (int i : list){
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        System.out.println("Min Deger: " + min);
        System.out.println("Max Deger: " + max);
    }

}
