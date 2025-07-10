public class StudentGradeSystem {
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        char[] grades = new char[scores.length];

        int sum = 0;
        for (int score : scores) sum += score;
        double avg = sum / (double) scores.length;

        int max = scores[0], min = scores[0], maxIdx = 0, minIdx = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIdx = i;
            }
            if (scores[i] < min) {
                min = scores[i];
                minIdx = i;
            }
        }

        int countA = 0, countB = 0, countC = 0, countD = 0;
        int countAboveAvg = 0;
        for (int i = 0; i < scores.length; i++) {
            grades[i] = getGrade(scores[i]);
            if (grades[i] == 'A') countA++;
            else if (grades[i] == 'B') countB++;
            else if (grades[i] == 'C') countC++;
            else countD++;

            if (scores[i] > avg) countAboveAvg++;
        }

        System.out.println("====== 學生成績報告 ======");
        System.out.printf("全班平均分數: %.2f%n", avg);
        System.out.printf("最高分: %d (位置 %d)%n", max, maxIdx);
        System.out.printf("最低分: %d (位置 %d)%n", min, minIdx);
        System.out.println("--------------------------");
        System.out.println("等級人數統計:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.printf("高於平均分的比例: %.2f%%%n", 100.0 * countAboveAvg / scores.length);
        System.out.println("--------------------------");
        System.out.println("詳細成績列表:");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("學生編號 %d | 分數: %d | 等級: %c%n", i, scores[i], grades[i]);
        }
    }
}
