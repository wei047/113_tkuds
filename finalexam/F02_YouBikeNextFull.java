import java.util.*;

public class F02_YouBikeNextFull {
    public static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] schedule = new String[n];
        int[] mins = new int[n];

        for (int i = 0; i < n; i++) {
            schedule[i] = sc.next();
            mins[i] = toMinutes(schedule[i]);
        }

        String query = sc.next();
        int queryMin = toMinutes(query);

        int left = 0, right = n - 1, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mins[mid] > queryMin) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.println("No bike");
        } else {
            System.out.println(schedule[ans]);
        }
    }
}

// 時間複雜度分析：
// - 時間轉換：O(n)
// - 二分搜尋：O(log n)
// => 總時間複雜度：O(n + log n) ≈ O(n)
