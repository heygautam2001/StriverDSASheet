package TreeDs;

import java.util.ArrayList;
import java.util.List;

//leet-code 257
public class BinaryTreePath {
    public void helper(TreeNode root, List<String> ans, String str){
        if(root == null) return;
        if(root.left == null && root.right == null){
            str += root.val;
            ans.add(str);
            return;
        }
        helper(root.left,ans,str+root.val+"->");
        helper(root.right,ans,str+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }

}
