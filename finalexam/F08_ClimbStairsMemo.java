import java.util.*;

public class F08_ClimbStairsMemo {
    static int[] memo = new int[41];

    public static int ways(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo[n] > 0) return memo[n];
        memo[n] = ways(n - 1) + ways(n - 2) + ways(n - 3);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Ways: " + ways(n));
    }
}
