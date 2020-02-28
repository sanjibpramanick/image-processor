package com.sample.image.processor.main.tree;

public class BTree {

	private BNode root;

	public BNode getRoot() {
		return root;
	}

	public void setRoot(BNode root) {
		this.root = root;
	}

	private BNode addRecursive(BNode current, int value) {
		if (current == null) {
			return new BNode(value);
		}

		if (value < current.getValue()) {
			current.setLeft(addRecursive(current.getLeft(), value));
		} else if (value > current.getValue()) {
			current.setRight(addRecursive(current.getRight(), value));
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void add(int value) {
		this.root = addRecursive(root, value);
	}

	@Override
	public String toString() {
		return "BTree [root=" + root + "]";
	}

	public boolean isBalanced(BNode node) {
		int lh; /* for height of left subtree */

		int rh; /* for height of right subtree */

		/* If tree is empty then return true */
		if (node == null)
			return true;

		/* Get the height of left and right sub trees */
		lh = TreeUtil.height(node.getLeft());
		rh = TreeUtil.height(node.getRight());

		if (Math.abs(lh - rh) <= 1 && isBalanced(node.getLeft()) && isBalanced(node.getRight()))
			return true;

		/* If we reach here then tree is not height-balanced */
		return false;
	}

}
