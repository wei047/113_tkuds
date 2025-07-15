import java.util.*;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] tokens = sc.nextLine().split(" ");
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            results[i] = Integer.parseInt(tokens[i]);
        }

        int k = Integer.parseInt(sc.nextLine());

        int[] prefix = new int[n];
        prefix[0] = results[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + results[i];
        }

        System.out.print("PrefixSum:");
        for (int i = 0; i < k; i++) {
            System.out.print(" " + prefix[i]);
        }
        System.out.println();
    }
}

/*
 * Time Complexity: O(n)
 * 說明 : 單次走訪建立 prefix sum，輸出前 k 項為 O(k)。
 */
