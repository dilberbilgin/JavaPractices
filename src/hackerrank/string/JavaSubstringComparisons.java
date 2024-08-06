package hackerrank.string;

import java.util.Scanner;

public class JavaSubstringComparisons {

    /*
    We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length s.
     Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings

Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.
Constraints

 s consists of English alphabetic letters only (i.e., [a-zA-Z]).
 Sample Input 0

welcometojava
3
Sample Output 0

ava
wel

Explanation 0

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.


     */

    public static String getSmallestAndLargest(String s, int k) {
        // İlk küçük ve büyük alt string'leri belirle
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // String'in tüm k uzunluğundaki alt string'lerini kontrol et
        //s'nin her bir k uzunluğundaki alt string'ini bulma

        for ( int i = 1; i <= s.length() - k; i++) {
            String subString = s.substring(i, i+k); // Alt string'i elde edin

            // Karşılaştırma yaparak küçük ve büyük string'leri güncelleme
            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }
            if (subString.compareTo(largest) > 0) {
                largest = subString;
            }
        }

        // En küçük ve en büyük alt string'leri döndürün
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
