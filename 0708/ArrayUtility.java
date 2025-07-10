import java.util.Arrays;

public class ArrayUtility {
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : array) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n < largest) {
                second = n;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        System.out.print("原始陣列: ");
        printArray(array);

        reverseArray(array);
        System.out.print("反轉後: ");
        printArray(array);

        int[] copied = copyArray(array);
        System.out.print("複製陣列: ");
        printArray(copied);

        int secondLargest = findSecondLargest(array);
        System.out.println("第二大數值: " + secondLargest);
    }
}
