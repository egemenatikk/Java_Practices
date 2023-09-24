import java.io.*;
import java.util.*;

class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    
	    // if both nodes are null, return true since we always move synchronously with two trees
	    if (root1 == null && root2 == null) return true;
	    
	    // if only one of them is null, return false
	    if (root1 == null || root2 == null) return false;
	    
	    // if they are not null but their values are different, again return false
	    if (root1.data != root2.data) return false;
	    
	    // if they are not null and their values are same, then check for their left and right subtrees 
	    return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	    
	}
	
}