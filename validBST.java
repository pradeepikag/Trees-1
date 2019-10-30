iclass Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    
    public boolean helper(TreeNode root, Integer min,Integer max){
        if(root==null) return true;
        if(((min!=null)&&(min>=root.val))||((max!=null)&&               (max<=root.val))) return false;
        //return 
        return helper(root.left,min,root.val) && helper(root.right,root.val,max);
        //return true;
    }
}
