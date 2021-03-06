/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import node.TreeNode;

/***
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 */
public class Test19 {

    public void mirror(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null) {
            mirror(root.left);
        }
        if (root.right != null) {
            mirror(root.right);
        }
    }
}
