package hackerrank.string;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    /*
    Sample Input 0
anagram
margana

Sample Output 0
Anagrams

Sample Input 1
anagramm
marganaa

Sample Output 1
Not Anagrams

     */

//    static boolean isAnagram(String a, String b) {
//        a = a.toLowerCase();
//        b = b.toLowerCase();
//
//        if (a.length() != b.length()) {
//            return false;
//        }
//
//        char[] charArrayA = a.toCharArray();
//        char[] charArrayB = b.toCharArray();
//
//        Arrays.sort(charArrayA);
//        Arrays.sort(charArrayB);
//
//        return Arrays.equals(charArrayA, charArrayB);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//    }



    static boolean isAnagram(String firstWord, String secondWord) {
        // Karakter dizilerine dönüştürmeden önce küçük harflere dönüştür ve boşlukları kaldır
        char[] word1 = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();

        // Karakter dizilerini sıralayarak karşılaştır
        Arrays.sort(word1);
        Arrays.sort(word2);

        // İki sıralanmış diziyi karşılaştır
        return Arrays.equals(word1, word2);
        }
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            boolean ret=isAnagram(A,B);
            if(ret)System.out.println("Anagrams");
            else System.out.println("Not Anagrams");

    }

}
