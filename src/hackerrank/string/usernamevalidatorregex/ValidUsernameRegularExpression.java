package hackerrank.string.usernamevalidatorregex;

import java.util.Scanner;

public class ValidUsernameRegularExpression {

    /*
    Kullanıcı adı bir harfle başlamalı: ^[a-zA-Z]
Kullanıcı adı alfanumerik karakterler veya alt çizgi içerebilir ve 8-30 karakter
uzunluğunda olmalı: [a-zA-Z0-9_]{7,29}$
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

