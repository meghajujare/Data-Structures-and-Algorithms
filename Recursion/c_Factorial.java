// package Recursions;

public class c_Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fn, fnm1;
        fnm1 = factorial(n - 1);
        fn = n * fnm1;
        return fn;
    }

    public static void main(String args[]) {
        System.out.println(factorial(5));
    }

}
