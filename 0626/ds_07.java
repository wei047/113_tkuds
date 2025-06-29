import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ds_07 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Random random = new Random();
        int[][] array = new int[3][3];

        System.out.println("產生的 3x3 二維陣列元素為：");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = random.nextInt(100); // 產生 0~99 的隨機整數
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

