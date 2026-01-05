package TreeDs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeQuestions01 {
     static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode(int val) {
             this.val = val;
         }

         // Height of binary tree
         public int height(TreeNode root) {
             if (root == null)
                 return 0;
             if (root.left == null && root.right == null)
                 return 0;

             int leftHeight = 1 + height(root.left);
             int rightHeight = 1 + height(root.right);
             return Math.max(leftHeight, rightHeight);
         }

         // Levels in a binary tree
         public int levels(TreeNode root) {
             return 1 + height(root);
         }

         // Lowest Common Ancestors leet-code 236
         public boolean contains(TreeNode root, TreeNode node) {
             // This function checks whether the node present in the tree or not
             if (root == null)
                 return false;
             if (root == node)
                 return true;
             return contains(root.left, node) || contains(root.right, node);
         }

         public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
             if (p == root || q == root) return root;
             if (p == q) return p;
             boolean leftp = contains(root.left, p);
             boolean rightq = contains(root.right, q);
             if ((leftp && rightq) || (!leftp && !rightq)) return root;
             if (leftp && !rightq) return lowestCommonAncestor(root.left, p, q);
             if (!leftp && rightq) return lowestCommonAncestor(root.right, p, q);
             return root;
         }

         //===========================================================================================================
         // is same tree leetcode 100

         public boolean isSameTree(TreeNode p, TreeNode q) {
             if (p == null && q == null) return true;
             if (p == null || q == null) return false;

             if (p.val != q.val) return false;
             return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

         }

         // Leet-code 226 Invert Binary Trees==========================================================
         public TreeNode invertTree(TreeNode root) {
             if (root == null ||(root.left ==  null && root.right == null))
                 return root;
             TreeNode temp = root.left;
             root.left = root.right;
             root.right = temp;

             root.left = invertTree(root.left);
             root.right = invertTree(root.right);
             return root;

         }

         public TreeNode invertTrees(TreeNode root) {
             if (root == null ||(root.left ==  null && root.right == null))
                 return root;
              TreeNode left = root.left;
              TreeNode right = root.right;


             root.left = invertTree(right);
             root.right = invertTree(left);
             return root;

         }

         //======================================================================================

         // leet-code 101 - symmetric tree or not
         // Invert the left subTree or right subTree step 1
         // checks if left subtree or right  subtree is same or not step 2;

         public boolean isSymmetric(TreeNode root) {
             if (root == null)
                 return true;
             root.left = invertTree(root.left);
             return isSameTree(root.left , root.right);

         }
     }
    // Leet-code 102.....
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size(); // number of nodes at this level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            ans.add(level);
        }

        return ans;
    }


    public static void main(String[] args) {

        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(12);
        TreeNode c = new TreeNode(13);
        TreeNode d = new TreeNode(56);
        TreeNode e = new TreeNode(32);
        TreeNode f = new TreeNode(48);
        TreeNode g = new TreeNode(42);
        TreeNode h = new TreeNode(89);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;

    }
}
