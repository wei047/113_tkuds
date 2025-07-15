import java.util.*;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(sc.nextLine());
        }

        Arrays.sort(scores);

        int count = Math.min(5, n);
        for (int i = n - 1; i >= n - count; i--) {
            System.out.printf("%.1f\n", scores[i]);
        }
    }
}

/*
 * Time Complexity: O(n log n)
 * 說明 : 使用內建 Arrays.sort 排序，之後印前5名或全數。
 */
