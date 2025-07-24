class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class BSTKthElement {
    private static int count = 0;
    private static int result = -1;

    public static int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = -1;
        inOrder(root, k);
        return result;
    }

    private static void inOrder(TreeNode node, int k) {
        if (node == null) return;
        inOrder(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }
        inOrder(node.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        System.out.println(kthSmallest(root, 3)); // 輸出：4
    }
}
