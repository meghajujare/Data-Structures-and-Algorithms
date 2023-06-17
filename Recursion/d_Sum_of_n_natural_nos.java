// package Recursions;
// prints the sum of first n natural numbers
public class d_Sum_of_n_natural_nos {
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum;
        sum = n + calcSum(n - 1);
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(calcSum(5));
    }

}
