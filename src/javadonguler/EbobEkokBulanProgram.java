package javadonguler;

import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kucuk sayiyi giriniz n1: ");
        int n1 = scan.nextInt();
        System.out.print("Buyuk sayiyi giriniz n2: ");
        int n2 = scan.nextInt();

        int ebob = 1;
        for (int i=n1; i>=1; i--){
            if (n1%i==0 && n2%i==0){
                ebob = i;
                System.out.println(ebob);
                break;
            }
        }

        for (int k=1; k<=(n1*n2); k++){
            if (k%n1==0 && k%n2==0){
                System.out.println(k);
                break;
            }
        }
        System.out.println((n1*n2) / ebob);


        /*
        WHILE DONGUSU ILE EBOB EKOK

             System.out.println("Birinci saayiyi giriniz: ");
        int n1 = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int i = 1;

        while (i<=n1 && i<=n2){
            i++;
            if(n1%i == 0 && n2%i == 0) {
                ebob = i;
            }
        }
        int ekok = (n1*n2) / ebob;
        System.out.println("Ebob Degeri : " +ebob);
        System.out.println("Ekok Degeri: " +ekok);

    }

        */
    }
}
