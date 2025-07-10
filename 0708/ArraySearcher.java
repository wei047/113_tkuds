public class ArraySearcher {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        int target1 = 67;
        int target2 = 100;

        System.out.println("搜尋 " + target1 + " 的結果: 索引 = " + findElement(array, target1));
        System.out.println("搜尋 " + target2 + " 的結果: 索引 = " + findElement(array, target2));
    }
}
