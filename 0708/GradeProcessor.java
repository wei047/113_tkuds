public class GradeProcessor {
    public static void main(String[] args) {
        int[] scores = {78, 85, 92, 67, 88, 95, 73, 90};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / (double) scores.length;
        System.out.printf("總分: %d%n", sum);
        System.out.printf("平均分數: %.2f%n", average);

        int max = scores[0];
        int min = scores[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i;
            }
            if (scores[i] < min) {
                min = scores[i];
                minIndex = i;
            }
        }
        System.out.println("最高分: " + max + " (索引 " + maxIndex + ")");
        System.out.println("最低分: " + min + " (索引 " + minIndex + ")");

        int countAboveAvg = 0;
        for (int score : scores) {
            if (score > average) {
                countAboveAvg++;
            }
        }
        System.out.println("高於平均分的人數: " + countAboveAvg);

        System.out.println("成績列表：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("學生編號 " + i + ": " + scores[i]);
        }
    }
}
