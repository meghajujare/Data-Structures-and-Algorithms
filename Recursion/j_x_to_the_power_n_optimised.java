// package Recursions;
// Program to the power of a number
// example 1: 2^10=1024
// example 1: 3^3=27
public class j_x_to_the_power_n_optimised {
    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        int halfpower = power(x, n / 2);
        int pow = halfpower * halfpower;
        if (n % 2 != 0)
            pow = x * pow;
        return pow;
    }

    public static void main(String args[]) {
        System.out.println(power(2, 10));
    }

}
