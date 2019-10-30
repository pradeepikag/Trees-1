class Solution {
    public boolean isValidBST(TreeNode root) {
 
Stack<TreeNode> stack = new Stack<>();
    TreeNode prev=null;
    if(root==null) return true;
    //stack.push(root);
    while((root!=null)||(!stack.isEmpty())){
    while(root!=null){
        //stack.push(root);
        stack.push(root);
        root=root.left;
       
    }
    root = stack.pop();
    if((prev!=null)&&(root.val<=prev.val)) return false;
    System.out.println("Here current is"+root.val);
    if(prev!=null) System.out.println("Here previous is"+prev.val);
    
    prev=root;
    root=root.right;
    }
    return true;
}
}
