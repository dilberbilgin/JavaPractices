package hackerrank.string;

import java.util.Scanner;


public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Trim the input string to remove leading and trailing spaces
        // Girdiyi başındaki ve sonundaki boşlukları kaldırarak parçalama işlemi yapıyoruz
        String[] tokens = str.trim().split("[ !,?._'@]+");

        // Check if the only token is an empty string, which indicates that the input was empty or just separators
        // Tek bir token varsa ve bu token boş ise, girdinin boş olduğunu ifade eder
        if (tokens.length == 1 && tokens[0].isEmpty()) {
            System.out.println(0); // Print 0 as there are no valid tokens (Hiç geçerli token yoksa 0 yazdırılır)
        } else {
            System.out.println(tokens.length); // Print the number of tokens
        }

        // Print each token in a new line (Her token bir satıra yazdırılır)
        for (String s : tokens) {
            System.out.println(s);
        }

    }
}
