
public class longestLength {
	
	public static class TreeNode 
	{  
	    int data;  
	    TreeNode left, right;  
	}
	static int height = Integer.MIN_VALUE;
	public static int diameter(TreeNode root, int height){
		if(root == null){
			return 0;
		}
		
		int lHeight = diameter(root.left, height);
		int rHeight = diameter(root.right, height);
		
		height = Math.max(height, 1+lHeight+rHeight);
		return 1 + Math.max(lHeight, rHeight);

	}
	
	public static int findDiameter(TreeNode root){
		if(root == null){
			return 0;
		}
		int result = diameter(root, height);
		return height;
		
		
	}

}
