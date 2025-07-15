import java.util.*;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] station = new String[n];
        int[][] price = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split(" ");
            station[i] = tokens[0];
            price[i][0] = Integer.parseInt(tokens[1]);
            price[i][1] = Integer.parseInt(tokens[2]);
        }

        System.out.println("Station|Standard|Business");

        for (int i = 0; i < n; i++) {
            System.out.printf("%s|%d|%d\n", station[i], price[i][0], price[i][1]);
        }
    }
}

