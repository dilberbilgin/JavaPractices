package javametodlar;

public class FibonacciSerisiRecursive {

    static int fibonacci(int n){
       if (n == 1 || n == 2) {
           return 1;
       }
       return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(7));


        // 1 1 2 3 5 8 13 21
        //f(1) = 1
        //f(2) = 1

        //f(n) = f(n-1) + f(n-2)
        //f(6) = (f(5) + f(4)
        //...

    }
}
