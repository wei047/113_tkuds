class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeDistance {
    public static int distance(TreeNode root, int p, int q) {
        TreeNode lca = findLCA(root, p, q);
        return depth(lca, p, 0) + depth(lca, q, 0);
    }

    private static TreeNode findLCA(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) return root;
        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    private static int depth(TreeNode root, int target, int level) {
        if (root == null) return -1;
        if (root.val == target) return level;
        int left = depth(root.left, target, level + 1);
        if (left != -1) return left;
        return depth(root.right, target, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        System.out.println(distance(root, 6, 4)); // 輸出 4（6→5→2→4）
    }
}
