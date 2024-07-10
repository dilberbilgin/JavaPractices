package javapratikler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password, newpassword, select;

        Scanner sc = new Scanner(System.in);
        System.out.println("Kullanici adiniz: ");
        username = sc.nextLine();

        System.out.println("Sifreniz: ");
        password = sc.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println(" giris  yapiniz");
        } else if((username.equals("patika")) && (!password.equals("java123"))){
            System.out.println("Hatali sifre.Sifrenizi sifirlamak ister misiniz? e/h ");
            System.out.println("Seciminiz: ");
            select = sc.nextLine();

            if (select.equals("e") || select.equals("E")){
                System.out.println("Yeni sifre giriniz: ");
                newpassword = sc.nextLine();

                if (!newpassword.equals("java123")){
                    System.out.println("Yeni sifreniz basarili bir sekilde olusturuldu.");
                } else {
                    System.out.println("yeni sifre eskisiyle ayni olamaz.lutfen tekrar deneyiniz.");
                }

            } else if (select.equals("h") || select.equals("H")) {
                System.out.println("Sayfadan cikiyorsunuz.");
            } else{
                System.out.println("lutfen sadece e veya h harfler'nden birine basiniz.");
            }


        }
    }
}
