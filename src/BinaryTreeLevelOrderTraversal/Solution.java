package BinaryTreeLevelOrderTraversal;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        queue.add(root);
        int i = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ans.add(new ArrayList<>());

            while (size > 0) {
                TreeNode u = queue.poll();
                size--;
                assert u != null;
                ans.get(i).add(u.val);
                if (u.left != null) {
                    queue.add(u.left);
                }
                if (u.right != null) {
                    queue.add(u.right);
                }
            }
            i++;

        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0,
                new TreeNode(2, new TreeNode(1, new TreeNode(5), new TreeNode(1)), null),
                new TreeNode(4, new TreeNode(3, null, new TreeNode(6)), new TreeNode(-1, null, new TreeNode(8))));
        System.out.println(levelOrder(root));
    }
}