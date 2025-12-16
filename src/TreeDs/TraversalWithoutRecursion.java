package TreeDs;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TraversalWithoutRecursion {

}
class solution{
    public List<Integer> preOrder(TreeNode root){
        List<Integer> preOrder = new ArrayList<>();
        if(root == null)
            return preOrder;

        Stack <TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            root = st.pop();
            preOrder.add(root.val);
            if(root.right != null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }

        }
        return preOrder;
    }

    public List<Integer> inOrder(TreeNode root){
        List<Integer> inOrder = new ArrayList<>();
        Stack <TreeNode> st = new Stack<>();
        TreeNode node = root;
        while (true){
            if(node != null){
                st.push(node);
                node = node.left;
            }
           else{
               if(st.isEmpty()){
                   break;
               }
               node = st.pop();
               inOrder.add(node.val);
               node= node.right;
           }
        }
        return inOrder;
    }


}
