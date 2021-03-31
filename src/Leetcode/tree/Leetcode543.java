package Leetcode.tree;

public class Leetcode543 {
    static int ans; //设定一个全局变量

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        root.left = n1;
        root.right = n2;
        root.left.left = n3;
        root.left.right = n4;
        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans;
    }

    //计算以node为根节点的深度(垂直节点个数)
    public static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int L, R;
        L = depth(node.left); //左儿子为根的子树的深度
        R = depth(node.right); //右儿子为根的子树的深度

        //统计最长直径长度
        ans = Math.max(L + R, ans);

        //返回深度为子树最大深度+根节点的1
        return Math.max(L, R) + 1;

    }
}
