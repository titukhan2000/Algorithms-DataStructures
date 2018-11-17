package Preparation;

public class BTKthLargest {
	Node root;
	public static void main(String args[]){
		
		BTKthLargest tree=new BTKthLargest();
		
		tree.root = new Node(50);
        tree.root.left = new Node(20);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(22);
        tree.root.left.left.left = new Node(12);
        kthLargestUtil(tree.root, 1, 0);
	}
	
	static void kthLargestUtil(Node root, int k, int c)
	{
	    // Base cases, the second condition is important to
	    // avoid unnecessary recursive calls
	    if (root == null || c >= k)
	        return;
	 
	    // Follow reverse inorder traversal so that the
	    // largest element is visited first
	    
	    kthLargestUtil(root.right, k, c);
	 
	    // Increment count of visited nodes
	    c++;
	 
	    // If c becomes k now, then this is the k'th largest 
	    if (c == k)
	    {
	        System.out.println("K'th largest element is "+ root.data);
	        return;
	    }
	 
	    // Recur for left subtree
	    kthLargestUtil(root.left, k, c);
	}
}
