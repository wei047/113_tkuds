import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            times[i] = hour * 60 + minute;
        }

        String queryStr = sc.nextLine();
        String[] qParts = queryStr.split(":");
        int qHour = Integer.parseInt(qParts[0]);
        int qMinute = Integer.parseInt(qParts[1]);
        int queryTime = qHour * 60 + qMinute;

        int idx = Arrays.binarySearch(times, queryTime + 1);
        if (idx < 0) {
            idx = -idx - 1;
        }

        if (idx == n) {
            System.out.println("No train");
        } else {
            int ansTime = times[idx];
            int ansHour = ansTime / 60;
            int ansMinute = ansTime % 60;
            System.out.printf("%02d:%02d\n", ansHour, ansMinute);
        }
    }
}

/*
 * Time Complexity: O(log n)
 * 說明 : 將時刻表轉分鐘排序陣列後，用二分搜尋找第一個比查詢時間大的班次。
 */
