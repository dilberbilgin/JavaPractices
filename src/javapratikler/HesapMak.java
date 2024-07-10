package javapratikler;

import java.util.Scanner;

public class HesapMak {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner sc = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz: ");
        n1 = sc.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        n2 = sc.nextInt();

        System.out.println(" 1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminiz : ");
        select = sc.nextInt();

        switch (select) {
            case 1 :
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if(n2 != 0){
                    System.out.println(n1/n2);
                }else{
                    System.out.println("bir sayi sifira bolunemez");
                }

                break;
            default:
                System.out.println("Yanlis bir secim girdiniz");
        }
    }
}
