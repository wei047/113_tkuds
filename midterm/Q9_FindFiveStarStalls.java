import java.util.*;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀入攤位數
        int n = Integer.parseInt(sc.nextLine());
        String[] tokens = sc.nextLine().split(" ");
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(tokens[i]);
        }

        // 搜尋五星
        List<Integer> fiveIndexes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                fiveIndexes.add(i);
            }
        }

        // 輸出
        if (fiveIndexes.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < fiveIndexes.size(); i++) {
                System.out.print(fiveIndexes.get(i));
                if (i < fiveIndexes.size() - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

