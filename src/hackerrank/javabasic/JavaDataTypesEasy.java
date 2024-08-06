package hackerrank.javabasic;

import java.util.Scanner;

public class JavaDataTypesEasy {

    /*
    Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of
properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Input Format

The first line contains an integer, , denoting the number of test cases.
Each test case, , is comprised of a single line with an integer, , which can be
arbitrarily large or small.

Output Format

For each input variable  and appropriate primitive , you must determine if the
given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line
and order them by size (i.e.: ).

If the number cannot be stored in one of the four aforementioned primitives, print
the line:

n can't be fitted anywhere.
Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
Explanation

 can be stored in a short, an int, or a long.

 is very large and is outside of the allowable range of values for the
 primitive data types discussed in this problem.

 byte: 8 bit, -128 ile 127 arasında değerler alabilir.
short: 16 bit, -32,768 ile 32,767 arasında değerler alabilir.
int: 32 bit, -2,147,483,648 ile 2,147,483,647 arasında değerler alabilir.
long: 64 bit, -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasında değerler alabilir.
    * */

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            System.out.println("Enter a number: ");
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if(x >= -128 && x <= 127){
                    System.out.println("* byte");
                }
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
                //Complete the code
            }  catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
                // sc.next() ifadesi, geçersiz girişten sonra Scanner'ı temizlemek için kullanılır ve hatalı giriş değerini alır.
            }
        }
    }


    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Test vakası sayısını oku
//        System.out.println("Enter the number of test cases: ");
//        int T = sc.nextInt();
//
//        // Test vakaları kadar döngü
//        for (int i = 0; i < T; i++) {
//            boolean validInput = false; // Geçerli veri alındı mı kontrol etmek için bayrak
//
//            // Kullanıcının giriş denemeleri için döngü
//            while (!validInput) {
//                System.out.println("Enter a number: ");
//                try {
//                    long n = sc.nextLong(); // Girilen sayıyı long olarak al
//
//                    System.out.println(n + " can be fitted in:");
//
//                    // Byte sınırlarını kontrol et
//                    if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
//                        System.out.println("* byte");
//                    }
//
//                    // Short sınırlarını kontrol et
//                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
//                        System.out.println("* short");
//                    }
//
//                    // Int sınırlarını kontrol et
//                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
//                        System.out.println("* int");
//                    }
//
//                    // Long sınırlarını kontrol et
//                    if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
//                        System.out.println("* long");
//                    }
//
//                    validInput = true; // Geçerli veri alındı, döngüyü bitir
//
//                } catch (Exception e) {
//                    System.out.println("n can't be fitted anywhere. Please try again."); // Hatalı giriş mesajı
//                    sc.next(); // Hatalı giriş sonrası scanner'ı temizle
//                }
//            }
//        }
//
//        sc.close(); // Scanner'ı kapat
//    }

}
