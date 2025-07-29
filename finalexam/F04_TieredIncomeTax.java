import java.util.*;

public class F04_TieredIncomeTax {
    public static int calcTax(int income) {
        int tax = 0;
        int[] bounds = {560000, 1260000, 2520000, 4720000};
        double[] rates = {0.05, 0.12, 0.2, 0.3, 0.4};
        int[] base = new int[5];

        // 分段計算應稅金額
        base[0] = Math.min(income, bounds[0]);
        if (income > bounds[0])
            base[1] = Math.min(income, bounds[1]) - bounds[0];
        if (income > bounds[1])
            base[2] = Math.min(income, bounds[2]) - bounds[1];
        if (income > bounds[2])
            base[3] = Math.min(income, bounds[3]) - bounds[2];
        if (income > bounds[3])
            base[4] = income - bounds[3];

        // 計算每段稅額
        for (int i = 0; i < 5; i++) {
            tax += (int)(base[i] * rates[i]);
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] taxes = new int[n];
        int totalTax = 0;

        for (int i = 0; i < n; i++) {
            int income = sc.nextInt();
            taxes[i] = calcTax(income);
            totalTax += taxes[i];
            System.out.println("Tax: $" + taxes[i]);
        }

        System.out.println("Average: $" + (totalTax / n));
    }
}
