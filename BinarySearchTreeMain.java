package com.bridgelabz.day15;

public class BinarySearchTreeMain {
	
	public static void main(String[] args) {
		
		 BinaryTree<Integer> myBinaryTree = new BinaryTree();
	        myBinaryTree.add(56);
	        myBinaryTree.add(30);
	        myBinaryTree.add(70);
	        myBinaryTree.add(56);
	        myBinaryTree.add(30);
	        myBinaryTree.add(70);
	        myBinaryTree.add(22);
	        myBinaryTree.add(40);
	        myBinaryTree.add(11);
	        myBinaryTree.add(3);
	        myBinaryTree.add(16);
	        myBinaryTree.add(60);
	        myBinaryTree.add(95);
	        myBinaryTree.add(65);
	        myBinaryTree.add(63);
	        myBinaryTree.add(67);
	        int size = myBinaryTree.getSize();
	        System.out.println( myBinaryTree + "Size is : "+size);

	        System.out.println("Size is : " + size);

	    }
	}