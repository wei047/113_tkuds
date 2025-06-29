import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ds_05 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Random random = new Random();
        int[] array = new int[10];
        int sum = 0;

        System.out.println("產生的陣列元素為：");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // 產生 0~99 的隨機整數
            System.out.println("array[" + i + "] = " + array[i]);
            sum += array[i];
        }

        System.out.println("所有元素的總和為：" + sum);
    }
}
