// package Recursions;
// Program to the power of a number
// example 1: 2^10=1024
// example 1: 3^3=27
public class i_x_to_the_power_n {

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        return x * power(x, n - 1);
    }

    public static void main(String args[]) {
        System.out.println(power(2, 10));
    }
}