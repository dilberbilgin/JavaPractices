package javametodlar;

public class PalindromSayi {

    /*
    Palindrom Sayı Nedir ?
    Palindromik sayı, iki taraftan okunduğu zaman okunuş
    yönüyle aynı olan sayılardır.

    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
    */

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0) {
            System.out.println();
            System.out.println("Sayi => " + temp);
            lastNumber = temp%10; // son basamagi bulma.
            System.out.println("Son basamak => " + lastNumber);
            // lastNumber i reverseNumber in ilk sayisi yapmamiz gerekiyor.
            reverseNumber = (reverseNumber *10) + lastNumber;
            System.out.println("Yeni sayi => " + reverseNumber);
            temp /= 10;
            System.out.println("Yeni temp => " + temp);
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(1001));;



        /*bir sayinbin son basamagini almak icin %10.
        orn: 1276%10 kalan 6 olacak bu son basamak.
        bir sayinin 10 a bolunce virgul sonrasini atar integer.
        onceki sayiyi da bulmus oluruz.
        orn: 1276/10=127,6 cikti bize 127 olarak gelir integer olunca virgul sonrasini atar.
         */


    }
}
