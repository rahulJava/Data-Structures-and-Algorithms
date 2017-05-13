

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    /*
     * @Author : Arpit Mandliya
     */

	public static boolean isPresent(TreeNode root, int x) {
		if (root != null) {

			// check if current node has the element we are looking for
			if (root.data == x) {
				return true;
			} else {
				// check if the sub trees
				return isPresent(root.left, x) || isPresent(root.right, x);
			}
		}
		return false;
	}

 // Recursive Solution
 /* To get max node in a binary tree*/
 public static  int getMaximumRec(TreeNode root)
 {
  int max=Integer.MIN_VALUE;
  int value=0;
  int left = 0,right;
  if(root != null)  
  {
   value=root.data;
   System.out.println("Value:"+value);
   
   left=getMaximumRec(root.left);
    System.out.println("left value1:"+left);
   right=getMaximumRec(root.right);
   System.out.println("right:"+right);

   System.out.println();
   if(left>right)
   {
	   System.out.println("1st Condition:"+"left :"+left+" right:"+right);
    max=left;
   }
   else
   {
	   System.out.println("2nd Condition:"+"left :"+left+" right:"+right);
    max=right;
   }

   if(max < value)
   {
	   System.out.println("3rd Condition:"+"left :"+left+" right:"+value);
    max=value;
   }
  }

  return max;
 }

 // Iterative Solution
 /* To get max node in a binary tree*/
 


 public static void main(String[] args)
 {
  BinaryTree bi=new BinaryTree();
  // Creating a binary tree
  TreeNode rootNode=createBinaryTree();
 // System.out.println("Max node using recursion :"+getMaximumRec(rootNode));
  System.out.println("Does 4 exist in the tree: " + isPresent1(rootNode, 71));
 
 }
 public static boolean isPresent1(TreeNode root, int x) {
		if (root != null) {
			Queue<TreeNode> q = new LinkedList<>();
			// add root to the queue
			q.add(root);
			while (!q.isEmpty()) {
				TreeNode n = q.poll();
				// check if current node has the element we are looking for
				if (n.data == x) {
					return true;
				}
				// add children to the queue
				if (n.left != null) {
					q.add(n.left);
				}
				if (n.right != null) {
					q.add(n.right);
				}
			}
			// if reached here, means we have not found the element
			return false;
		}
		// if root is null, return false
		return false;
	}

 public static TreeNode createBinaryTree()
 {

  TreeNode rootNode =new TreeNode(40);
  TreeNode node20=new TreeNode(20);
  TreeNode node10=new TreeNode(10);
  TreeNode node30=new TreeNode(30);
  TreeNode node60=new TreeNode(60);
  TreeNode node50=new TreeNode(50);
  TreeNode node70=new TreeNode(70);

  rootNode.left=node20;
  rootNode.right=node60;

  node20.left=node10;
  node20.right=node30;

  node60.left=node50;
  node60.right=node70;

  return rootNode;
 }
}