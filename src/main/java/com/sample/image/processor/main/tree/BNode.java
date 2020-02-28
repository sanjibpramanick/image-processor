package com.sample.image.processor.main.tree;

public class BNode {

	private int value;

	private BNode left;

	private BNode right;

	public BNode(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BNode getLeft() {
		return left;
	}

	public void setLeft(BNode left) {
		this.left = left;
	}

	public BNode getRight() {
		return right;
	}

	public void setRight(BNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "\n[" + value + ", left=" + left + ", right=" + right + "]";
	}

	
	
}
