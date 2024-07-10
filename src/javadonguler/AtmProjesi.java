package javadonguler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        int right =3;
        int select;
        int balance = 1500;

        while (right>0){
            Scanner scan = new Scanner(System.in);
            System.out.print("Kullanici adinizi giriniz: ");
            String username = scan.nextLine();
            System.out.print("Parolanizi giriniz: ");
            String password = scan.nextLine();

            if (username.equals("patika") && password.equals("java123")){
                System.out.println("Sisteme giris yaptiniz. Hosgeldiniz!");
                do {
                    System.out.println("Lutfen bir islem seciniz:\n" +
                            "1-Para Yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Cikis");
                    System.out.print("Seciminiz : ");
                    select = scan.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktari : " );
                        int price = scan.nextInt();
                        balance += price;
                        System.out.println(balance);
                        System.out.println("--------------------------------");
                    } else if (select == 2){
                        System.out.print("Para miktari: " );
                        int price = scan.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye yetersiz");
                            System.out.println("--------------------------------");
                        } else {
                            balance -= price;
                            System.out.println(balance);
                            System.out.println("--------------------------------");

                        }
                    } else if (select ==3) {
                        System.out.println("Bakiyeniz: " + balance);
                        System.out.println("--------------------------------");
                    }
                } while (select !=4);
                System.out.println("Tekrar gorusmek uzere!");
                break;
            } else {
                --right;
                System.out.println("Hatali bir islem. Lutfen tekrar deneyiniz! ");
                if (right == 0) {
                    System.out.println("Hesabiniz Bloke olmustur! Bankaniz ile iletisime geciniz!");
                } else {
                    System.out.print("Kalan hakkiniz : " + right);
                }
            }

        }



    }
}
