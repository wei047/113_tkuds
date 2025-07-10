public class ArrayStatistics {
    public static void main(String[] args) {
        int[] array = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        int sum = 0;
        for (int n : array) sum += n;
        double avg = sum / (double) array.length;

        int max = array[0], min = array[0], maxIndex = 0, minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        int countAboveAvg = 0, evenCount = 0, oddCount = 0;
        for (int n : array) {
            if (n > avg) countAboveAvg++;
            if (n % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("----- 陣列統計分析表 -----");
        System.out.printf("總和          : %d%n", sum);
        System.out.printf("平均值        : %.2f%n", avg);
        System.out.printf("最大值        : %d (索引 %d)%n", max, maxIndex);
        System.out.printf("最小值        : %d (索引 %d)%n", min, minIndex);
        System.out.printf("大於平均值數量: %d%n", countAboveAvg);
        System.out.printf("偶數數量      : %d%n", evenCount);
        System.out.printf("奇數數量      : %d%n", oddCount);
    }
}
