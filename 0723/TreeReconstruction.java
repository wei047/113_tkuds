import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeReconstruction {
    public static TreeNode buildTree(int[] inorder, int[] preorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            inMap.put(inorder[i], i);
        return helper(preorder, 0, preorder.length - 1, 0, inMap);
    }

    private static TreeNode helper(int[] preorder, int preStart, int preEnd, int inStart, Map<Integer, Integer> inMap) {
        if (preStart > preEnd) return null;

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int inIndex = inMap.get(rootVal);
        int leftSize = inIndex - inStart;

        root.left = helper(preorder, preStart + 1, preStart + leftSize, inStart, inMap);
        root.right = helper(preorder, preStart + leftSize + 1, preEnd, inIndex + 1, inMap);
        return root;
    }

    public static void printInOrder(TreeNode node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] preorder = {3, 9, 20, 15, 7};
        TreeNode root = buildTree(inorder, preorder);
        printInOrder(root); // 輸出：9 3 15 20 7
    }
}
