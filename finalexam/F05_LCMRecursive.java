import java.util.*;

public class F05_LCMRecursive {
    public static int gcd(int a, int b) {
        if (a == b) return a;
        else if (a > b) return gcd(a - b, b);
        else return gcd(a, b - a);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM: " + lcm(a, b));
    }
}

// 時間複雜度分析：
// - 輾轉相減法 GCD 最差 O(max(a, b))
// - LCM 為 O(1)
// => 總時間複雜度：O(max(a, b))
