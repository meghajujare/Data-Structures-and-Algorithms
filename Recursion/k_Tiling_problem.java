// Given a "2*n" board and tiles of sizes "2*1"
// Count the number of ways to tile the given board using "2*1" tiles. 
// (A tile can be placed vertically or horizontally)
public class k_Tiling_problem {
    public static int TilingProblem(int n) {
        if (n == 0 | n == 1) {
            return 1;
        }
        int fnm1 = TilingProblem(n - 1);
        int fnm2 = TilingProblem(n - 2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(TilingProblem(4));
    }

}
