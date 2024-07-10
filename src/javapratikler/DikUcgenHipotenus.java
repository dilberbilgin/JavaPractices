package javapratikler;

import java.util.Scanner;

public class DikUcgenHipotenus {
    public static void main(String[] args) {
        int a,b;
        double c,u,alan;


        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenari giriniz: ");
        a = input.nextInt();
        System.out.println("2.kenari giriniz: ");
        b = input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus:" + c);

         u = (a+b+c)/2;
         alan = u*(u-a)*(u-b)*(u-c);

        System.out.println("Cevre :" + u);
        System.out.println("Alan: " + alan);
    }
}
