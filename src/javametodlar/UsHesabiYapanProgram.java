package javametodlar;

import java.util.Scanner;

public class UsHesabiYapanProgram {


    //daha basit us alma islemleri icin ;
//    static int power(int base, int exponent){
//        int result=1;
//        for (int i = 1; i<= exponent; i++){
//            result *= base;
//        }
//        return result;
//    }

    // daha buyuk sayilar icin
    static int power(int base, int exponent){
        if (exponent == 0) {
            // Üs 0 ise sonuç 1'dir
            return 1;
        }
        // Eğer üs negatif ise 1'i geri döndür (ya da farklı bir hata işleme yapılabilir)
        if (exponent < 0) {
            System.out.println("Us negatif olamaz!");
            return -1; // Negatif üsler için hata kodu olarak -1 döndürüyoruz
        }
        // Üs çift ise, üs yarıya indirilir ve üsler çarpılır
        if (exponent % 2 == 0) {
            int halfPower = power(base, exponent/2);
            return halfPower * halfPower;
        } else {
            // Üs tek ise, taban ile bir eksik üsün çarpımı alınır
            return base * power(base,exponent-1);
        }
    }

    /*
    power Fonksiyonu:
Üs 0 ise 1 döndürülür.
Üs negatifse hata mesajı verilir ve -1 döndürülür.
Üs çiftse üs yarıya indirilir ve karesi alınır.
Üs tekse taban ile bir eksik üs çarpılarak sonuç elde edilir.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban degeri giriniz: " );
        int base = scan.nextInt();
        System.out.println("Us degerini giriniz: ");
        int exponent = scan.nextInt();

        int result = power(base,exponent);
        if (result != -1) { // Negatif üs durumu dışında sonucu yazdırıyoruz
            System.out.println("Sonuc: " + result);
        }

    }
}

/**/

/*
taban sayisi 2 ve us 100 yapinbca sonuc 0 diyor
Bu sorun, Java'da int veri tipinin 32-bit işaretli tamsayı aralığının
dışında kalan büyük sayıları doğru bir şekilde temsil edememesinden
kaynaklanmaktadır. 2^100 gibi büyük bir sayı hesaplandığında,
int veri tipi aşırı taşma (overflow) yapar ve sonuç hatalı olur.
Bu tür büyük sayılarla çalışırken, BigInteger sınıfını kullanmak daha uygundur.
*/
