class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class BSTConversion {
    private static TreeNode prev = null;
    private static TreeNode head = null;

    public static TreeNode bstToDoublyList(TreeNode root) {
        if (root == null) return null;
        inorder(root);
        return head;
    }

    private static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);

        if (prev == null) {
            head = node;
        } else {
            prev.right = node;
            node.left = prev;
        }
        prev = node;

        inorder(node.right);
    }

    public static void printList(TreeNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode listHead = bstToDoublyList(root);
        printList(listHead); // 輸出：1 2 3 4 5
    }
}
