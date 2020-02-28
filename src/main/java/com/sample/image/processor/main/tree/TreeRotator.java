package com.sample.image.processor.main.tree;

/**
 * 
 * Here are the main two feature required for self balancing tree
 * 
 * @author sanjibpramanick
 *
 */
public class TreeRotator {

	public static BNode rotateRight(BNode currentNode) {
		BNode left = currentNode.getLeft();
		BNode temp = left.getRight();

		// rotation
		left.setRight(currentNode);
		currentNode.setLeft(temp);

		return left;
	}

	public static BNode rotateLeft(BNode currentNode) {
		BNode right = currentNode.getRight();
		BNode temp = right.getLeft();

		// rotation
		right.setLeft(currentNode);
		currentNode.setRight(temp);

		return right;
	}

}
