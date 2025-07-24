import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class BSTRangeQuery {
    public static List<Integer> rangeQuery(TreeNode root, int min, int max) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, min, max, result);
        return result;
    }

    private static void inOrder(TreeNode node, int min, int max, List<Integer> result) {
        if (node == null) return;
        if (node.val > min) inOrder(node.left, min, max, result);
        if (node.val >= min && node.val <= max) result.add(node.val);
        if (node.val < max) inOrder(node.right, min, max, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(35);

        List<Integer> result = rangeQuery(root, 12, 27);
        System.out.println("落在區間 [12, 27] 的節點: " + result); // [15, 20, 25]
    }
}
