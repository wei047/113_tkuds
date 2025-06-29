import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ds_02 {
    public static void main(String[] args) throws Exception {
        // 確保 System.out 用 UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        // 這一行超關鍵 → 強制Scanner用UTF-8讀取
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("請輸入圓的半徑：");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("圓的面積為：" + area);
        
        scanner.close();
    }
}

