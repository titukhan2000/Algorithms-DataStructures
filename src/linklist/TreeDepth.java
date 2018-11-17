package linklist;

//Java program to find height of tree



public class TreeDepth 
{
  Node root;

 /* Compute the "maxDepth" of a tree -- the number of 
    nodes along the longest path from the root node 
    down to the farthest leaf node.*/
 int maxDepth(Node node) 
 {
     if (node == null)
         return 0;
     else
     {
         /* compute the depth of each subtree */
         int lDepth = maxDepth(node.prev);
         int rDepth = maxDepth(node.next);

         /* use the larger one */
         if (lDepth > rDepth)
             return (lDepth + 1);
          else
             return (rDepth + 1);
     }
 }
   
 /* Driver program to test above functions */
 public static void main(String[] args) 
 {
     TreeDepth tree = new TreeDepth();

     tree.root = new Node(1);
     tree.root.prev = new Node(2);
     tree.root.next = new Node(3);
     tree.root.prev.prev = new Node(4);
     tree.root.prev.next = new Node(5);

     System.out.println("Height of tree is : " + 
                                   tree.maxDepth(tree.root));
 }
}

//This code has been cpontributed by Mayank Jaiswal(mayank_24)
