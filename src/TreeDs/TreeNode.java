package TreeDs;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
    // Tree traversal DFS
    // PreOrder Traversal
    public static  void preOrder(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // inOrder Traversal
    public static void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    // postOrder Traversal

    public static void postOrder(TreeNode root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    // Level Order Traversal
    public static void levelOrder(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.val+"->");
        if(root.left != null)
            System.out.print(root.left.val+",");
        else
            System.out.print(" null");
        if(root.right != null)
            System.out.print(root.right.val+",");
        else
            System.out.print(" null ");
        System.out.println();
        levelOrder(root.left);
        levelOrder(root.right);

    }

    // BFS - Level Order traversal
    public static void BFS(TreeNode root){
        if (root == null)
            return;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            TreeNode temp = q.element();
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }

    public  static int  height(TreeNode root){
        if(root == null)
            return  0;
        if(root.left == null && root.right == null)
            return 0;

//        int leftHeight = 1 + height(root.left);
//        int rightHeight = 1 + height(root.right);
//        int maxHeight = Math.max(leftHeight, rightHeight);
//        return maxHeight;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    // levels in Binary tree
    public static int levels(TreeNode root) {
        return height(root) + 1;
    }

    // find maximum value in tree
    public static int  maxEle(TreeNode root){
        if (root == null)
            return Integer.MIN_VALUE;
        int leftVal = maxEle(root.left);
        int rightVal = maxEle(root.right);
        int maxVal = Math.max(root.val , Math.max(leftVal , rightVal) );
        return maxVal;
    }

    // find minimum value in tree...
    public static int  minEle(TreeNode root){
        if (root == null)
            return Integer.MAX_VALUE;
        int leftVal = minEle(root.left);
        int rightVal = minEle(root.right);
        int minVal = Math.min(root.val , Math.min(leftVal , rightVal) );
        return minVal;
    }

    // sum of the node in a tree
    public static int treeSum(TreeNode root){
        if(root == null)
            return 0;
        return root.val + treeSum(root.left) + treeSum(root.right);

    }
    //product of tree
    public static int treeProduct(TreeNode root){
        if(root == null)
            return 1;
        return root.val * treeSum(root.left) * treeSum(root.right);

    }

    // print nth level
    public static void printNthLevel(TreeNode root , int level){
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.val+" ");
        printNthLevel(root.left , level-1);
        printNthLevel(root.right , level-1);
    }

    //level order traversal 2
    public static void printLevelWise(TreeNode root){
        int level = levels(root);
        for (int i = 0; i <= level; i++) {
            printNthLevel(root , i);
        }
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

//        System.out.println(a.val);
//        preOrder(a);
//        inOrder(a);
//        postOrder(a);
//        levelOrder(a);
//        BFS(a);
//        System.out.println(height(a));
//        System.out.println(levels(a));
//        System.out.println();
//        System.out.println(maxEle(a));
//        System.out.println(minEle(a));
//        System.out.println(treeSum(a));
//        System.out.println(treeProduct(a));
        printLevelWise(a);



    }
}
