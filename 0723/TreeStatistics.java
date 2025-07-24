class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeStatistics {
    // 1. 所有節點總和
    public static int sum(TreeNode root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    // 2. 最大值
    public static int max(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    // 2. 最小值
    public static int min(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    // 3. 節點數量
    public static int count(TreeNode root) {
        if (root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }

    // 4. 樹的高度
    public static int height(TreeNode root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        // 測試用樹：
        //       10
        //      /  \
        //     5    15
        //         / \
        //        12  20
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        System.out.println("節點總和: " + sum(root));         // 62
        System.out.println("最大值: " + max(root));           // 20
        System.out.println("最小值: " + min(root));           // 5
        System.out.println("節點數量: " + count(root));       // 5
        System.out.println("樹的高度: " + height(root));      // 2
    }
}
