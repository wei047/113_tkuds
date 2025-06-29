import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ds_06 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Random random = new Random();

        int[] array = new int[10];
        System.out.println("產生的陣列元素為：");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\n陣列中的最大值為：" + max);
    }
}
