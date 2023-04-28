package com.gl.DSA.GroupAssessment2.MySkewTree;

/**
 * @author Anupama Voruganti,megharaj,Hari Gopi Krishna,Jaimin Bhatt,Roushan kumar
 * @version 1.0
 * @since 2023-04-18
 */

/*The Main class extends the SkewTree class and defines the main method. 
 * It prompts the user to input the number of nodes in the tree and the node values. 
 * Then it inserts the nodes into the tree using the insert method, 
 * which recursively inserts the node in the correct position according to the binary search tree property.
 * */

import java.util.Scanner;

import com.gl.DSA.GroupAssessment2.node.SkewTree;

public class Main extends SkewTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of nodes in the tree: ");
		int n = sc.nextInt();

		System.out.println("Enter the node values: ");
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			insert(val);
		}

		System.out.println("Original Tree (inorder traversal): ");
		inorder(root);
		System.out.println();

		skewTree(root);
		sc.close();
	}

	public static void insert(int data) {
		root = insertNode(root, data);
	}
	/*
	 * After printing the original tree using the inorder traversal, the skewTree
	 * method is called to skew the tree. Skewing is a process of making the tree
	 * right-heavy by swapping the left and right child nodes of each node in the
	 * tree. The skewTree method first checks if the node is null,and if not, it
	 * swaps the left and right child nodes and then recursively calls itself on the
	 * right subtree.
	 */

	public static Node insertNode(Node node, int data) {
		if (node == null) {
			node = new Node(data);
			return node;
		}

		if (data < node.data)
			node.left = insertNode(node.left, data);
		else if (data > node.data)
			node.right = insertNode(node.right, data);

		return node;
	}

	/*
	 * The program outputs the original tree in the inorder traversal and does not
	 * print the skewed tree. However, the skewed tree can be printed by calling the
	 * inorder method on the root node after calling the skewTree method.
	 */
	public static void inorder(Node node) {
		if (node == null)
			return;

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	public static void skewTree(Node node) {
		if (node == null)
			return;

		if (node.left != null) {
			Node rightSubtree = node.right;
			node.right = node.left;
			node.left = null;

			Node temp = node.right;
			while (temp.right != null)
				temp = temp.right;

			temp.right = rightSubtree;
		}

		skewTree(node.right);
	}

}

/* Input
 * 
 * 
 * Enter the number of nodes in the tree: 5 
 * Enter the node values: 50 30 60 10 55
 * 
 * 
 * Output
 * 
 * 
 * Original Tree (inorder traversal): 10 30 50 55 60
 */

