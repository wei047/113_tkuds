import java.util.*;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = Integer.parseInt(sc.nextLine());
        int[] kwhs = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            kwhs[i] = Integer.parseInt(sc.nextLine());
            int bill = calc(kwhs[i]);
            System.out.println("Bill: $" + bill);
            total += bill;
        }

        int avg = total / n;
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);
    }

    static int calc(int kwh) {
        double cost = 0.0;
        int remain = kwh;

        if (remain > 1000) {
            cost += (remain - 1000) * 8.46;
            remain = 1000;
        }
        if (remain > 700) {
            cost += (remain - 700) * 6.24;
            remain = 700;
        }
        if (remain > 500) {
            cost += (remain - 500) * 4.66;
            remain = 500;
        }
        if (remain > 330) {
            cost += (remain - 330) * 3.70;
            remain = 330;
        }
        if (remain > 120) {
            cost += (remain - 120) * 2.45;
            remain = 120;
        }
        cost += remain * 1.68;

        return (int)Math.round(cost);
    }
}

/*
 * Time Complexity: O(n)
 * 說明 : 每筆住戶呼叫一次 calc(kwh) 是常數段數累加，總共 n 筆 => O(n)。
 */
