import java.util.Scanner;

public class Calculate2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();  // 讀整行像 "12+26"

        String[] parts = input.split("\\+");  // 用 + 拆開
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        int sum = a + b;
        System.out.println(sum);
    }
}
