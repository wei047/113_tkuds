import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] qty = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            qty[i] = sc.nextInt();
        }

        // 插入排序（從大到小）
        for (int i = 1; i < n; i++) {
            String nameKey = names[i];
            int qtyKey = qty[i];
            int j = i - 1;
            while (j >= 0 && qty[j] < qtyKey) {
                names[j + 1] = names[j];
                qty[j + 1] = qty[j];
                j--;
            }
            names[j + 1] = nameKey;
            qty[j + 1] = qtyKey;
        }

        for (int i = 0; i < Math.min(10, n); i++) {
            System.out.println(names[i] + " " + qty[i]);
        }
    }
}

// 時間複雜度分析：
// - 插入排序最壞情況 O(n^2)
// - 印出前10名 O(1)
// => 總時間複雜度：O(n^2)
