package com.gl.DSA.GroupAssessment2.node;

/* implements a Skew Tree, which is a self-balancing binary search tree.
 *  It uses an abstract class called SkewTree which contains a nested static class called Node
 *  that represents a node in the tree. The Node class has three fields: an integer data field, 
 *  and two Node references for the left and right child nodes.*/

public abstract class SkewTree {

	public static Node root;

	public static class Node {
		public int data;
		public Node left;
		public Node right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
}
