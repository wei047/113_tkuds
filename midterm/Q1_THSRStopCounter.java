import java.util.*;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] stops = sc.nextLine().split(" ");

        String[] tokens = sc.nextLine().split(" ");
        String start = tokens[0];
        String end = tokens[1];

        int startIdx = -1;
        int endIdx = -1;

        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIdx = i;
            }
            if (stops[i].equals(end)) {
                endIdx = i;
            }
        }

        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            int count = Math.abs(startIdx - endIdx) + 1;
            System.out.println(count);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明 : 只需一次走訪停靠站陣列找起訖index，其餘是常數計算。
 */
