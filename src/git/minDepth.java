package git;

public class minDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2);
		a.left.left = new TreeNode(6);
		//a.left.right = new TreeNode(6);
		a.right = new TreeNode(3);
		a.right.left = new TreeNode(4);
		a.right.right = new TreeNode(5);
		a.right.right.left = new TreeNode(7);
		//a.right.right.left = new TreeNode(5);

		TreeNode aa = new TreeNode(1);
		aa.right=new TreeNode (2);
		aa.right .left = new TreeNode(3);
		
		 System.out.print( minDepth2(aa));

	}

	public static int minDepth2(TreeNode root) {
		// write your code here
		if (root  == null ) {
			return 0;
		}

		int left_min = minDepth2(root.left) + 1;
		int right_min = minDepth2(root.right) + 1;

		return Math.min( left_min, right_min);

	}
}
