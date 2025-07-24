public class hw_3 {
    public static int digitsum(int n) {
        if (n == 0) return 0;
        return (n % 10) + digitsum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitsum(1234)); // 輸出：10
    }
}
