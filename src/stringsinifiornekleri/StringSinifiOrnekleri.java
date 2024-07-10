package stringsinifiornekleri;

import java.util.Arrays;

public class StringSinifiOrnekleri {

    public static void main(String[] args) {
        String str = "patika";
        String let = "";
        String abc = " patika dev dersleri";
        String[] sp = str.split("a");
        String letter = "JavA";
        String trim = "   Pik.dev     ";



        System.out.println(str.charAt(1));
        System.out.println(str.codePointAt(1));
        System.out.println(str.concat(".dev"));

        System.out.println(str.contains("ata"));
        System.out.println(str.contains("atik"));

        System.out.println(str.endsWith("ka"));
        System.out.println(str.startsWith("p"));

        System.out.println(str.equals("patika"));
        System.out.println(str.equalsIgnoreCase("paTika"));

        System.out.println(str.indexOf("k"));

        System.out.println(let.isEmpty());

        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.indexOf("a"));

        System.out.println(str.length());

        System.out.println(str.replace("a", "b"));
        System.out.println(abc.replaceAll("e", "f"));

        System.out.println(Arrays.toString(sp));

        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 6));

        System.out.println(letter.toLowerCase());
        System.out.println(letter.toUpperCase());

        System.out.println(trim.trim());


        System.out.println("---------------------------------------------------");

        int sayi = 123;
        String word = String.valueOf(sayi);
        System.out.println(word);


        System.out.println("---------------------------------------------------");





    }
}
