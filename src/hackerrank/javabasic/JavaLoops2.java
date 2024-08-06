package hackerrank.javabasic;

import java.util.Scanner;

public class JavaLoops2 {
    /*We use the integers a,b, and n to create the following series:
    (a+2^0*b), (a+2^0*b + 2^1*b),...,(a+2^0*b+2^1*b+...+2^n-1 *b)

     a+1*b   // a
     a+1*b + 2*b // a= a+b ve b=b*2 durumu ortaya cikiyor.
     a+1*b + 2*b + 4*b //


    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("sorgu sayisi giriniz: ");
        int t = in.nextInt();

        // once tum sorguyu gez ve topla
        for (int i = 0; i < t; i++ ){

            System.out.print("a sayisini giriniz: ");
            int a = in.nextInt();
            System.out.print("b sayisini giriniz: ");
            int b = in.nextInt();
            System.out.print("n sayisini giriniz: ");
            int n = in.nextInt();

            // ikinci sorguda da herbir degerin hesaplamasi yapilacak.
            for (int j = 0; j < n; j++ ){
                a = a+b;
                b = b*2;
                System.out.print(a + " ");
            }
            System.out.println();
            System.out.println("---------------------------------------");
        }
    }

}
