package hackerrank.javabasic;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter an integer number: ");
        int n = sc.nextInt();
        try {
            String s = String.valueOf(n);

            if (s.equals(String.valueOf(n))) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        } catch (Exception e) {
            System.out.println("Wrong answer!");
        }





    }
}
