import java.util.*;

public class F06_ArraySecondLargest {
    public static int[] secondMax(int[] arr, int left, int right) {
        if (left == right) return new int[]{arr[left], Integer.MIN_VALUE};
        int mid = (left + right) / 2;
        int[] leftPair = secondMax(arr, left, mid);
        int[] rightPair = secondMax(arr, mid + 1, right);

        int max, second;
        if (leftPair[0] > rightPair[0]) {
            max = leftPair[0];
            second = Math.max(leftPair[1], rightPair[0]);
        } else {
            max = rightPair[0];
            second = Math.max(rightPair[1], leftPair[0]);
        }
        return new int[]{max, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextInt();
        }
        int[] result = secondMax(vals, 0, n - 1);
        System.out.println("SecondMax: " + result[1]);
    }
}

// 時間複雜度分析：
// - 分治遞迴處理所有元素：O(n)
// => 總時間複雜度：O(n)
